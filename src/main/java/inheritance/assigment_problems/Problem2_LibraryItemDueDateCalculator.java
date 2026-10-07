package inheritance.class_problems;
import java.time.*;import java.time.format.DateTimeFormatter;import java.util.*;
public class Problem2_LibraryItemDueDateCalculator {
    static abstract class LibraryItem { String title; LibraryItem(String title){this.title=title;} abstract int loanDays(); LocalDate dueDate(LocalDate from){return from.plusDays(loanDays());} }
    static class Book extends LibraryItem { Book(String t){super(t);} int loanDays(){return 14;} }
    static class DVD extends LibraryItem { DVD(String t){super(t);} int loanDays(){return 7;} }
    static class Magazine extends LibraryItem { Magazine(String t){super(t);} int loanDays(){return 3;} }
    static String[] parseQuoted(String line){List<String> out=new ArrayList<>();int i=0;while(i<line.length()){int q=line.indexOf('"',i);if(q<0)break;int end=line.indexOf('"',q+1);if(end<0)break;out.add(line.substring(q+1,end));i=end+1;}return out.toArray(new String[0]);}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int n=sc.nextInt();sc.nextLine();LocalDate current=LocalDate.of(2023,10,26);DateTimeFormatter f=DateTimeFormatter.ISO_LOCAL_DATE;
        for(int i=0;i<n;i++){String line=sc.nextLine().trim();String type=line.split("\s+",2)[0];String[] q=parseQuoted(line);String title=q.length>0?q[0]:line.substring(type.length()).trim();LibraryItem item=type.equals("BOOK")?new Book(title):type.equals("DVD")?new DVD(title):new Magazine(title);System.out.println(title+": "+item.dueDate(current).format(f));}
        sc.close();
    }
}