package abstraction.class_problems;
import java.util.*;
public class Problem3_LibraryLateFineCounter {
    static abstract class LibraryItem { String title; int daysLate; LibraryItem(String t,int d){title=t;daysLate=d;} abstract double fine(); }
    static class Book extends LibraryItem { Book(String t,int d){super(t,d);} double fine(){return 2*daysLate;} }
    static class DVD extends LibraryItem { DVD(String t,int d){super(t,d);} double fine(){return Math.min(5*daysLate,50);} }
    static class Magazine extends LibraryItem { Magazine(String t,int d){super(t,d);} double fine(){return daysLate;} }
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String type=sc.next(),title=sc.next();int d=sc.nextInt();LibraryItem x=type.equals("BOOK")?new Book(title,d):type.equals("DVD")?new DVD(title,d):new Magazine(title,d);double f=x.fine();total+=f;System.out.printf("%s: %.2f%n",x.title,f);}System.out.printf("Total Fines: %.2f%n",total);sc.close();}
}