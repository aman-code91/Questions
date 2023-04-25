class MyThreadOne implements Runnable{
    public void run(){
        // for(int i = 10; i < 100; i += 10){
        //     try{
        //         Thread.sleep(2000);
        //     }
        //     catch(Exception e)
        //     {

        //     }
            
        //     System.out.println("One " + i);
        // }
        Thread curr = Thread.currentThread();
        String tname = curr.getName();
        // curr.setName("My MAIN");
        System.out.println(curr.getId());
        System.out.println("From One " +tname);
    }
}