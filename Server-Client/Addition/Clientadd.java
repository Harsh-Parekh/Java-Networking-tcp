package Networking;

import java.io.*;
import java.net.*;
public class Clientadd
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",1234);
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.print("Enter total numbers:");
        String no=br.readLine();
        dos.writeUTF(no);

        System.out.print("Enter int and end with # example if u have 3 elements 52#2#13# and after it press enter:");
        str=br.readLine();
        dos.writeUTF(str);
        String sum=dis.readUTF();
        System.out.println("Sum is :"+sum);
    }
}
