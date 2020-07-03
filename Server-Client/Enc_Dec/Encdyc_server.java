import java.io.*;
import java.net.*;
class Encdyc_server
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(1024);
		Socket s=ss.accept();
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String md=dis.readUTF();
			if (md.equals("1"))
			{
				String reten="";
				String retnm="";
				String ky=dis.readUTF();
				String en=dis.readUTF();
				String nm=dis.readUTF();
				int key=Integer.parseInt(ky);
				int roll=Integer.parseInt(en);
				System.out.println(key+" "+roll+" "+nm);
				while (roll!=0)
				{
					int a=roll%10;
					int temp=a+key;
					reten+=Integer.toString(temp);
					roll/=10;
				}

				StringBuffer sb=new StringBuffer(reten);
				sb.reverse();
				String retenn=sb.toString();
				for (int i=0;i<nm.length();i++)
				{
					int ASCII = (int)(nm.charAt(i));
					int temp=ASCII+key;
					char ctemp=(char)temp;
					retnm+=ctemp;
				}
				dos.writeUTF(retenn);
				dos.writeUTF(retnm);
			}
			else if (md.equals("2"))
			{
				String reten="";
				String retnm="";
				String ky=dis.readUTF();
				String en=dis.readUTF();
				String nm=dis.readUTF();
				int key=Integer.parseInt(ky);
				int roll=Integer.parseInt(en);
				System.out.println(key+" "+roll+" "+nm);
				while (roll!=0)
				{
					int a=roll%10;
					int temp=a-key;
					reten+=Integer.toString(temp);
					roll/=10;
				}

				StringBuffer sb=new StringBuffer(reten);
				sb.reverse();
				String retenn=sb.toString();
				for (int i=0;i<nm.length();i++)
				{
					int ASCII = (int)(nm.charAt(i));
					int temp=ASCII-key;
					char ctemp=(char)temp;
					retnm+=ctemp;
				}
				dos.writeUTF(retenn);
				dos.writeUTF(retnm);
			}
			else if(md.equals("3"))
			{
				break;
			}
		}
	}
}