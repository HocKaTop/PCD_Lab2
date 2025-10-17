class thr implements Runnable{
    public void run(){
        System.out.println("Поток "+ Thread.currentThread().getName() +" запущен ");
        try{
        Thread.sleep(500);}
        catch(InterruptedException e){
            System.out.println("ашибка!");
        }
        System.out.println("Поток умер :(");
    }
}