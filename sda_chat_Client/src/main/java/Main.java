import java.io.IOException;
import java.net.ConnectException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Client client = new Client();

        try {
            client.connectToServer("127.0.0.1", 55555); //mozna wpisac "localhost"
        } catch (ConnectException e) {
            System.out.println("Cannot connect :(");
        }
    }

}
