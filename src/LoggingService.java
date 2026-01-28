public class LoggingService {
    public void logToDatabase(String message) {
        String conn = DatabaseConfig.CONNECTION_STRING;
        System.out.println("Logging to DB: " + message);

    }
}
