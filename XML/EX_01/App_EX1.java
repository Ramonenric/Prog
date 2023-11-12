import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class App_EX1 {
    public static void main(String[] args) {
        String urlDelSitemap = "https://www.xataka.com/sitemap.xml";

        try {
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
                System.out.println(elementosUrl.item(i).getTextContent());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
