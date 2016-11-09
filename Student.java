import java.util.Scanner;
import java.util.ArrayList;

public class Student
{
    int stuID;
    double stuGPA;
    String stuName;
    
    public double input2;
    public String input1;
    public int input0;
    
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    
    public Student(int id, int gpa, String name)
    {
        stuID = id;
        stuGPA = gpa;
        stuName = name;
    }
    
    public void getStudent()
    {
        System.out.println("What is the ID of your student? ");
        input0 = sc.nextInt();
        stuID = input0;
        
        System.out.println("What is the name of your student? ");
        input1 = sc.nextLine();
        stuName.equals(input1);
        
        System.out.println("What is the gpa of your student? ");
        input2 = sc.nextInt();
        stuGPA = input2;
    }
    
    public void deleteStudent()
    {
        System.out.println("Which student would you like to delete? ");
        input1 = null;
        input0 = 0;
        input2 = 0;
    }
    
    public void setStudent()
    {
        stuID = input0;
        stuGPA = input2;
        stuName = input1;
    }
}