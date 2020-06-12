public class Bonus100 {
    public static void main(String[] args) {
        int account = 200;
        int amount = 1199;
        int percent = amount >= 1000 ? 1 : 0;

        int bonus = amount / 100 * percent;
        System.out.println(bonus);
    }
}

