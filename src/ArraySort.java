import java.util.Scanner;

/**
 * 数组排序
 */
import java.util.*;
public class ArraySort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the biggest number you can draw?");
        int n = in.nextInt();

        //填充数组
        int [] numbers = new int[n];
        for(int i = 0;i < numbers.length;i++)
            numbers[i] = i + 1;

        //输入k个数字并把它们存入第二个数组
        int [] result = new int[k];
        for(int i = 0;i < result.length;i++){
            int r = (int) (Math.random() * n);//生成一个随机序列范围在0到n-1之间
            result[i] = numbers[r];//随机选一个元素
            numbers[r] = numbers[n - 1];//把最后一个元素移动到一个随机的地方
            n--;
        }

        Arrays.sort(result);
        System.out.println("Bet the following combination. It will make you rich!");
        for(int r : result)
            System.out.println(r);



    }
}
