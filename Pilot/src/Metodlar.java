public class Metodlar {
    public static void main(String[] args) throws Exception {

        // dry-do not repeat yourself
        mesajVer("Kamil");
        mesajVer("Akif");
        mesajVer("Fazil");
        hesabla();
        hesabla();
        System.out.println(topla(5, 4));
        ikiEdedinCemininOnFaizi(40, 10);

    }

    public static void mesajVer(String ad) {
        System.out.println("Salam, " + ad);
    }

    public static void hesabla() {
        System.out.println("Hesablandi");
    }
    public static int topla(int x,int y){
        int cem=x+y;
        return cem;
    }
    public static void ikiEdedinCemininOnFaizi(int x,int y){
        int cem=topla(x, y);
        double cavab=cem/10;
        System.out.println(cavab);
    }
}

