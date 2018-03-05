public class lazarsche_dreieck {
    public static void main(String args[]){
        int i = suche(3, 2, 5);
        System.out.println("Ergebnis: "+ i);
    }

    public static int suche(int zeile, int spalte, int groesse){
        if(zeile == 0 || spalte == 0 || zeile == groesse - 1 || spalte == groesse - 1){
            return 1;
        }else{
            return suche(zeile - 1, spalte - 1, groesse) + suche(zeile - 1, spalte, groesse);
        }

    }
}
