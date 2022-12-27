import java.util.Scanner;
public class Plansza {
    public Pionki[][] tablicaPionkow = new Pionki[8][8];
    Scanner scan = new Scanner(System.in);
    private int pozX, pozY;
    private Pionki pionekA,pionekB, rysuj;
    public void addPlayer1(Pionki pionekA, int x, int y){
        pozX = x;
        pozY = y;
        tablicaPionkow[pozX][pozY] = pionekA;
    }
    public void addPlayer2(Pionki pionekB, int x, int y){
        pozX = x;
        pozY = y;
        tablicaPionkow[pozX][pozY] = pionekB;
    }
    public void rysujTablice() {
        System.out.println("          Gracz 2");
        System.out.print("    ");
        for (int k = 0; k < 8; k++) {
            System.out.print("B" + k + " ");
        }
        for (int i = 0; i < 8; i++) {
            System.out.println();
            System.out.print(" A" + i + " ");
            for (int j = 0; j < 8; j++) {
                rysuj = tablicaPionkow[i][j];
             //   System.out.print(rysuj);
                if(rysuj == null){
                    System.out.print("[ ]");
                }
                else{
                    System.out.print("[x]");
                }
            }}
        System.out.println();
        System.out.print("          Gracz 1");
        System.out.println();

    }
    public void movePionek1(){
        System.out.println("Wskaż pionka GRACZ 1");
        System.out.print("A:"); pozX = scan.nextInt();
        System.out.print("B:"); pozY = scan.nextInt();
        System.out.println("Wskazałeś pole:" + "A"+pozX+" B"+pozY);
        pionekA = tablicaPionkow[pozX][pozY];
        System.out.println();
        if (pionekA == null){
            System.out.println("Nie ma tu żadnego pionka");
        } else {
        System.out.print("Wskaż sąsiedni A:");
        int x = pozX;
        int y = pozY;
        x = scan.nextInt();
        System.out.print("Wskaż sąsiedni B:");
        y = scan.nextInt();
        System.out.println();

        Pionki sprawdzenie = tablicaPionkow[x][y];
     //tylko po skosie o 1
     //     if (((x == pozX+1) || (x == pozX-1)) && ((y == pozY+1) || (y == pozY-1))){
     //każdy kierunek o 1
        if ((((x == pozX+1) || (x == pozX)) || ((x == pozX-1) || (x == pozX))) && (((y == pozY+1) || (y == pozY)) || ((y == pozY-1) || (y == pozY)))){
            if ((sprawdzenie != null)||(sprawdzenie == pionekA)) {
                System.out.println("------------------------");
                System.out.println("##### niedozwolony ruch");
                } else {
                delPionek();
                pozX = x;
                pozY = y;
                tablicaPionkow[pozX][pozY] = pionekA; }
            }}}
    public void movePionek2(){
        System.out.println("Wskaż pionka GRACZ 2");
        System.out.print("A:"); pozX = scan.nextInt();
        System.out.print("B:"); pozY = scan.nextInt();
        System.out.println("Wskazałeś pole:" + "A"+pozX+" B"+pozY);
        pionekB = tablicaPionkow[pozX][pozY];
        System.out.println();
        if (pionekB == null){
            System.out.println("Nie ma tu żadnego pionka");
        } else {
            System.out.print("Wskaż sąsiedni A:");
            int x = pozX;
            int y = pozY;
            x = scan.nextInt();
            System.out.print("Wskaż sąsiedni B:");
            y = scan.nextInt();
            System.out.println();

            Pionki sprawdzenie = tablicaPionkow[x][y];
            //tylko po skosie o 1
            //     if (((x == pozX+1) || (x == pozX-1)) && ((y == pozY+1) || (y == pozY-1))){
            //każdy kierunek o 1
            if ((((x == pozX+1) || (x == pozX)) || ((x == pozX-1) || (x == pozX))) && (((y == pozY+1) || (y == pozY)) || ((y == pozY-1) || (y == pozY)))){
                if ((sprawdzenie != null)||(sprawdzenie == pionekB)) {
                    System.out.println("------------------------");
                    System.out.println("##### niedozwolony ruch");
                } else {
                    delPionek();
                    pozX = x;
                    pozY = y;
                    tablicaPionkow[pozX][pozY] = pionekB; }
            }}}
    public void delPionek(){
        tablicaPionkow[pozX][pozY] = null;
    }
    public void addPionki(){
        Pionki pionek1 = new Pionki();
        Pionki pionek2 = new Pionki();
        Pionki pionek3 = new Pionki();
        Pionki pionek4 = new Pionki();
        Pionki pionek5 = new Pionki();
        Pionki pionek6 = new Pionki();
        Pionki pionek7 = new Pionki();
        Pionki pionek8 = new Pionki();
        Pionki pionek9 = new Pionki();
        Pionki pionek10 = new Pionki();
        Pionki pionek11 = new Pionki();
        Pionki pionek12 = new Pionki();
        Pionki pionek13 = new Pionki();
        Pionki pionek14 = new Pionki();
        Pionki pionek15 = new Pionki();
        Pionki pionek16 = new Pionki();
        addPlayer1(pionek1,7,0);
        addPlayer1(pionek2,7,1);
        addPlayer1(pionek3,7,2);
        addPlayer1(pionek4,7,3);
        addPlayer1(pionek5,7,4);
        addPlayer1(pionek6,7,5);
        addPlayer1(pionek7,7,6);
        addPlayer1(pionek8,7,7);
        addPlayer2(pionek9,0,0);
        addPlayer2(pionek10,0,1);
        addPlayer2(pionek11,0,2);
        addPlayer2(pionek12,0,3);
        addPlayer2(pionek13,0,4);
        addPlayer2(pionek14,0,5);
        addPlayer2(pionek15,0,6);
        addPlayer2(pionek16,0,7);
    }
    }


