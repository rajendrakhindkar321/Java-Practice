public class BankApp {

    double balance = 10000;

    synchronized public double withdraw(double wamt) {
        System.out.println("withdrawal process started");
        System.out.println("Before wihdrawal total amount is:" + balance);

        if(wamt > balance){
            System.out.println("Sorry Insufficient Balance to withdrawal");
            try {
                wait();
            }catch (InterruptedException e){}
        }

        if(balance > wamt) {
            balance = balance - wamt;
            System.out.println("After wihdrawal total amount is:" + balance);
        }
        else {
            System.out.println("Sorry Insufficient Balance to withdrawal");
        }
        return wamt;
    }

    synchronized public void deposits(double damt){
        System.out.println("deposits process started");
        System.out.println("Before deposits total amount is:" + balance);

        balance = balance+damt;
        System.out.println("After deposits total amount is:" + balance);
        notify();

    }
}

 class Test{

    public static  void main(String[] args){
        final BankApp bank = new BankApp();

        new Thread(){

            @Override
            public void run() {
                bank.withdraw(5000);

            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                bank.deposits(15000);
            }
        }.start();
    }
}
