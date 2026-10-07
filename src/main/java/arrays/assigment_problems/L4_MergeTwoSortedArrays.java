package arrays.class_problems;
import java.util.Arrays;
public class L4_MergeTwoSortedArrays {
    static int[] mergeSortedArrays(int[] a,int[] b){
        int[] r=new int[a.length+b.length]; int i=0,j=0,k=0;
        while(i<a.length&&j<b.length) r[k++]=a[i]<=b[j]?a[i++]:b[j++];
        while(i<a.length) r[k++]=a[i++];
        while(j<b.length) r[k++]=b[j++];
        return r;
    }
    public static void main(String[] args){ System.out.println(Arrays.toString(mergeSortedArrays(new int[]{1,3,5},new int[]{2,4,6}))); }
}