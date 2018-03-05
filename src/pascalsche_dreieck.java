public class pascalsche_dreieck {
    public static void main(String args[]){
        int i = suche(4,2);
        System.out.println("Ergebnis: " + i);
    }
    public static int suche(int zeile, int spalte){
        if(spalte == 0 || spalte == zeile){
            return 1;
        }else{
            return suche(zeile - 1, spalte -1) + suche(zeile - 1, spalte);
        }
    }
}
