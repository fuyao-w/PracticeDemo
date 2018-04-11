import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
public class MappedChannelread {

	public static void main(String[] args) {
	       try(FileChannel fChan = (FileChannel)Files.newByteChannel(Paths.get("G://a.txt"))){
	    	   long fSize = fChan.size();
	    	   MappedByteBuffer mbuf=fChan.map(FileChannel.MapMode.READ_ONLY,0, fSize);
	    	   for (int i = 0; i < fSize; i++) {
				System.out.print((char)mbuf.get());
				
			}
	       }catch (InvalidPathException e) {
			System.out.println(e);
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
