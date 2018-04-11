
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.*;
import java.io.*;
import java.nio.channels.*;
public class ExplicitChannelRead {

	public static void main(String[] args) {
		int count;
		Path filepath=null;
		try{
			filepath = Paths.get("G:/a.txt");
			
		}catch(InvalidPathException e){
			e.printStackTrace();
			return;
			
		}
		
		
		try (SeekableByteChannel fcan = Files.newByteChannel(filepath)){
			ByteBuffer mbuf =ByteBuffer.allocate(128);
			do {
				count=fcan.read(mbuf);
				
				if(count!=-1){
					mbuf.rewind();
					
					for (int i = 0; i < count; i++) {
						System.out.print((char)mbuf.get());
						
					}
				}
			} while (count!=-1);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
