package Chatapp;

import java.io.*;
import java.net.*;

class Client{
	public static void main(String args[]) throws Exception{
		Socket s=new Socket("localhost",3333);
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String str=dis.readUTF();
		System.out.println("DATE :"+str);
		s.close();
	}
}
