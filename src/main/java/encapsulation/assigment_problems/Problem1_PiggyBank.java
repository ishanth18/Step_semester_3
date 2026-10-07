package encapsulation.class_problems;
public class Problem1_PiggyBank {
    static class PiggyBank {
        private double savings; private final String id;
        PiggyBank(String id){this.id=id;}
        void deposit(double amount){if(amount>0)savings+=amount;}
        void withdraw(double amount){if(amount>0&&amount<=savings)savings-=amount;else System.out.println("Withdrawal rejected");}
        double getSavings(){return savings;}
    }
    public static void main(String[] args){PiggyBank pb=new PiggyBank("PB-1");pb.deposit(100);pb.withdraw(30);pb.withdraw(500);System.out.println("Savings: "+pb.getSavings());}
}