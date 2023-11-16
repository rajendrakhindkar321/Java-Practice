public class Company {

    int n;
    boolean f = false;
    synchronized public void produce_item(int n) throws InterruptedException {

        if(f){
            wait();
        }
        this.n = n;
        System.out.println("Produce: "+ this.n);
        f = true;
        notify();

    }

    synchronized public int consume_item() throws InterruptedException {

        if(!f){
            wait();
        }
        System.out.println("Consumed: " + this.n);
        f=false;
        notify();
        return this.n;

    }
}

class Producer extends Thread{

    Company c;

    public Producer(Company c){

        this.c = c;
    }

    public void run(){

        int i=1;
        while(true){
            try {
                this.c.produce_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            i++;
        }
    }
}

class Consumer extends Thread{

    Company c;

    public Consumer(Company c){
        this.c = c;
    }
    public void run(){

        while(true){

            try {
                this.c.consume_item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try{
                Thread.sleep(2000);
            }catch(Exception e){}
        }

    }
}

class Main {

    public static void main(String[] args){

        Company com = new Company();
        Producer p = new Producer(com);
        Consumer c =new Consumer(com);

        p.start();
        c.start();
    }

}
