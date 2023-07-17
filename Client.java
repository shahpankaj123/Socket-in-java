import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket s=new Socket("localhost",8000);
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.println("send message:-");
        String user=scan.nextLine();
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF(user);
        DataInputStream dis=new DataInputStream(s.getInputStream());
        String res=dis.readUTF();
        System.out.println("sender msg:-"+res);
        if(user=="y"){
        dis.close();
        dos.close();
        
        s.close();
        scan.close();
        break;
        }
        }



    }

    
}
