package Chatapp;
import java.io.*;
import java.net.*;
public class Tcpclient
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket(InetAddress.getLocalHost(),3333);
        System.out.println("connected");
        
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        while (true)
        {
            System.out.println("Say something");
            String str=br.readLine();
            dos.writeUTF(str);
            dos.flush();
            if("end".equalsIgnoreCase(str))
                break;
            str=dis.readUTF();
            System.out.println("Server say: "+str);
        }
    }
}
