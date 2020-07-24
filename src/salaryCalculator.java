import java.util.Scanner;

public class salaryCalculator{

public static double SalariesCalculator(double numberOfHoursPerWeek, double salaryPerHour, double vacationsDays){

        double employerGrossSalary = ((numberOfHoursPerWeek * 54) * salaryPerHour) - vacationsDays ;

        return employerGrossSalary;

        }

    public static void main(String[] args){
        double hours, timePerWeek,vacationDays;
        double result;
        Scanner userAnswer = new Scanner(System.in);
        Scanner userAnswer1 = new Scanner(System.in);
        Scanner userAnswer2 = new Scanner(System.in);


        System.out.println("Welcome to Salary Calculator enter the data to see your gross salary: ");
        System.out.println("Enter The number of hours you make per week : ");
        hours = userAnswer.nextDouble();
        System.out.println("Enter The amount you earn per hour ");
        timePerWeek = userAnswer1.nextDouble();
        System.out.println("How much vacation days your have per year? ");
        vacationDays = userAnswer2.nextDouble();

                result = SalariesCalculator(timePerWeek,hours, vacationDays);
                System.out.println("You Make " + " " + result + " " + "Year");

    }
}
