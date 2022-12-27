import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            Plansza tablicaPionkow = new Plansza();
            tablicaPionkow.addPionki();
        System.out.println("----------- Aktualna plansza -----------");
        tablicaPionkow.rysujTablice();
        System.out.println();
        System.out.println("Y by zacząć");
        char d = scan.next().charAt(0);
        while (d == 'y') {
            tablicaPionkow.movePionek1();
            System.out.println();
            System.out.println("----------- Aktualna plansza po ruchu gracza 1 -----------");
            tablicaPionkow.rysujTablice();
            System.out.println();
            tablicaPionkow.movePionek2();
            System.out.println("----------- Aktualna plansza, po ruchu gracza 2 -----------");
            tablicaPionkow.rysujTablice();
            System.out.println();
        }
            System.out.println("Koniec.");
        }
    }
