import java.util.Scanner;

public class ThirdLargestNumber {
    public static void main(String[] a){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        if(size < 3){
            System.out.println("The array size must be 3 or more...");
            return;
        }
        int element = thirdLargestElement(size);
        System.out.println("\n Third largest element of the array: "+ element);
    }
    private static int thirdLargestElement(int size){
        Scanner s = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < size; i++){
            array[i] = s.nextInt();
        }
        //Arrays.sort(array);
        int largest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;
        //System.out.println("Sorted Array: ");
        for(int i = 0; i < size; i++){
            //System.out.print("The element is->"+array[i]);
            if(array[i] > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = array[i];
            }
            else if(array[i] > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = array[i];
            }
            else if(array[i] > thirdLargest){
                thirdLargest = array[i];
            }
            //System.out.println("Largest->"+largest);
            //System.out.println("Second Largest->"+secondLargest);
            //System.out.println("Third Largest->"+thirdLargest);
        }
    return thirdLargest;
    }
}
