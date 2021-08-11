import java.util.Scanner;

public class AnswerFour {


    void startRPS() {

        System.out.println("Witaj w grze Kamień Papier Nożyce");
        System.out.println("Jeżeli chcesz wyjśc z gry wpisz 'koniec'!");
        //wybór użytkownia
        Scanner in = new Scanner(System.in);


        //tworzenie wyniku
        int wins = 0;
        int losses = 0;



            //loop - pętla uruchamiająca się po grze
        while (true){

            System.out.print("Jaki jest Twój ruch? Wpisz kamień, papier lub nożyce: ");

            String myMove = in.nextLine();

            //wyjście z gry
            if (myMove.equals("koniec")) {
                break;
            }




            //weryfikacja mojego ruchu

            if (!myMove.equals("kamień") && !myMove.equals("papier") && !myMove.equals("nożyce")) {
                System.out.println("Twój rych jest nieprawidłowy!");
            } else {

                int rand = (int) (Math.random() * 3);
                String opponentMove = "";
                if (rand == 0) {
                    opponentMove = "kamień";
                } else if (rand == 1) {
                    opponentMove = "papier";
                } else {
                    opponentMove = "nożyce";
                }

                System.out.println("Przeciwnik wybrał: " + opponentMove);


                //

                if (myMove.equals(opponentMove)) {
                    System.out.println("Ten sam wybór!!");

                } else if ((myMove.equals("rock") && opponentMove.equals("nożyce")) || (myMove.equals("kamień") && opponentMove.equals("nożyce") ||  (myMove.equals("papier") && opponentMove.equals("kamień")))) {
                    System.out.println("Wygrałeś!");
                    wins++;
                } else {
                    System.out.println("Przegrałeś!");
                    losses++;
                }

            }

            //wygrane przegrane
            System.out.println("Wygrałeś " + wins + " gry");

            System.out.println("Przegrałeś " + losses + " gry");
        }

        //sprawdzenie czy wygrał user czy przegrał w całości gry

        if (wins > losses){
            System.out.println("Wygrałeś więcej gier niż przegrałeś!");
        } else if (wins < losses){
            System.out.println("Przegrałeś więcej gier niż wygrałeś!");
        } else {
            System.out.println("Wygrałeś i przegrałeś taką samą liczbę gier!");
        }


        System.out.println("Dzieki za grę!");






    }

}
