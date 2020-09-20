package sample;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class AccountWithoutSync {
    private static Account account = new Account();

    public static void main(String[] args){
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++){
            executor.execute(new AddAPennyTask());
        }

        executor.shutdown();

        while (!executor.isTerminated()){}

        System.out.println("What is balance? " + account.getBalance());
    }

    private static class AddAPennyTask implements Runnable{
        public void run(){
            account.deposit(1);
        }
    }

    private static class Account{
        private static Lock lock = new ReentrantLock();
        private static Condition newDeposit = lock.newCondition();
        private int balance = 0;

        public int getBalance(){
            return balance;
        }

        public void withdraw(int amount){
            lock.lock();
            try{
                while (balance < amount){
                    System.out.println("\t\t\tWait for a deposit");
                    newDeposit.await();
                }
                balance -= amount;
                System.out.println("\t\t\tWithdraw " + amount +
                        "\t\t" + getBalance());
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }finally {
                lock.unlock();
            }
        }

        public void deposit(int amount){
            lock.lock(); // Acquire the lock
            try {
                balance += amount;
                System.out.println("Deposit " + amount +
                        "\t\t\t\t\t" + getBalance());
                // Signal thread waiting on the condition
                newDeposit.signalAll();
            }
            finally {
                lock.unlock(); // Release the lock
            }
        }
    }
}



