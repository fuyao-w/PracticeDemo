import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.InetAddress;
import java.net.DatagramSocket;
import java.net.DatagramPacket;

public class ChatRoom{
 public static void main(String []args){
  JFrame f=new JFrame();
  f.setSize(700,600);
  f.setTitle("������");
  f.setLayout(null);

//�����ı���
  final JTextArea textshow=new JTextArea();
  textshow.setBounds(0,0,700,300);
  textshow.setEditable(false);//���ɱ༭
  f.add(textshow);

//������ǩ1;
  JLabel lab1=new JLabel();
  lab1.setBounds(100,320,80,20);
  lab1.setText("IP��ַ��");
  f.add(lab1);

//ip��ַ�ı���
  final JTextField text=new JTextField();
  text.setBounds(190,320,100,20);
  text.setText("127.0.0.1");
  f.add(text);

//��ǩ2��
  JLabel lab2=new JLabel();
  lab2.setBounds(310,320,80,20);
  lab2.setText("�˿ںţ�");
  f.add(lab2);

//�˿� �ı���
  final JTextField textport=new JTextField();
  textport.setBounds(400,320,100,20);
  textport.setText("8888");
  textport.setEditable(false);
  f.add(textport);

//�����ı���
  final JTextArea textsend=new JTextArea();
  textsend.setBounds(0,360,700,160);  
  f.add(textsend);

//���Ͱ�ť��
  JButton btn1=new JButton();
  btn1.setText("������Ϣ");
  btn1.setBounds(590,530,100,30);
  f.add(btn1);
  btn1.addActionListener(new ActionListener(){
  
   public void actionPerformed(ActionEvent e){
    String userIp=text.getText();
    String userPort=textport.getText();
    String usertext=textsend.getText();

try
    {
     InetAddress add=InetAddress.getByName(userIp);
     int port=new Integer(userPort);
     byte []bs=usertext.getBytes();

DatagramPacket dp=new DatagramPacket(bs,bs.length,add,port);
     DatagramSocket ds=new DatagramSocket();
     ds.send(dp);
     textsend.setText("");
     textsend.requestFocus();
    }
    catch (Exception ex)
    {
    }

}
  });

new Thread(){
   @SuppressWarnings("resource")
public void run(){   
    try
    {
     DatagramSocket ds=new DatagramSocket(8888);
     while (true)
     {
      
      byte []bs=new byte[1024];
      DatagramPacket dp=new DatagramPacket(bs,1024);
      ds.receive(dp);
      String str=new String(bs);
      str=str.trim();
      if (textshow.getText().equals(""))
      {
       textshow.setText(str);
       continue;
      }
      textshow.setText(textshow.getText()+"\r\n"+str);
     }
     
    }
    catch (Exception ex)
    {
    }   
   }  
  
  }.start();

f.setLocationRelativeTo(null);
  f.setVisible(true);

}
}