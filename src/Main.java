public class Main {
    public static void main(String[] args) {

        Logger logger = new Logger();
        logger.logInfo("Программа запущена");

        DatabaseService dbService = new DatabaseService();
        dbService.connect();

        LoggingService logService = new LoggingService();
        logService.logToDatabase("Test log");


        int[] numbers = {1, -2, 3, 0};
        NumberProcessor processor = new NumberProcessor();
        processor.printPositiveNumbers(numbers);
        System.out.println("Divide 10/2 = " + processor.divide(10, 2));
        System.out.println("Divide 10/0 = " + processor.divide(10, 0));


        User user = new User("Жансая", "example@mail.com");
        user.saveToDatabase();

        FileReader reader = new FileReader();
        System.out.println(reader.readFile("example.txt"));

        ReportGenerator report = new ReportGenerator();
        report.generatePdfReport();

        logger.logInfo("Программа аяқталды!л");
    }
}
