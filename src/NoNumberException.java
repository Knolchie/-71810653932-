public class NoNumberException extends Exception {

    public void printStackTrace() {

        System.err.println("NoNumberException: Keine Zahl!");

    }
}
