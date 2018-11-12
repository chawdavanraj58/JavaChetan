package com.phoenix.demos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCode {

	Socket s;
	ServerSocket server;
	DataInputStream serverIncoming;
	DataOutputStream serverOutgoing;
	
	public ServerCode() {
		// TODO Auto-generated constructor stub
		
		try {
			server=new ServerSocket(1521);
			s=server.accept();
			serverIncoming=new DataInputStream(s.getInputStream());
			serverOutgoing=new DataOutputStream(s.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		ServerCode serv=new ServerCode();
		try {
			while(true)
			{
				if(serv.serverIncoming.available()>0)
				{
					System.out.println(serv.serverIncoming.readUTF());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}

