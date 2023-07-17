import java.net.*;
import java.util.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(8000);
        Socket s=ss.accept();
        Scanner scan = new Scanner(System.in);
        System.out.println("client connected");
        
        while(true){
        
        
        DataInputStream dis=new DataInputStream(s.getInputStream());
        String num=dis.readUTF();
         System.out.println("client msg:-"+num);

         System.out.println("send msg:-");

        String st=scan.nextLine();
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF(st);
        if(st=="y"){
        

        dos.close();
        dis.close();
        ss.close();
        s.close();
        break;
        }
        }
        


        
    }
}
