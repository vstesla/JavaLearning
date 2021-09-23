/**
 * JAVA输入与输出
 */
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;
public class InputAndOutput {       /*在前面的代码中，我们总是使用System.out.println()来向屏幕输出一些内容。
                                    println是print line的缩写，表示输出并换行。因此，如果输出后不想换行，可以用print()*/
    public static void main(String[] args) throws IOException {
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
        double d = 12900000;
        System.out.println(d); // 显示1.29E7
        double s = 3.1415926;
        System.out.printf("%.2f\n", s); // 显示两位小数3.14
        System.out.printf("%.4f\n", s); // 显示4位小数3.1416
        //输入
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出


    }
}
