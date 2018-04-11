
import java.nio.channels.Channel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.*;

public class ExplicitChannelRead {

	public static void main(String[] args) {
	int count;
    Path filepath =null;
    
    try {
    	filepath =Paths.get("G:/1.txt");
    	
		
	} catch (InvalidPathException e) {
		e.printStackTrace();
	  return;
		// TODO: handle exception
	}
    
    try (SeekableByteChannel fchan=Files.newByteChannel(filepath)){
    	ByteBuffer mbuf =ByteBuffer.allocate(128);
    	do{
    		count =fchan.read(mbuf);
    		if (count != -1) {
    			mbuf.rewind();
    			
    			
    			
    			
    			for (int i = 0; i < count; i++) 
    				System.out.println((char)mbuf.get());
					
    		}
				}while(count !=-1);
					
					System.out.println();
				
			}
    
		
	 catch (IOException e) {
		// TODO: handle exception
		 e.printStackTrace();
	}
    

	
	}}

