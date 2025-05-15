import java.util.*;

public class MergeArray {

    public static void mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            merged[k++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[k++] = arr2[i];
        }
        System.out.println("only Merged array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
       
        for (int i = 0; i < merged.length - 1; i++) {
            for (int j = 0; j < merged.length - 1; j++) {
                if (merged[j] > merged[j + 1]) {
                    // swap
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Merged Sorted array:");
            for (int i = 0; i < merged.length; i++) {
                System.out.print(merged[i] + " ");
            }
        }  


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter elements of array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of array 2: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter elements of array 2: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        mergeArrays(arr1, arr2);
    }
}