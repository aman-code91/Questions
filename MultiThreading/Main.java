

public class Main{
    

    public static void main(String [] args){
        // MyThreadOne t1 = new MyThreadOne();
        // Thread thread = new Thread(t1);
        // thread.start();

        Thread curr = Thread.currentThread();
        curr.setName("My MAIN");
        String tname = curr.getName();
        
        // System.out.println(tname);
        System.out.println(curr);
        // System.out.println(curr.getId());


        MyThreadTwo t2 = new MyThreadTwo();
        t2.start();

    }
}