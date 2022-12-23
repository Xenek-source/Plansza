import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Plansza tablicaPionkow = new Plansza();
        Pionki pionek1 = new Pionki();
        System.out.println("----------- Aktualna plansza -----------");
        tablicaPionkow.addPionek(pionek1);
        tablicaPionkow.rysujTablice();
        System.out.println();
        System.out.println("Wciśnij Y jeżeli chcesz ruszyć pionem");
        char d = scan.next().charAt(0);
        while (d == 'y') {
            System.out.println();
            System.out.print("Wskaż sąsiedni A:");
            int x = scan.nextInt();
            System.out.print("Wskaż sąsiedni B:");
            int y = scan.nextInt();
            System.out.println();
            tablicaPionkow.movePionek(pionek1, x, y);
            System.out.println();
            System.out.println("----------- Aktualna plansza -----------");
            tablicaPionkow.rysujTablice();
            System.out.println();
        }
            System.out.println("Koniec.");
        }
    }
