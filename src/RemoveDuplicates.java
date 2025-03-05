import java.util.Scanner;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicates {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        int[] nums = new int[n];
        for(int i =0; i < n; i++){
            nums[i] = s.nextInt();
        }
        int result = removeDuplicates(nums);
        System.out.print("Elements after removing duplicates: "+result);
    }
    public static int removeDuplicates(int[] nums){
        int k = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
