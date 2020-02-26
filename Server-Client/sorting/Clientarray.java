package Networking;
import java.io.*;
import java.net.*;
public class Arrayclient
{
    public static void main(String args[]) throws Exception
    {
        //Connection using Socket with Server
        Socket s=new Socket("localhost",1024);
        
        //for sending and receiving data 
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
        
        
        String arrayele[]=new String[10];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter elements :");
        
        for (int i=0;i<arrayele.length;i++)
        {
            arrayele[i]=br.readLine();
            dos.writeUTF(arrayele[i]);
        }
        
        System.out.print("Sorted array :");
        for (int i=0;i<arrayele.length;i++)
        {
            System.out.print(dis.readUTF()+" ");
        }
    }
}
