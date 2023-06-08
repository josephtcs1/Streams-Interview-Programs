package InterviewQuations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromCsvFile {
public static void main(String[] args) {
	  String file="C:\\Users\\Admin\\Downloads\\joseph.csv";
	  String line="";
	  try {
		BufferedReader  br=new  BufferedReader(new FileReader(file));
              while((line=br.readLine())!=null) {
            	  String[] values=line.split(",");
            	  System.out.println("first name  "+values[1]);
              }
	  }
	  catch(FileNotFoundException e) {
		  e.printStackTrace();
		  
	  }
	  catch(IOException e) {
		  e.printStackTrace();
	  }
}
}
