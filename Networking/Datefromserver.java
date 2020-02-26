package Chatapp;

import java.io.*;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

class Server{
	public static void main(String args[]) throws Exception{
		Date d=new Date();

		ServerSocket ss=new ServerSocket(3333);
		Socket s=ss.accept();

		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String date=dateFormat.format(d);

		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		dos.writeUTF(date);
	}
}
