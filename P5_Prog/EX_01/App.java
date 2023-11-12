package EX_01;

public class App {
    public class NegativeNumberException extends Exception {
    
        public NegativeNumberException() {
            super();
        }
    
        public NegativeNumberException(String message) {
            super(message);
        }
    }
    
}
