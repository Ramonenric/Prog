package Genericos.EX_02;

public class App<T> {
    private Object[] array;
    private int size;
    
    public App(){
        array = new Object[10];
        size = 0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public T removeFirst(){
        T firstElement = getFirst();
        
        for(int i = 1; i < size;i++){
            array[i-1] = array[i];
        }

        size--;
        return firstElement;
    }

    public T getFirst(){
        return (T) array[0];
    }

    public void add(T item){
        if(size == array.length){
            Object[] newArray = new Object[size*2];

            for(int i = 0; i < size; i++){
                array[i-1] = array[i];
            }
        }

        for(int i = size; i > 0; i--){
            array[i] = array[i-1];
        }

        array[0] = item;
        size++;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(array[i]).append(", ");
        }
        sb.append(array[size - 1]).append("]");
        return sb.toString();
    }
    
    public static void main(String[] args){
        App<Integer> stack = new App<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println("Stack: " + stack);
        System.out.println("First Element: " + stack.getFirst());
        System.out.println("Removed Element: " + stack.removeFirst());
        System.out.println("Stack after removal: " + stack);
    }

}
