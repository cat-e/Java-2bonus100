public class Bonus100 {
    public static void main(String[] args) {
        boolean over1000 = true;
        int account = 200;
        int percent;
        if (over1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int amount = 3500;
        int bonus = amount / 100 * percent;
        System.out.println(bonus);
    }
}

