import java.util.Scanner;

public class AnswerTwo {

    void startCalculator() {

        int answerCalc;

        Scanner menuAnswerCalc = new Scanner(System.in);

        System.out.println("========== Wybierz jakie działanie chcesz wykonać ==========");
        System.out.println("    [1] - DODAWANIE  ");
        System.out.println("    [2] - ODEJMOWANIE ");
        System.out.println("    [3] - MNOŻENIE ");
        System.out.println("    [4] - DZIELENIE ");

        answerCalc = menuAnswerCalc.nextInt();


        if (answerCalc == 1){
            System.out.println("Wybrano opcję: 1");
            Operations operations = new Operations();
            operations.sum(); //wywołanie metody sum

        } else if (answerCalc == 2) {
            System.out.println("Wybrano opcję: 2");
            Operations operations = new Operations();
            operations.difference(); //wywołanie metody difference

        } else if (answerCalc == 3){
            System.out.println("Wybrano opcję: 3");
            Operations operations = new Operations();
            operations.multiplication(); //wywołanie metody multiplication
        } else if (answerCalc == 4){
            System.out.println("Wybrano opcję: 4");
            Operations operations = new Operations();
            operations.division(); //wywołanie metody division
        }

    }

}
