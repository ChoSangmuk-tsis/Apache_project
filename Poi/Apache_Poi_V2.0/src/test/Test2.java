package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		
		long time1 = System.currentTimeMillis ();
		try {
			File file = new File("doc/test.txt");
			FileInputStream fis = new FileInputStream(file);
			int ch;

			while (fis.available() > 0) {
				ch =  fis.read();
				System.out.print((char)ch);
			}
			
			fis.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			System.out.println(e);
		}
		long time2 = System.currentTimeMillis ();
		System.out.println("FileInputStream : "+ (time2-time1)+"\n\n\n\n");
	

		time1 = System.currentTimeMillis ();
		try {
			File file = new File("doc/test.txt");
            FileReader filereader = new FileReader(file);
			int ch = 0;

			while (ch != -1) {
				ch =  filereader.read();
				System.out.print((char)ch);
			}
			
			filereader.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			System.out.println(e);
		}
		time2 = System.currentTimeMillis ();
		System.out.println("filereader : "+ (time2-time1)+"\n\n\n\n");
		
		
		
		time1 = System.currentTimeMillis ();
		try{
            File file = new File("doc/test.txt");
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
		time2 = System.currentTimeMillis ();
		System.out.println("BufferedReader.readLine : "+ (time2-time1)+"\n\n\n\n");
		
		time1 = System.currentTimeMillis ();
		try{
            File file = new File("doc/test.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(filereader);
            int ch;
            while((ch = bufReader.read()) != -1){
                System.out.print((char) ch);
            }         
            bufReader.close();
        }catch (FileNotFoundException e) {
        }catch(IOException e){
            System.out.println(e);
        }
		time2 = System.currentTimeMillis ();
		System.out.println("BufferedReader.read : "+ (time2-time1)+"\n\n\n\n");
		
	}
	
	

}
