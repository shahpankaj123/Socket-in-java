import java.net.*;
import java.io.*;


public class Server1{

    
    public static void main(String[] args) throws Exception{
        ServerSocket ss =new ServerSocket(8000);
        System.out.println("server sonnected");
        while(true){
            Socket s=ss.accept();
            System.out.println("client connected");
            Clienthandler cn = new Clienthandler(s);
            cn.start();
        }

    }
}
    class Clienthandler extends Thread{
        Socket s;
        public Clienthandler(Socket s){
            this.s=s;
        }
        public void run(){
            try{
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dos= new DataOutputStream(s.getOutputStream());
            while(true){
                String c_msg=dis.readUTF();
                dos.writeUTF(c_msg.toUpperCase());

            }
        }catch(Exception e){
            System.out.println("hello");
        }
    }
    
}

