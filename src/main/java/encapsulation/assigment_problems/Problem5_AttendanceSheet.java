package encapsulation.class_problems;
public class Problem5_AttendanceSheet {
    static class AttendanceSheet {
        private final String[] names; private int count;
        AttendanceSheet(int maxSize){names=new String[maxSize];}
        void markPresent(String name){if(name==null||isPresent(name)||count==names.length)return;names[count++]=name;}
        int getPresentCount(){return count;}
        boolean isPresent(String name){for(int i=0;i<count;i++)if(names[i].equals(name))return true;return false;}
    }
    public static void main(String[] args){AttendanceSheet s=new AttendanceSheet(30);s.markPresent("Ana");s.markPresent("Ben");s.markPresent("Ana");System.out.println(s.getPresentCount());System.out.println(s.isPresent("Ben"));System.out.println(s.isPresent("Chen"));}
}