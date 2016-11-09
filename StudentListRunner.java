import java.util.Scanner;
import java.util.ArrayList;

public class StudentListRunner
{
    public static int menuNumber()
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Would would you like to do?: \n1 to add a student \n2 to print the student list \nq to quit");
        input = sc.nextLine();
        int input1 = 0;
        Student[] students = new Student[2];
        if(input.equals("2"))
        {
            System.out.println("Which student would you like to view?");
            input1 = sc.nextInt();
            System.out.println(students[input1]);
        }
        return input1;
    }
    public static void main(String[] args)
    {
        Student stu = null;
        System.out.println("Welcome to the student list.");
        StudentList[] students = new StudentList[2];
        boolean p = true;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while(p == true)
        {
            menuNumber();
            if(input == "q")
            {
                p = false;
            }
            if(input.equals("1"))
            {
                stu.getStudent();
                stu.setStudent();
            }
            
            else if(input.equals("delete"))
            {
                stu.deleteStudent();
                stu.setStudent();
            }
            
            else
            {
                System.out.println("This is not a possible command.");
            }
            System.out.println("Here is your student: " + stu);
        }
    }
}