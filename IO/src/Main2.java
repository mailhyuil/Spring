import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2 {
public static void main(String[] args) {
	try {
		FileInputStream fi = new FileInputStream("C:/Users/sangb/Desktop/Spring/IO/src/hi.txt");
		BufferedInputStream buffer = new BufferedInputStream(fi);
		
		 int bufSize = buffer.available();
		byte[] buf = new byte[bufSize];
		
		buffer.read(buf);
		
		System.out.println(new String(buf));
		
		buffer.close();
		fi.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
