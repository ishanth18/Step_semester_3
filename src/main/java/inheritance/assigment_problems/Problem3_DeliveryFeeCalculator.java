package inheritance.class_problems;
import java.util.*;
public class Problem3_DeliveryFeeCalculator {
    static abstract class Delivery { double weight,distance; Delivery(double w,double d){weight=w;distance=d;} abstract double fee(); }
    static class Standard extends Delivery { Standard(double w,double d){super(w,d);} double fee(){return 5+0.5*weight+0.1*distance;} }
    static class Express extends Delivery { Express(double w,double d){super(w,d);} double fee(){return 15+1.0*weight+0.2*distance;} }
    static class International extends Delivery { double customs; International(double w,double d,double c){super(w,d);customs=c;} double fee(){return 25+2*weight+0.5*distance+customs;} }
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String type=sc.next();double w=sc.nextDouble(),d=sc.nextDouble();Delivery x=type.equals("STANDARD")?new Standard(w,d):type.equals("EXPRESS")?new Express(w,d):new International(w,d,sc.nextDouble());double fee=x.fee();total+=fee;System.out.printf("%s: %.2f%n",type,fee);}System.out.printf("Total: %.2f%n",total);sc.close();}
}