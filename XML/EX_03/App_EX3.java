import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class App_EX3 {
    public static void main(String[] args) {
        String xatakaUrlDelSitemap = "https://www.xataka.com/sitemap.xml";

        try {
            procesarSitemap(xatakaUrlDelSitemap, "XMLs");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void procesarSitemap(String urlDelSitemap, String carpetaDeSalida) throws IOException, Exception {
        URL url = new URL(urlDelSitemap);
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");

        BufferedReader lector = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String linea;
        while ((linea = lector.readLine()) != null) {
            respuesta.append(linea);
        }
        lector.close();

        DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
        DocumentBuilder constructor = fabrica.newDocumentBuilder();
        Document documento = constructor.parse(url.openStream());

        NodeList elementosUrl = documento.getElementsByTagName("loc");
        for (int i = 0; i < elementosUrl.getLength(); i++) {
            String urlActual = elementosUrl.item(i).getTextContent();
            System.out.println(urlActual);

            if (urlActual.endsWith("/sitemap.xml")) {
                procesarSitemap(urlActual, carpetaDeSalida);
            } else if (urlActual.endsWith(".xml")) {
                procesarSitemapNoticias(urlActual, carpetaDeSalida);
            }
        }
    }

    private static void procesarSitemapNoticias(String urlSitemapNoticias, String carpetaDeSalida) throws IOException, Exception {
        URL url = new URL(urlSitemapNoticias);
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");

        BufferedReader lector = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String linea;
        while ((linea = lector.readLine()) != null) {
            respuesta.append(linea);
        }
        lector.close();

        DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
        DocumentBuilder constructor = fabrica.newDocumentBuilder();
        Document documento = constructor.parse(url.openStream());

        NodeList elementosUrl = documento.getElementsByTagName("loc");

        if (elementosUrl.getLength() > 0) {
            String nombreArchivo = url.getFile().replaceAll("/", "_").replaceAll("\\.", "_") + ".xml";
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(carpetaDeSalida + "/" + nombreArchivo))) {
                for (int i = 0; i < elementosUrl.getLength(); i++) {
                    escritor.write(elementosUrl.item(i).getTextContent());
                    escritor.newLine();
                }
            }
        }
    }
}
