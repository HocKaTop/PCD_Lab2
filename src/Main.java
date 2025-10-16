import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ThreadGroup main = new ThreadGroup("main");
        Thread.currentThread().getThreadGroup();
        Thread.currentThread().getThreadGroup().list();
        LinkedList<Thread> threads = new LinkedList <>();
        ThreadGroup G2G4 = new ThreadGroup(main, "G2G4");

        G2G4.list();
        ThreadGroup G1 = new ThreadGroup(G2G4, "G1");

        Thread Tha = new Thread(G1, new thr(), "Tha");
        Tha.setPriority(1);
        threads.add(Tha);
        Thread Thb = new Thread(G1, new thr(), "Thb");
        Thb.setPriority(3);
        threads.add(Thb);
        Thread Thc = new Thread(G1, new thr(), "Thc");
        Thc.setPriority(8);
        threads.add(Thc);
        Thread Thd = new Thread(G1, new thr(), "Thd");
        Thd.setPriority(3);
        threads.add(Thd);

        G1.list();

        Thread ThA = new Thread(G2G4, new thr(), "ThA");
        ThA.setPriority(1);
        threads.add(ThA);
        ThreadGroup G3 = new ThreadGroup(G2G4, "G3");
        Thread Th1 = new Thread(G3, new thr(), "Th1");
        Th1.setPriority(4);
        threads.add(Th1);
        Thread Th2 = new Thread(G3, new thr(), "Th2");
        Th2.setPriority(2);
        threads.add(Th2);
        Thread Th3 = new Thread(G3, new thr(), "Th3");
        Th3.setPriority(5);
        threads.add(Th3);
        G3.list();

        Thread Th1_main = new Thread(new thr(), "Th1");
        Th1_main.setPriority(3);
        threads.add(Th1_main);
        Thread Th2_main = new Thread(new thr(), "Th2");
        Th2_main.setPriority(6);
        threads.add(Th2_main);
        System.out.println(threads);
        Th1.start();
        String state=Th1.getName();
        int prioriry =Th1.getPriority();
        System.out.println(state + " " +prioriry);


    }
}
