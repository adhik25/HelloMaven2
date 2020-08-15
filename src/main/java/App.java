import org.pmw.tinylog.Logger;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Maven 2");
        Logger.info("Hold me closer tiny logger");
        for (int i = 0; i < 2; i++) {
            System.out.println("Hello Maven 2");
        }
    }
}
