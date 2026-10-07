package inheritance.class_problems;
import java.util.*;
public class Problem1_PaymentSystemFeeCalculation {
    static abstract class Payment { double amount; Payment(double amount){this.amount=amount;} abstract double adjustedAmount(); abstract String type(); }
    static class CardPayment extends Payment { CardPayment(double a){super(a);} double adjustedAmount(){return amount*1.02;} String type(){return "CARD";} }
    static class WalletPayment extends Payment { WalletPayment(double a){super(a);} double adjustedAmount(){return amount*1.01;} String type(){return "WALLET";} }
    static class BankTransferPayment extends Payment { BankTransferPayment(double a){super(a);} double adjustedAmount(){return amount;} String type(){return "BANKTRANSFER";} }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); double total=0;
        for(int i=0;i<n;i++){String type=sc.next();double amount=sc.nextDouble();Payment p;
            if(type.equals("CARD"))p=new CardPayment(amount); else if(type.equals("WALLET"))p=new WalletPayment(amount); else p=new BankTransferPayment(amount);
            double value=p.adjustedAmount(); total+=value; System.out.printf("%s: %.2f%n",p.type(),value);}
        System.out.printf("Total: %.2f%n",total); sc.close();
    }
}