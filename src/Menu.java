
import java.util.Scanner;

public class Menu {


//metoda uruchamiająca MENU i wybór opcji przez użytkownika, która wywołuje kolejną metodę
    void startMenu() {

        // wybór użytkownika
        int answer;

        Scanner menuAnswer = new Scanner(System.in);

        System.out.println("==========  Wybierz opcję z MENU ========== ");
        System.out.println("    [1] - Zgadnij liczbę z podanego zakresu  ");
        System.out.println("    [2] - Uruchom kalkulator ");
        System.out.println("    [3] - Program FizzBuzz ");
        System.out.println("    [4] - Gra KAMIEŃ PAPIER NOŻYCE");
        System.out.print("Wybierz opcję: ");
        answer = menuAnswer.nextInt();


        if (answer == 1){
            System.out.println("Wybrano opcję: 1");
            AnswerOne answerOne = new AnswerOne();  //wywołanie metody AnswerOne
            answerOne.playGame(); //metoda playGame

        } else if (answer == 2) {
            System.out.println("Wybrano opcję: 2");
            AnswerTwo answerTwo = new AnswerTwo();  //wywołanie metody AnswerTwo
            answerTwo.startCalculator(); // metoda Calculator

        } else if (answer == 3){
            System.out.println("Wybrano opcję: 3");
            AnswerThree answerThree = new AnswerThree();  //wywołanie metody AnswerThree
            answerThree.startFizzBuzz(); //metoda FizzBuzz
        } else if (answer == 4){
            System.out.println("Wybrano opcję: 4");
            AnswerFour answerFour = new AnswerFour();  //wywołanie metody AnswerFour
            answerFour.startRPS(); // metoda startRPS
     }

    }
}
