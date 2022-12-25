import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            Plansza tablicaPionkow = new Plansza();
            Pionki pionek1 = new Pionki();
            Pionki pionek2 = new Pionki();
            Pionki pionek3 = new Pionki();
            Pionki pionek4 = new Pionki();
            Pionki pionek5 = new Pionki();
            Pionki pionek6 = new Pionki();
            Pionki pionek7 = new Pionki();
            Pionki pionek8 = new Pionki();
        System.out.println("----------- Aktualna plansza -----------");
        tablicaPionkow.addPionek(pionek1,7,0);
        tablicaPionkow.addPionek(pionek2,7,1);
        tablicaPionkow.addPionek(pionek3,7,2);
        tablicaPionkow.addPionek(pionek4,7,3);
        tablicaPionkow.addPionek(pionek5,7,4);
        tablicaPionkow.addPionek(pionek6,7,5);
        tablicaPionkow.addPionek(pionek7,7,6);
        tablicaPionkow.addPionek(pionek8,7,7);
        tablicaPionkow.rysujTablice();
        System.out.println();
        System.out.println("Y by zacząć");
        char d = scan.next().charAt(0);
        while (d == 'y') {
            tablicaPionkow.movePionek();
            System.out.println();
            System.out.println("----------- Aktualna plansza -----------");
            tablicaPionkow.rysujTablice();
            System.out.println();

        }
            System.out.println("Koniec.");
        }
    }
