public class Unstable extends RuntimeException {
    public Unstable() {
    }

    public Unstable(String message) {
        super(message);
    }

    public Unstable(String message, Throwable cause) {
        super(message, cause);
    }
}
