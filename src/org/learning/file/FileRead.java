package org.learning.file;

import java.io.*;

public class FileRead {

		public static void main(String[] args) throws IOException{
			
			  /*File f = new File("C:\\Users\\rk\\Desktop\\Test1.txt");
			  f.createNewFile();
			  FileWriter fs = new FileWriter("C:\\Users\\rk\\Desktop\\Test1.txt");
			  BufferedWriter br = new BufferedWriter(fs);
			  br.write("one");
			  br.newLine();
			  br.write("two");
			  br.newLine();
			  br.flush();*/
			
			  FileReader fs = new FileReader("C:\\Users\\rk\\Desktop\\Test1.txt");
			  BufferedReader br = new BufferedReader(fs);
			  
			  String i=null;
			  while((i=br.readLine())!=null){
				  System.out.println(i);
			  }
			  
          
		}


}

