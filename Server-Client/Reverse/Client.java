package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",3333);

        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());

        String str,msg;
        Scanner o=new Scanner(System.in);
        System.out.print("Enter String :");
        str=o.next();

        dos.writeUTF(str);
        msg=dis.readUTF();

        System.out.println("Answer :"+msg);
    }
}
