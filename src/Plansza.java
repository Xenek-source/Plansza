import java.util.Scanner;
public class Plansza {
    public Pionki[][] tablicaPionkow = new Pionki[8][8];
    Scanner scan = new Scanner(System.in);
    private int pozX, pozY;
    public void rysujTablice() {
        System.out.print("    ");
        for (int k = 0; k < 8; k++) {
            System.out.print("B" + k + " ");
        }
        for (int i = 0; i < 8; i++) {
            System.out.println();
            System.out.print(" A" + i + " ");
            for (int j = 0; j < 8; j++) {
                Pionki rysuj = tablicaPionkow[i][j];
                if (rysuj == null) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[x]");
                }}}}
    public void addPionek(Pionki pionek){
        int wys = 0;
        int szer = 0;
        tablicaPionkow[wys][szer] = pionek;
    }
    public void movePionek(Pionki pionek, int x, int y){

        Pionki sprawdzenie = tablicaPionkow[x][y];
     //tylko po skosie o 1
     //     if (((x == pozX+1) || (x == pozX-1)) && ((y == pozY+1) || (y == pozY-1))){
     //każdy kierunek o 1
        if ((((x == pozX+1) || (x == pozX)) || ((x == pozX-1) || (x == pozX))) && (((y == pozY+1) || (y == pozY)) || ((y == pozY-1) || (y == pozY)))){
            if (sprawdzenie == pionek) {
                System.out.println("------------------------");
                System.out.println("##### niedozwolony ruch");
            }
                delPionek();
                pozX = x;
                pozY = y;
                tablicaPionkow[pozX][pozY] = pionek;
            } else {
            System.out.println();
            System.out.println("------------------------");
            System.out.println("##### niedozwolony ruch");
        }
    }
    public void delPionek(){
        tablicaPionkow[pozX][pozY] = null;
    }
    }


