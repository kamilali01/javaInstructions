public class Giris {
    public static void main(String[] args) throws Exception {
    //  deyisenler
        int x = 55;
        int kredit = 100000;
        double ortalama=50.5;
        String isim="Kamil Aliyev";
        boolean sistemeGiris=true;
        System.out.println(x);
        System.out.println(kredit);
        System.out.println(ortalama);
        System.out.println(isim);
        System.out.println(sistemeGiris);

        //shert
        int not = 55;
        if (not >= 50) {
        System.out.println("kecdi");
        } else if (not >= 40) {
        System.out.println("butunleme");
        } else {
        System.out.println("qaldi");
        }

        // donguler
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        int eded = 10;
        while (eded >= 1) {
            System.out.println(x);
            x--;
        }
        int y = 10;
        do {
            System.out.println(y);
        } while (y > 11);
        System.out.println("end of the line");
}}
