package com.phoenix.demos;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Account act=new Account(23,"X",20000,new PersonalInfo());
			FileOutputStream fout=new FileOutputStream("serial.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			ObjectOutputStream oout=new ObjectOutputStream(bout);
			oout.writeObject(act);
			//Accoutn ref=(Account)oin.readObject();
			//bout.flush();
			oout.close();
			bout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
