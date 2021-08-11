import java.util.Random;
import java.util.Scanner;


//klasa AnswerOne uruchamiająca się w klasie Menu po wpisaniu przez usera: 1


public class AnswerOne {

    int i  = 0;
    int los;
    int odp;
    int bound; //zakres od 1 do x


    void playGame() {

        System.out.println("========== ZGADNIJ LICZBĘ WYLOSOWANĄ PRZEZ KOMPUTER ========== ");

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Podaj zakres do losowania liczby od 0 do : ");

        Random random = new Random();
        los = random.nextInt(bound = scanner2.nextInt());


        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgadnij liczbę od 1 do " + bound);

        do {
            i++;
            System.out.println("Podaj liczbę: ");
            odp = scanner.nextInt();
            if (odp > los){
                System.out.println("Niestety nie zgadłeś. Moja liczba jest mniejsza!");
            } else if (odp < los){
                System.out.println("Niestety nie zgadłeś. Moja liczba jest większa!");
            }
        }while (odp != los);
        System.out.println("Brawo! Odgadłeś za " + i + " razem!");
        System.out.println(" ========== KONIEC GRY! ========== ");
    }

}
