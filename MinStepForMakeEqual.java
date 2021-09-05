import java.util.*;

public class MinStepForMakeEqual {
    public static int solution(int[] a, int n) {
        Arrays.sort(a);

        int medLeft = a[n/2 - 1], medRight = a[n/2];
        int minToMedLeft = 0, minToMedRight = 0;

        for(int i = 0; i < n; i++) {
            minToMedLeft += Math.abs(medLeft - a[i]);
            minToMedRight += Math.abs(medRight - a[i]);
        }

        return Math.min(minToMedLeft, minToMedRight);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        
        System.out.print("Enter the numbers in array: ");
        for(int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Minimum steps for make all elements of array equal is " + solution(a, a.length));

        sc.close();
    }
}