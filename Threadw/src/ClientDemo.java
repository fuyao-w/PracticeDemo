import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class ClientDemo {
	public static void main(String args[]) throws IOException {
		ClientDemo client = new ClientDemo();
		client.open();
	}
	@SuppressWarnings("resource")
	private void open() throws IOException {
		// new Socket 会发起向localhost：8000的连接
		// 如果连接成功就会创建socket实例s，不成功则抛异常
		Socket s = new Socket("localhost", 8111);
		// in 代表服务器端到客户的输入流
		InputStream in = s.getInputStream();
		// out 想客户端到服务端的输出流
		OutputStream out = s.getOutputStream();
		// reader 线程
		// 负责将从控制台读取的信息写到服务器端
		new Reader(out).start();
		// wirter 线程
		// 负责将从服务器读取的信息写到控制台
		new Writer(in).start();
	}
	/**
	 * 成员内部类 
	 * 负责将从控制台读取的信息写到服务器端
	 */
	class Reader extends Thread {
		OutputStream out;
		public Reader(OutputStream out) {
			this.out = out;
			setDaemon(true);
		}
		@Override
		public void run() {
			try {
				Scanner s = new Scanner(System.in);
				while (true) {
					String str = s.nextLine(); // 读取控制台
					out.write(str.getBytes()); // 发送到服务器
					out.write('\n');
					out.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 成员内部类 
	 * 负责将从服务器读取的信息写到控制台
	 */
	class Writer extends Thread {
		InputStream in;
		public Writer(InputStream in) {
			this.in = in;
		}
		@Override
		public void run() {
			try {
				int b;
				while ((b = in.read()) != -1) {
					System.out.write(b); // 控制台会处理编码问题
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}