/**
 * 在JAVA中，经常希望某一个常量可以在一个类的多个方法中使用，通常将这些常量称为类常量(class constant)。使用static final设置类常量。
 */
public class Constants2 {
    public static final double KM_PER_MI = 1.609344;
    public static void main(String[] args) {
        double ChineseRailwayLength = 164300;
        double MountEverestHeight = 8.84886;
        System.out.println("Chinese railway length and Mount Everest's height in miles:" + ChineseRailwayLength / KM_PER_MI + "AND" + MountEverestHeight / KM_PER_MI);
    }
}
