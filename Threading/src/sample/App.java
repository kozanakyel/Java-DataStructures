package sample;

class Runner extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.print("Hello " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Runn implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.print("Hello " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[] args){
        Runner runner1  = new Runner();
        runner1.start();

        Runner runner2 = new Runner();
        runner2.start();

        Thread t1 = new Thread(new Runn());
        t1.start();
    }
}
