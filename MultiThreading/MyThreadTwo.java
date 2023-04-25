class MyThreadTwo extends Thread{
    public void run(){
    // for(int i = 1; i < 10; i += 1){
    //             System.out.println("Two " + i);
    //         }    }
        Thread curr = Thread.currentThread();
        
        // curr.setName("Thread Two");
        // String tname = curr.getName();
        System.out.println(curr);
        // System.out.println("From Two " +tname);
    }
}