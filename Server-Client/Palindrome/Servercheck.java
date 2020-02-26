package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String args[]) throws Exception {

        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        String clientstring = dis.readUTF();
        String reverse = "";

        for (int i = clientstring.length() - 1; i >= 0; i--)
        {
            reverse=reverse+clientstring.charAt(i);
        }

        if(clientstring.equals(reverse))
        {
            dos.writeUTF("PALINDROME");
        }
        else
        {
            dos.writeUTF("NOT PALINDROME");
        }
    }
}
