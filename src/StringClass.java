/**
 * Java的编译器对字符串做了特殊照顾，可以使用+连接任意字符串和其他数据类型
 */
public class StringClass {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "world";
        String s3 = s1 + " " + s2 + "!";
        System.out.println(s3);
        //如果用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接
        int age = 25;
        String s4 = "age is " + age;
        System.out.println(s4);
        //子串，String类的substring方法可以从一个较大的字符串提取出一个子串
        String greeting = "Hello";
        String s5 = greeting.substring(0,4);
        System.out.println(s5);
        //检测字符串是否相等
        String sen = "Hello,my friend.";
        if(sen == "Hello,my friend.")
            System.out.println("Equals");
        else System.out.println("Different");
        if(greeting.substring(0,4) == "Hell")
            System.out.println("Equals");
        else System.out.println("Unequal");

    }
}
