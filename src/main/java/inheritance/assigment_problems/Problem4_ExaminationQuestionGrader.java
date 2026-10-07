package inheritance.class_problems;
import java.util.*;
public class Problem4_ExaminationQuestionGrader {
    static abstract class Question { String type,correct,student; double points; Question(String t,String c,String s,double p){type=t;correct=c;student=s;points=p;} abstract double score(); }
    static class ObjectiveQuestion extends Question { ObjectiveQuestion(String t,String c,String s,double p){super(t,c,s,p);} double score(){return student.equals(correct)?points:0;} }
    static class EssayQuestion extends Question { EssayQuestion(String c,String s,double p){super("ESSAY",c,s,p);} double score(){int count=0;for(String keyword:correct.split(","))if(student.toLowerCase().contains(keyword.trim().toLowerCase()))count++;return count>=2?points*.75:count==1?points*.5:0;} }
    static List<String> quotedTokens(String line){List<String> a=new ArrayList<>();int i=0;while(i<line.length()){int q=line.indexOf('"',i);if(q<0)break;int e=line.indexOf('"',q+1);if(e<0)break;a.add(line.substring(q+1,e));i=e+1;}return a;}
    static int trailingInt(String line){String[] p=line.trim().split("\s+");return Integer.parseInt(p[p.length-1]);}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int n=sc.nextInt();sc.nextLine();double total=0;
        for(int i=0;i<n;i++){String line=sc.nextLine().trim();String type=line.split("\s+",2)[0];List<String> q=quotedTokens(line);double points=trailingInt(line);Question question;
            if(type.equals("ESSAY")) question=new EssayQuestion(q.get(1),q.get(2),points);
            else question=new ObjectiveQuestion(type,q.get(1),q.get(2),points);
            double score=question.score();total+=score;System.out.printf("%s: %.2f%n",type,score);}
        System.out.printf("Total Score: %.2f%n",total);sc.close();
    }
}