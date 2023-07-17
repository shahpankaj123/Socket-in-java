import java.net.*;
import java.util.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception{
        
        while(true){
        ServerSocket ss=new ServerSocket(8000);

        Socket s=ss.accept();
        Scanner scan = new Scanner(System.in);

        System.out.println("client connected");
        DataInputStream dis=new DataInputStream(s.getInputStream());
        String num=dis.readUTF();
         System.out.println("client msg:-"+num);

         System.out.println("send msg:-");

        String st=scan.nextLine();
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF(st);
        

        dos.close();
        dis.close();
        ss.close();
        s.close();
        }
        


        
    }
}
