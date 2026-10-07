package abstraction.class_problems;
import java.util.*;
public class Problem4_ElectricityConnectionBilling {
    static abstract class Connection { int units; Connection(int u){units=u;} abstract double bill(); }
    static class Home extends Connection { Home(int u){super(u);} double bill(){return Math.min(units,100)*5+Math.max(0,units-100)*7;} }
    static class Shop extends Connection { Shop(int u){super(u);} double bill(){return units*8+100;} }
    static class Factory extends Connection { Factory(int u){super(u);} double bill(){return Math.max(1000,units*6);} }
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String type=sc.next();int units=sc.nextInt();Connection c=type.equals("HOME")?new Home(units):type.equals("SHOP")?new Shop(units):new Factory(units);double b=c.bill();total+=b;System.out.printf("%s: %.2f%n",type,b);}System.out.printf("Total: %.2f%n",total);sc.close();}
}