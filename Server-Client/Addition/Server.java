package Networking;
import java.net.*;
import java.io.*;
public class Serveradd
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(1234);
        Socket s=ss.accept();

        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String no=dis.readUTF();
        int num=Integer.parseInt(no);
        String str=dis.readUTF();
        int a[]=new int[num];
        String[] test=str.split("#");
        for(int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(test[i]);
        }
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        String c=Integer.toString(sum);
        dos.writeUTF(c);
    }
}
