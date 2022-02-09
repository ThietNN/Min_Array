import java.util.Scanner;

public class Min_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element do you want to put in the array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i=0;i<arr.length;i++){
            System.out.println("Insert element #" + (i+1));
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The minimum value is " + min);
    }
}
