package com.phoenix.demos;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoTheFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileWriter
		
		File file=new File("filename.txt");
		//FileOutputStream fout=null;
		try(FileOutputStream fout=new FileOutputStream(file);
				BufferedOutputStream bout=new BufferedOutputStream(fout);
				DataOutputStream dout=new DataOutputStream(bout)) {
			if(!file.exists()) 
			{
				String value="This goes into the file";
				//Byte[] valueToBeStored=
				
				dout.write(97);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
