package Networking;

import java.io.*;
import java.net.*;

public class Tcpserver
{
    public static void main(String args[]) throws Exception
    {
        String str;
        ServerSocket ss=new ServerSocket(3333);
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            String test="";
            str=dis.readUTF();
            for(int i=str.length()-1;i>=0;i--)
            {
                test=test+str.charAt(i);
            }
            dos.writeUTF(test);
            if("end".equalsIgnoreCase(str))
                break;
            dos.flush();
        }
    }
}
