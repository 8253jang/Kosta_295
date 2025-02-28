package ch11.ex08;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
   public static void main(String[] args) {
	   /*FileReader fr =null;
	   try {
		   fr = new FileReader("test.txt");
		   fr.read();
		  // fr.close();
	   }catch (Exception e) {
		  e.printStackTrace();
	  }finally {
		  try {
		    fr.close();
		  }catch (Exception e) {
			
		}
	  }*/
	   
	   ////////////////////////////////////////
	   
	   try(FileReader fr =new FileReader("test.txt");) {
		   
		   fr.read();
		  
	   }catch (Exception e) {
		  e.printStackTrace();
	  }
	   
   }
}

	   
	   
	   
	   
	   
	   
	   