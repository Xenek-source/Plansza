import java.util.Scanner;
public class Plansza {
    public Pionki[][] tablicaPionkow = new Pionki[8][8];
    Scanner scan = new Scanner(System.in);
    private int pozX, pozY;
    private Pionki pionek, rysuj;
    public void rysujTablice() {
        System.out.print("    ");
        for (int k = 0; k < 8; k++) {
            System.out.print("B" + k + " ");
        }
        for (int i = 0; i < 8; i++) {
            System.out.println();
            System.out.print(" A" + i + " ");
            for (int j = 0; j < 8; j++) {
                rysuj = tablicaPionkow[i][j];
                if (rysuj == null) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[x]");
                }}}}
    public void addPionek(Pionki pionek, int x, int y){
        pozX = x;
        pozY = y;
        tablicaPionkow[pozX][pozY] = pionek;
    }
    public void movePionek(){
        System.out.println("Wskaż pionka");
        System.out.print("A:"); pozX = scan.nextInt();
        System.out.print("B:"); pozY = scan.nextInt();
        System.out.println("Wskazałeś pole:" + "A"+pozX+" B"+pozY);
        pionek = tablicaPionkow[pozX][pozY];
        System.out.println();
        if (pionek == null){
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
            if ((sprawdzenie != null)||(sprawdzenie == pionek)) {
                System.out.println("------------------------");
                System.out.println("##### niedozwolony ruch");
                } else {
                delPionek();
                pozX = x;
                pozY = y;
                tablicaPionkow[pozX][pozY] = pionek; }
            }}}
    public void delPionek(){
        tablicaPionkow[pozX][pozY] = null;
    }
    }


