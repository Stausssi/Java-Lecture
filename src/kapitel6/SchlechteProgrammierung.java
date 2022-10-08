package kapitel6;

public class SchlechteProgrammierung extends Exception {
    public SchlechteProgrammierung() {
    }

    public SchlechteProgrammierung(String message) {
        super(message);
    }

    public SchlechteProgrammierung(String message, Throwable cause) {
        super(message, cause);
    }

    public SchlechteProgrammierung(Throwable cause) {
        super(cause);
    }

    public SchlechteProgrammierung(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
