package Networking;
import java.net.InetAddress;
public class Localhost
{
    public static void main(String args[]) throws Exception
    {
        InetAddress google,localhost;
        try
        {
            //it will return ip of target site
            google=InetAddress.getByName("google.com");
            System.out.println("IP of Google is:"+google);
            
            //it will return ip of localmachine
            localhost=InetAddress.getLocalHost();
            System.out.println("Local host Address:"+localhost);
            
            //it will return name of the host
            System.out.println("Name of host:"+localhost.getHostName());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
