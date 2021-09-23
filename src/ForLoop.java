import java.util.*;

/**
 * for循环
 */
public class ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        int LotteryOdds = 1;
        for(int i = 1;i <= k;i++)
            LotteryOdds = LotteryOdds * (n - i + 1) / i;
        System.out.println("Your odds are 1 in " + LotteryOdds + ". Good luck!");
    }
}
