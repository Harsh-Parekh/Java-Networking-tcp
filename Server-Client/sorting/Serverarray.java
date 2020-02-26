package Networking;
import java.net.*;
import java.io.*;
public class Arrayserver
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(1024);
        Socket s=ss.accept();
        
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        
        int str[]=new int[10];
        
        for (int i=0;i<str.length;i++)
        {
            str[i] = Integer.parseInt(dis.readUTF());
        }
        
        for (int j=0;j<str.length;j++) {
            for (int k = 0; k < str.length - 1; k++) {
                if (str[k] > str[k + 1]) {
                    int temp = str[k];
                    str[k] = str[k + 1];
                    str[k + 1] = temp;
                }
            }
        }
        
        String sending;
        for(int r=0;r<str.length;r++) {
            sending = Integer.toString(str[r]);
            dos.writeUTF(sending);
        }
    }
}
