public class DatabaseService {
    public void connect() {
        String conn = DatabaseConfig.CONNECTION_STRING;
        System.out.println("Connecting to DB with: " + conn);

    }
}
