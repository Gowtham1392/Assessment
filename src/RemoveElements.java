// https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
import java.util.Scanner;

public class RemoveElements {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        int[] nums = new int[n];
        for(int i =0; i < n; i++){
        nums[i] = s.nextInt();
        }
        System.out.print("Enter the value to remove: ");
        int val = s.nextInt();
        int k = removeDuplicates(nums, val);
        System.out.print("Array size after removing duplicates: "+k);
    }
    public static int removeDuplicates(int[] nums, int val){
    int k = 0;
    for(int i = 0; i < nums.length; i++){
        if(nums[i] != val){
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
    }
}
