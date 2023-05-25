public class Main {
    public void main(String[] args){

        Account acc = new Account(1001, "Alex", 0.0);

        BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.0);


        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BussinessAccount(1003, "BOB" , 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);


        // DOWNCASTING

        BussinessAccount acc4 = (BussinessAccount)acc2;
        acc4.loan(100.0);



        // Teste

        BussinessAccount acc5 = (BussinessAccount)acc3;




    }
}
