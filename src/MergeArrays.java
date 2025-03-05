import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class MergeArrays {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Length of Array 1: ");
        int m = s.nextInt();
        int[] num1 = new int[m];
        for(int i = 0; i < m; i++){
            num1[i] = s.nextInt();
        }
        System.out.print("Enter the Length of Array 1: ");
        int n = s.nextInt();
        int[] num2 = new int[n];
        for(int i = 0; i < n; i++){
            num2[i] = s.nextInt();
        }
    mergeArrays(m, num1, n, num2);

    }
    public static void mergeArrays(int m, int[] nums1, int n, int[] nums2) {
        int m1 = m - 1;
        int n1 = n - 1;
        int k = m + n - 1;
        while (m1 >= 0 && n1 >= 0) {
            if (nums2[n1] > nums1[m1]) {
                nums1[k] = nums2[n1];
                n1--;
            } else {
                nums1[k] = nums1[m1];
                m1--;
            }
            k--;
        }
        while (n1 >= 0) {
            nums1[k] = nums2[n1];
            k--;
            n1--;
        }
    }
}
