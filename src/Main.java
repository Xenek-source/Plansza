import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Plansza tablicaPionkow = new Plansza();
        Pionki pionek1 = new Pionki();
        tablicaPionkow.addPionek(pionek1);
        tablicaPionkow.rysujTablice();
        System.out.println();
        System.out.println("Wciśnij Y jeżeli chcesz ruszyć pionem");
        char d = scan.next().charAt(0);
        while (d == 'y') {
            System.out.println("Poruszasz pionkiem");
            System.out.print("Wskaż sąsiedni X:");
            int x = scan.nextInt();
            System.out.print("Wskaż sąsiedni Y:");
            int y = scan.nextInt();
            tablicaPionkow.movePionek(pionek1, x, y);
            tablicaPionkow.rysujTablice();
            System.out.println();
            System.out.println("-----");
        }
            System.out.println("Koniec.");
        }
    }
