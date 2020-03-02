package Chatapp;

import java.io.*;
import java.net.*;

public class Tcpserver
{
    public static void main(String args[]) throws Exception
    {
        String str;
        
        ServerSocket ss=new ServerSocket(3333);
        Socket s=ss.accept();
        System.out.println("connected");
        
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            str=dis.readUTF();
            System.out.println("Client say: "+str);
            if("end".equalsIgnoreCase(str))
                break;
            System.out.println("Say something");
            str=br.readLine();
            dos.writeUTF(str);
            dos.flush();
            if("end".equalsIgnoreCase(str))
                break;
        }
    }
}
