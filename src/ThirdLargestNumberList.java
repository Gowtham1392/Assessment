import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ThirdLargestNumberList {
    public static void main(String[] a){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        if(size < 3){
        System.out.println("The array size must be 3 or more");
        return;
        }
        int element = thirdLargestElement(size);
        System.out.println("\n Third largest element of the array: "+ element);
    }
    private static int thirdLargestElement(int size){
       Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int element = 0;
        for(int i = 0; i < size; i++){
            element = s.nextInt();
            if(!list.contains(element))
                list.add(element);
       }
        Collections.sort(list);
        System.out.println("Sorted List: ");
        for(Integer num: list){
            System.out.println(num);
        }
        return list.get(list.size() - 3);
    }
}
