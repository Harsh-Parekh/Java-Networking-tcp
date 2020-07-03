import java.io.*;
import java.net.*;
class Encdyc_client{
	public static void main(String args[]) throws Exception
	{
		Socket s=new Socket("localhost",1024);
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("1 Encrypt ");
			System.out.println("2 Decrypt ");
			System.out.println("3 Exit ");
			System.out.println("enter choice :");
			String c=br.readLine();
			int ch=Integer.parseInt(c);
			if (ch==1)
			{
				String md="1";
				dos.writeUTF(md);
				System.out.println("Encrypt...");
				System.out.println("Enter enyc key :");
				String ky=br.readLine();
				System.out.println("Enter roll :");
				String en=br.readLine();
				System.out.println("Enter name :");
				String nm=br.readLine();
				dos.writeUTF(ky);
				dos.writeUTF(en);
				dos.writeUTF(nm);
				String reten=dis.readUTF();
				String retnm=dis.readUTF();
				System.out.println("Ency roll :"+reten+" Ency name :"+retnm);
			}
			else if (ch==2)
			{
				String md="2";
				dos.writeUTF(md);
				System.out.println("Decrypt...");
				System.out.println("Enter decy key :");
				String ky=br.readLine();
				System.out.println("Enter roll :");
				String en=br.readLine();
				System.out.println("Enter name :");
				String nm=br.readLine();
				dos.writeUTF(ky);
				dos.writeUTF(en);
				dos.writeUTF(nm);
				String reten=dis.readUTF();
				String retnm=dis.readUTF();
				System.out.println("Decy roll :"+reten+" Decy name :"+retnm);
			}
			else if (ch==3)
			{
				String md="3";
				dos.writeUTF(md);
				break;
			}
		}
	}
}