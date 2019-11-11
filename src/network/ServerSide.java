package network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSide {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket server = new ServerSocket();
        server.setReuseAddress(true);
        server.bind(new InetSocketAddress("localhost", 12345));

        Socket socket = server.accept();
        System.out.println("Client connected");
//        Scanner input = new Scanner(socket.getInputStream());
//        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
//        String value = input.nextLine();
//        output.writeBytes(value + "\n");
        InputThread inputThread = new InputThread(socket);
        OutputThread outputThread = new OutputThread(socket);
        inputThread.start();
        outputThread.start();

        inputThread.join();
        outputThread.join();

        socket.close();


        server.close();
    }
}
