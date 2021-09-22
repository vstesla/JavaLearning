/**
 * JAVA数组
 */
public class Array {
    public static void main(String[] args) {
        int[] ns = new int[5];/*Java的数组有几个特点：
                                数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
                                数组一旦创建后，大小就不可改变。*/
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;

        System.out.println(ns.length);//可以用数组变量.length获取数组大小
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s);
    }
}
