package Oops.Threads;

class Msg{
    boolean isMsg=false;

    public synchronized void reciever() throws InterruptedException{
        while(!isMsg){
            System.out.println("Waiting for Message");
            wait();
        }
        System.out.println("Message Recieved");
    }

    public synchronized void sender(){
        isMsg=true;
        System.out.println("Meassage Sent");
        notify();
    }
}
public class ITC {
    public static void main(String[] args) throws InterruptedException {
        Msg m=new Msg();
        Thread t1=new Thread(()->
        {
            try{
                m.reciever();
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        Thread t2=new Thread(()->
        {
            try{
                Thread.sleep(2000);
                m.sender();
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Done");
    }
}