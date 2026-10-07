package abstraction.class_problems;
import java.util.*;
public class Problem5_TravelBookingWithCommonFee {
    static abstract class Booking { protected static final double BOOKING_FEE=50; double distance; Booking(double d){distance=d;} abstract double baseFare(); double total(){return baseFare()+BOOKING_FEE;} }
    static class Bus extends Booking { Bus(double d){super(d);} double baseFare(){return 2*distance;} }
    static class Train extends Booking { Train(double d){super(d);} double baseFare(){return 1.5*distance;} }
    static class Flight extends Booking { Flight(double d){super(d);} double baseFare(){return 2500+4*distance;} }
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();for(int i=0;i<n;i++){String mode=sc.next();double d=sc.nextDouble();Booking b=mode.equals("BUS")?new Bus(d):mode.equals("TRAIN")?new Train(d):new Flight(d);System.out.printf("%s: %.2f%n",mode,b.total());}sc.close();}
}