public class Logger {

    public void log(String level, String message) {
        System.out.println(level.toUpperCase() + ": " + message);
    }

    public void logError(String message) {
        log("ERROR", message);
    }

    public void logWarning(String message) {
        log("WARNING", message);
    }

    public void logInfo(String message) {
        log("INFO", message);
    }
}
