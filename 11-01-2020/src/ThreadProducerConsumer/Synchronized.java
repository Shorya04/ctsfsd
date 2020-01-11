package ThreadProducerConsumer;

public class Synchronized {

    public static void main(String[] args) {
        
        CubbyHole c = new CubbyHole();
        
        Producer p1 = new Producer(c, 1);
        Producer p2 = new Producer(c,2);
        Consumer c1 = new Consumer(c, 1);
        Consumer c2= new Consumer(c,2);
        
        p1.start();
        c1.start();
        p2.start();
        c2.start();
        
    }
}

