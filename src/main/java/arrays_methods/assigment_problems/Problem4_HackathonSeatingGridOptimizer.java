package arrays_methods.class_problems;
public class Problem4_HackathonSeatingGridOptimizer {
    private static double rowAverage(int[] row){int sum=0;for(int value:row)sum+=value;return (double)sum/row.length;}
    static String classifyRows(int[][] seatingScores,int threshold){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<seatingScores.length;i++){double average=rowAverage(seatingScores[i]);result.append("Row ").append(i).append(average>=threshold?": Buzzing Zone":": Quiet Zone");if(i<seatingScores.length-1)result.append(" | ");}
        return result.toString();
    }
    public static void main(String[] args){System.out.println(classifyRows(new int[][]{{40,50,45},{85,90,95},{30,20,25}},60));}
}