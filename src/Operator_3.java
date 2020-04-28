import java.math.BigDecimal;
import java.util.*;

public class Operator_3 {

    public static void main(String[] args){

        // StringBuilder
        var builder = new StringBuilder();
        for (var i = 0;  i< 1000000; i++){
            builder.append("いろは");
        }
        var result = builder.toString();
        // System.out.println(result);

        // == は同一性 equals は同値性
        var data1 = new int[]{1,2,3} ;
        var data2 = new int[]{1,2,3};
        System.out.println(data1 == data2);
        System.out.println(Arrays.equals(data1, data2));

        // 浮動小数点数は内部的に2進数として扱われるため、10進数的に同値であっても、2進数にすると無限小数だったりする
        System.out.println(0.2 * 3 == 0.6);

        var bd1 = new BigDecimal("0.2");
        var bd2 = new BigDecimal("3");
        var bd3 = new BigDecimal("0.6");

        System.out.println(bd1.multiply(bd2).compareTo(bd3));

        // bdを使わない丸め単位を利用する方法
        final double EPSILON = 0.0001;
        var x = 0.2 * 3;
        var y = 0.6;
        System.out.println(Math.abs(x - y) < EPSILON);

    }
}
