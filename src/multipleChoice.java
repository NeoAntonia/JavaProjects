import java.util.Scanner;

public class multipleChoice {
    public static void main (String[] args){

        String question = "";
        String answerOne = "Earth";
        String answerTwo = "Jupiter";
        String answerThree = "Saturn";
        String correctAnswer = answerTwo;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the largest Planet in our Solar system:");
        System.out.println("1.Earth");
        System.out.println("2.Jupiter");
        System.out.println("3.Saturn");
        question =  userInput.nextLine();

//Correct answer variable not need but to lazy to change xd
        if (question.equals(correctAnswer)){
            System.out.println("Congratulations! You're correct, the color is :" + " " + answerOne);
        }else if (question.equals(answerOne)){
            System.out.println(answerTwo + " " + "Is not the correct option try again");
        }
        else if (question.equals(answerThree)){
            System.out.println(answerThree + " "+ "Is not the correct option try again ");
        }else
            System.out.println("Invalid option Exiting");
    }
}
