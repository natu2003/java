public class myshop{
    public static void main(String[] args) {
        System.out.println("my store");
        int price[] = {10,15,10,10,12};
        String specials[] ={"Tea","coffe","vada","idly","porotta"};
        for (int i = 1; i < 5; i++) {
      System.out.println("specials: " + specials[i-1] + " \n price: " + price[i-1]);
        }
    }
}