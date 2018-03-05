public class KLausuraufgabe_1 {

    public static void main(String args[]) {
        System.out.println("Ergebnis: " + fakultaet(1, 4));

    }

    public static int fakultaet(int x, int y){
        if(y == 1){
            return x;
        }else{
            return fakultaet(x*y, y - 1);
        }
    }
}
