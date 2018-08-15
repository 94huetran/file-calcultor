import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter path of file: ");
        String path = input.nextLine();
        FileCalculator fileCalculator = new AdapterFile();
        Client client = new Client(fileCalculator);
        client.printFileSize(path);
    }
}
