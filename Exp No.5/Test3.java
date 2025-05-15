import java.util.Scanner;
import MathFunction.MathFunc;

public class Test3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any decimal number: ");
            double num = sc.nextDouble();
            MathFunc mf = new MathFunc();
            mf.Floor(num);
            mf.Ceil(num);
            mf.Round(num);
        }
}
/*
Enter any decimal number: 26.75
Floor : 26.0
Ceil:27.0
Round of :27
 */