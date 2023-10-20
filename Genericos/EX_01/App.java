package Genericos.EX_01;

import java.util.LinkedList;

public class App<T> {
    private LinkedList<T> list;

    public App() {
        list = new LinkedList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public T removeFirst() {
        T firstElement = list.getFirst();
        list.removeFirst();
        return firstElement;
    }

    public T getFirst() {
        return list.getFirst();
    }

    public void add(T element) {
        list.addFirst(element);
    }

    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        App<Integer> app = new App<>();
        app.add(1);
        app.add(2);
        app.add(3);

        System.out.println("Lista: " + app.toString());
        System.out.println("¿Está vacía? " + app.isEmpty());
        System.out.println("Primer elemento: " + app.getFirst());
        int removedElement = app.removeFirst();
        System.out.println("Elemento eliminado: " + removedElement);
        System.out.println("Lista después de eliminar: " + app.toString());
    }
}
