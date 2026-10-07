package arrays.class_problems;
import java.util.Arrays;
public class L5_RotateArray {
    static int[] rotateArray(int[] nums,int k){
        if(nums.length==0)return nums; k%=nums.length; int[] r=new int[nums.length];
        for(int i=0;i<nums.length;i++) r[(i+k)%nums.length]=nums[i]; return r;
    }
    public static void main(String[] args){ System.out.println(Arrays.toString(rotateArray(new int[]{1,2,3,4,5,6,7},3))); }
}