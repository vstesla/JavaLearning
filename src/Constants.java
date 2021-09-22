/**
 * JAVA中的常量用final关键字来指示
 */
public class Constants {
    public static void main(String[] args) {
        final double KM_PER_MI = 1.609344;
        double ChineseRailwayLength = 164300;
        double MountEverestHeight = 8.84886;
        System.out.println("Chinese railway length and Mount Everest's height in miles:" + ChineseRailwayLength / KM_PER_MI + "AND" + MountEverestHeight / KM_PER_MI);
    }
}
