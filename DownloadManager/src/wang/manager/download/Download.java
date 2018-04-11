package wang.manager.download;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.Thread.State;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Observable;

import javax.net.ssl.SSLEngineResult.Status;

public class Download extends Observable implements Runnable {
private static final int MAX_BUFFER_SIZE = 1024;//下载缓存
public static final String STATUSES[] = {"Downloading","Paused","Complete","Cancelled","Error"};
//状态名

public static final int DOWNLOADING = 0;
public static final int PAUSED = 1;
public static final int COMPLETE = 2;
public static final int CANCELLED = 3;
public static final int ERROR = 4;
//状态码

private URL url;   //下载地址 
private int size;   //下载文件的字节数
private int downloaded; //已下载的字节数
private int status; //当前下载状态
 	
	public Download(URL url) {
      this.url = url;
      size = -1;
      downloaded = 0;
      status = 0;
      
      download();
	}
	
	public int getStatus() {
		return status;
	}

    public String getUrl() {
		return url.toString();
	}
	
    public int getSize() {
		return size;
	}

	public float getProgress() {
       return ((float)downloaded/size)*100;
	}
//返回下载进度

	private void pause() {
      status = PAUSED;
     setChanged();
     notifyObservers();
	}
	//终止下载
	
    private void resume() {
      status = DOWNLOADING;
      setChanged();
      notifyObservers();
}
    //回复下载
    
    private void cancel() {
      status = CANCELLED;
      setChanged();
      notifyObservers();
      download();
	}
    //取消下载
    
    private void error() {
      status = ERROR;
      setChanged();
      notifyObservers();
	}
    //说明下载出现错误
    
    private void download() {
      Thread Thread = new Thread(this);
      Thread.start();
    }
    private String getFileName(URL url) {
      String fileName = url.getFile();
      return fileName.substring(fileName.lastIndexOf('/')+1);
	}


	@Override
	public void run() {
      RandomAccessFile file  = null;
      InputStream stream = null;
      
      try {
		
    	  HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    	  
    	  connection.setRequestProperty("Range", "bytes="+ downloaded +"-");
    	  connection.connect();
    	  
    	  if (connection.getResponseCode() / 100 != 2) {
    		  error();
			
		}
    	  
    	  int contentLength = connection.getContentLength();
    	  
    	  if (contentLength < 1) {
    		  error();
			
		}
    	  
    	  if (size == -1 ) {
            size = contentLength;
            
            setChanged();
            notifyObservers();
		}
    	  
    	  
    	  file = new RandomAccessFile(getFileName(url), "rw");
    	  file.seek(downloaded);
    	  
    	  stream = connection.getInputStream();
    	  
    	  
    	  while(status == DOWNLOADING) {
    		  byte buffer[] ;
    		  
    		 if (size - downloaded> MAX_BUFFER_SIZE) {
    			 buffer = new byte[MAX_BUFFER_SIZE];
				
			}else{
				buffer = new byte[size = downloaded];
			}
    		 
    		 int read = stream.read(buffer);
    		 if (read ==-1) {
				break;
			}
    		 
    		 file.write(buffer, 0 ,read);
    		 downloaded +=read;
    		 setChanged();
    	      notifyObservers();
    	  
    	  
    	  if (status == DOWNLOADING) {
			status =  COMPLETE;
			setChanged();
		      notifyObservers();
		}
	}
    	  } catch (Exception e) {
       error();             
	}finally {
		if (file!= null) {
			try {
				file.close();
			} catch (IOException e) {}
		}
	
      if (stream != null) {
    	  try {
			stream.close();
		} catch (Exception e) {}
        }
	  }
	}

	

}

 








