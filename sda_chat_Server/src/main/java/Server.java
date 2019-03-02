import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BufferedReader clientInput;
    private PrintWriter output;
    private static final String EXIT_KEY = "quit";


    public void startServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Server is running");

        clientSocket = serverSocket.accept();
        System.out.println("Client has been connected");

        clientInput = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

//        while (true) {
//            String receivedMsg=clientInput.readLine();
//            if(user)
//        }

        System.out.println(clientInput.readLine());

        //clientInput = new PrintWriter(clientSocket.getOutputStream(), true);

        output.println("Ok, got it");
//        while (!clientSocket.isClosed() && !clientSocket.isInputShutdown()) {//jest wlaczony
//            clientSocket.getInputStream().read();
//        }
//
//        System.out.println("Client has been disconnected");

    }
}