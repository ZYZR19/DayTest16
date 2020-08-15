package DayDayTest;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-07-09
 * Time: 15:08
 */
public class Test0709 {
    //算球的半径和体积
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();
        double r = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)+Math.pow(z1-z2,2));
        //输入球心坐标和球上一点的坐标 算半径 半径就是各个坐标相减的平方再开根号
        //就是两坐标之间的距离
        double v = 4/3.0*Math.acos(-1)*Math.pow(r,3);
        //球的体积 4/3*pi*r^3
        DecimalFormat format = new DecimalFormat("0.000");
        //将数字进行格式化 变成你需要的样子 此处要保留三位小数
        System.out.println(format.format(r)+" " + format.format(v));

    }
    //坏键问题 看不懂英文题
}
