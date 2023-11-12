package EX_03;

public class App {
    public class ArrayExceptionExample {
        public static void main(String[] args) {
            int[] array = new int[5];
    
            try {
                for (int i = 0; i <= 5; i++) {
                    array[i] = i;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Se ha producido una excepción: " + e.getMessage());
            }
        }
    }
    
}
