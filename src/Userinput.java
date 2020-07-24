import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        System.out.println("Hello world:");
        int studentAge = 15;
        double studentGPA = 3.45;
        char studentLastInitial = 'H';
        boolean hasPerfectAttendence = true;
        String studentFirstName = "Kayla";
        String studentLastName = "Hammond";
        char studentFirstInitial = studentFirstName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(studentGPA);
        System.out.println(hasPerfectAttendence);
        System.out.println(studentFirstName);
       ;

        //user input
        System.out.println("What do you want to update ? ");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + "Now Has a GPa of:" + studentGPA);

    }
}
