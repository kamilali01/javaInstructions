public class OOP {
    public static void main(String[] args) throws Exception {
        //SOLID, POLIMORPHISM
        creditManager creditManager=new creditManager();
        creditManager.add();
        creditManager.calculator();

        creditManager[] credits=new creditManager[2];
        credits[0]=new mortgageManager();
        credits[1]=new vehicleManager();

        for(int i=0;i<credits.length;i++){
            credits[i].calculator();
        }
    }
}
