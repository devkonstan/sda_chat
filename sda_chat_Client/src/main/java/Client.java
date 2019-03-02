import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private PrintWriter output;
    private BufferedReader input;
    private static final String EXIT_KEY = "quit";


    public void connectToServer(String ipAdress, int port) throws IOException {
        socket = new Socket(ipAdress, port);

        output = new PrintWriter(socket.getOutputStream(), true);

//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            String userInput = sc.next();
//
//            if (userInput.toLowerCase().equals(EXIT_KEY))
//                break;
//            output.println(userInput);
//        }

        output.println("Hello");

        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.println(input.readLine());
    }
}
