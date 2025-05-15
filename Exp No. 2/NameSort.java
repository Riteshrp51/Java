import java.util.Scanner;

public class NameSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];

        // Input 10 names
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        // Sorting using Bubble Sort
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    // Swap names[j] and names[j+1]
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        // Output sorted names
        System.out.println("\nNames in alphabetical order:");
        for (int i = 0; i < 10; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}
//O/P:
// Enter 10 names:
// Sanket
// Ritesh
// arya
// Parvej
// Piyush
// Tushar
// Sumit
// Ramchandra
// Aniket
// Haribhau

// Names in alphabetical order:
// Aniket
// arya
// Haribhau
// Parvej
// Piyush
// Ramchandra
// Ritesh
// Sanket
// Sumit
// Tushar