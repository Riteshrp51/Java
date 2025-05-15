import java.util.Scanner;
public class AreaRectangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Area a1=new Area();
        System.out.print("Enter the length of rectangle: ");
        double len=sc.nextDouble();
        System.out.print("Enter the breadth of rectangle: ");
        double bre=sc.nextDouble();
        a1.setDim(len, bre);
        System.out.println("Area of Rectangle: "+a1.getArea());
        sc.close();
    }
}

class Area{
    double length;
    double breadth;

    public void setDim(double l,double b){
        this.length=l;
        this.breadth=b;
    }
    public double getArea(){
        double area=this.length*this.breadth;
        return area;
    }
}
