package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiar stosu ");
        int size = scanner.nextInt();

        Stack stack = new Stack(size);
        while (size > 0) {

            System.out.println("Co chcesz zrobic ze stosem ?");
            System.out.println("1. Dodac element ");
            System.out.println("2. Usunac ze stosu ");
            System.out.println("3. Pokazac stos ");
            System.out.println("4. Pokaz rozmiar ");

            int wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.showStack();
                    break;
                case 4:
                    stack.showSize();
                    break;
                default:
                    System.out.println("Niepoprawny wybor ");
            }
            size--;
        }
        System.out.println("Stos pełny ");

//
//
//
//        //Zadanie 5
//        System.out.println("Zadanie 5");
//        System.out.println();
//
//        int powtorkaWhile=1;
//        int dzialanie =0;
//
//
//
//
//        while (powtorkaWhile == 1){
//
//            System.out.println("1.Dodac pracownika ");
//            System.out.println("2.Spis pracownikow ");
//
//            dzialanie = scanner.nextInt();
//            Firma firma1 = new Firma();
//
//            switch (dzialanie){
//                case 1:
//                    System.out.println("Podaj imie");
//                    String imie = scanner.nextLine();
//                    imie = scanner.nextLine();
//
//                    System.out.println("Podaj nazwisko ");
//                    String nazwisko = scanner.nextLine();
//
//                    System.out.println("Podaj wiek ");
//                    int wiek = scanner.nextInt();
//
//                    System.out.println("Podaj stanowisko ");
//                    String stanowisko = scanner.nextLine();
//                    stanowisko = scanner.nextLine();
//
//                    Pracownik people = new Pracownik(imie, nazwisko,wiek, stanowisko);
//
//
//                    firma1.newWorking(people);
//                    break;
//
//                case 2:
//                    firma1.showWorking();
//                    break;
//
//                default:
//                    System.out.println("Niepoprawny nomer ");
//            }
//            System.out.println("Powtorzyc (1 or 0) ?");
//            powtorkaWhile=scanner.nextInt();
//        }
    }
}