import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class ShowFile {

	public static void main(String[] args) {
//		int i;
		
//		
//		try(InputStream fin = Files.newInputStream(Paths.get("G://a.txt"))) {
//			do {
//			i=fin.read();
//			if(i != -1)System.out.print((char)i);
//			
//			} while (i != -1);
//			
//		} catch (InvalidPathException e) {
//			System.out.println(e);
//		}catch (IOException e) {
//			System.out.println(e);
//		}
//
	
	try(OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("G://a.txt")))) {
		for (int i = 0; i < 26; i++) {
			fout.write((byte)('A'+i));
			
		}
	} catch (InvalidPathException e) {
		e.printStackTrace();
	}catch (IOException e) {
		// TODO: handle exception
	  e.printStackTrace();
	}
	
	}

}
