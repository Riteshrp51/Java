 class Employee{
    public String fname;
    public String lname;
    public double msalary;

    Employee(String firstname, String lastname, double salary){
        this.fname=firstname;
        this.lname=lastname;
        if(salary > 0){
            this.msalary=salary;
        } else {
            this.msalary=0.0;
        }
    }

    public void getfname(){
        System.out.println("the first name is "+fname);
    }
    public void setfname(String fname){
        this.fname=fname;
    }
    public void getlname(){
        System.out.println("the last name is "+lname);
    }
    public void setlname(String lname){
        this.lname=lname;
    }
    public void getmsalary(){
        System.out.println("the monthly salary is "+msalary);
    }
    public void setsalary(double salary){
        if(salary > 0){
            this.msalary=salary;
        } else {
            this.msalary=0.0;
        }
    }

    public void display(){
        System.out.println("Employee information: ");
        getfname();
        getlname();
        getmsalary();
        System.out.println();
    }

    public void raise(){
        msalary+=msalary*0.1;
        System.out.println("salary raised..");
    }

    public void yearlysalary(){
        System.out.println("Yearly salary of "+fname+" is "+ 12*msalary);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1=new Employee("Aniket", "Gawade", 30000);
        Employee emp2=new Employee("Ritesh", "Patil", 50000);

        emp1.display();
        emp2.display();

        emp1.yearlysalary();
        emp2.yearlysalary();
        
        emp1.raise();
        emp2.raise();
        emp1.yearlysalary();
        emp2.yearlysalary();
    }
}
