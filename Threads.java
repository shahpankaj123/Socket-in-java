class Sample extends Thread{
    public void run(){
        try{
            for(int i=1;i<6;i++){
                System.out.println(i);
                Thread.sleep(2000);
            }
        }catch(Exception e){
            System.out.println("hello");
        }
    }

}
public class Threads{
    public static void main(String[] args) {
        Sample s1=new Sample();
        Sample s2=new Sample();
        s1.start();
        s2.start();
    }
    
    
}
 
