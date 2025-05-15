import java.util.Scanner;
public class Matrix1 {
    public static void printmatrix(int[][] matrix){
        for(int i=0;i<2; i++){
            for(int j=0; j<2;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int [][] matrix1 = new int[2][2];
        int [][] matrix2 = new int[2][2];
        int [][] result = new int[2][2];
        System.out.println("Enter the elements of matrix1:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2; j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix2:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2; j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.print("1.Addition\n");
        System.out.print("2.Multiplication\n");
        System.out.print("Transpose of matrix 1:\n");
        System.out.print("Enetr your choice: ");
        int choice =sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Addition of matrices: ");
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    result[i][j]=matrix1[i][j]+matrix2[i][j];
                }
            }
            printmatrix(result);
            break;

            case 2:
            System.out.println("Multiplication of matrices: ");
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    result[i][j]=0;
                    for(int k=0; k<2; k++){
                    result[i][j] += matrix1[i][j]*matrix2[i][j];
                    }
                }
            }
            printmatrix(result);
            break;

            case 3:
            System.out.println("Transpose of matrices: ");
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    result[i][j]=matrix1[j][i];
                }
            }
            printmatrix(result);
            break;

            default:
            System.out.println("You have enetred wrong choice...!");

        }
        sc.close();
}
}
