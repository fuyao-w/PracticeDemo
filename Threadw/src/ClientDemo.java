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
		// new Socket �ᷢ����localhost��8000������
		// ������ӳɹ��ͻᴴ��socketʵ��s�����ɹ������쳣
		Socket s = new Socket("localhost", 8111);
		// in ����������˵��ͻ���������
		InputStream in = s.getInputStream();
		// out ��ͻ��˵�����˵������
		OutputStream out = s.getOutputStream();
		// reader �߳�
		// ���𽫴ӿ���̨��ȡ����Ϣд����������
		new Reader(out).start();
		// wirter �߳�
		// ���𽫴ӷ�������ȡ����Ϣд������̨
		new Writer(in).start();
	}
	/**
	 * ��Ա�ڲ��� 
	 * ���𽫴ӿ���̨��ȡ����Ϣд����������
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
					String str = s.nextLine(); // ��ȡ����̨
					out.write(str.getBytes()); // ���͵�������
					out.write('\n');
					out.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * ��Ա�ڲ��� 
	 * ���𽫴ӷ�������ȡ����Ϣд������̨
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
					System.out.write(b); // ����̨�ᴦ���������
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}