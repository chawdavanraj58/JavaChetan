package com.phoenix.demos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientCode {

	Socket s;
	DataInputStream clientIncoming;
	DataOutputStream clientOutgoing;
	
	public ClientCode() {
		// TODO Auto-generated constructor stub
		try {
			s=new Socket(InetAddress.getByName("localhost"),20000);
			clientIncoming=new DataInputStream(s.getInputStream());
			clientOutgoing=new DataOutputStream(s.getOutputStream());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClientCode client=new ClientCode();
		Scanner sc=new Scanner(System.in);
		String xferData=sc.nextLine();
		try {
			client.clientOutgoing.writeUTF(xferData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
