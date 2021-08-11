import java.util.Scanner;

public class Operations {

    void sum() {
        int a;
        int b;
        int answer;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę a: ");
        a = scanner.nextInt();

        System.out.print("Podaj liczbę b: ");
        b = scanner.nextInt();

        answer = (a + b);
        System.out.println("Suma dodawania liczby a i b wynosi: " + answer);

    }


    void difference() {

        int a;
        int b;
        int answer;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę a: ");
        a = scanner.nextInt();

        System.out.print("Podaj liczbę b: ");
        b = scanner.nextInt();

        answer = (a - b);
        System.out.println("Różnia odejmowania liczby a i b wynosi: " + answer);

    }

    void multiplication() {
        int a;
        int b;
        int answer;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę a: ");
        a = scanner.nextInt();

        System.out.print("Podaj liczbę b: ");
        b = scanner.nextInt();

        answer = (a * b);
        System.out.println("Operacja mnożenia liczb a i b wynosi: " + answer);

    }

    void division() {
        int a;
        int b;
        int answer;
        int modulo;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę a: ");
        a = scanner.nextInt();

        System.out.print("Podaj liczbę b: ");
        b = scanner.nextInt();

        answer = (a / b);
        modulo = (a % b);

        if (modulo == 0) {
            System.out.println("Operacja dzielenia liczb a i b wynosi: " + answer);
        } else if (modulo != 0) {
            System.out.println("Operacja dzielenia liczb a i b wynosi: " + answer + " reszta z dzielenia wynois: " + modulo);
        }



    }
}

