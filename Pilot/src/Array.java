public class Array {
    public static void main(String[] args) throws Exception {
        String[] seherler1 = new String[] { "Baki", "Sumqayit", "Lenkeran" };
        for (String seher : seherler1) {
            System.out.println(seher);
        }//foreach
        for(int i=0;i<seherler1.length;i++){
            System.out.println(seherler1[i]);
        }

        int [] sayilar=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(sayiBul(sayilar, 3));
    }
    static boolean sayiBul(int[] dizi,int sayi){
        boolean vardir =false;
        for (int i : dizi) {
            if(i==sayi){
               vardir=true;
            }
        }
        return vardir;
    }
}
