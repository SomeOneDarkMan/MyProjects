package somestreams;



import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Streams {
    public static void VVV(Lock lock1,Lock lock2)  {
        while (true){
        boolean firsThread=false;
        boolean secondThread=false;
        firsThread=lock1.tryLock();
        secondThread=lock2.tryLock();
        if(firsThread&&secondThread){
            return;
        }
        if (firsThread){
            lock1.unlock();
        }
        if(secondThread){
            lock2.unlock();
        }
        try {
            Thread.sleep(1);
        }catch (Exception e){

        }
        }



    }
    public static void main(String[] args) throws InterruptedException {

        Runner runner = new Runner();
        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
               runner.firstThread();

            }
        });

        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();

            }
        });
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();
        runner.finished();

    }
}
    class Runner{
        Account account1=new Account();
        Account account2=new Account();
        Lock lock1 =new ReentrantLock();
        Lock lock2 =new ReentrantLock();


        public void firstThread(){
            Streams.VVV(lock1,lock2);


            Random random=new Random();

            for (int i=0;i<1000;i++){
                Account.transfer(account1,account2,random.nextInt(100));
            }
            lock1.unlock();
            lock2.unlock();


        }
        public void secondThread(){

            Streams.VVV(lock2,lock1);
            Random random=new Random();

            for (int i=0;i<1000;i++){
                Account.transfer(account2,account1,random.nextInt(100));
            }
            lock1.unlock();
            lock2.unlock();

        }
        public void finished(){
            System.out.println(account1.getBalance());
            System.out.println(account2.getBalance());
            System.out.println("TotoalBalance:"+(account1.getBalance()+ account2.getBalance()));

        }

    }
    class Account{

    private int balance=10000;
    public void deposit(int deposit){
        this.balance+=deposit;

    }
    public void withdraw( int withdraw){
        this.balance-=withdraw;
    }

        public int getBalance() {
            return balance;
        }

        public static void transfer(Account acc1, Account acc2, int sum){
        acc1.withdraw(sum);
        acc2.deposit(sum);
    }
    }

