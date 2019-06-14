package test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis ();
		try{
			
            File file = new File("doc/test.docx");
            
            FileReader filereader = new FileReader(file);
            
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            while((line = bufReader.readLine()) != null){
                System.out.println(line);
            }            
            bufReader.close();
        }catch (FileNotFoundException e) {
        	
        }catch(IOException e){
            System.out.println(e);
        }
		long time2 = System.currentTimeMillis ();
		System.out.println(time2-time1);


	}

}
