import java.math.BigInteger;
import java.text.NumberFormat;
import java.time.*;
import java.util.*;
import java.util.regex.Pattern;

public class StandardLibarary_5 {
    public static void main(String[] args) {
        // str -> num  parseXxxx
        System.out.println(Integer.parseInt("333"));
        System.out.println(Integer.parseInt("FF", 16));
        System.out.println(Double.parseDouble("1.343"));
        System.out.println(Double.parseDouble("0.643e2"));

        // num -> str  String.valueOF() || RapperClass.toString()
        System.out.println(String.valueOf(108));
        System.out.println(Integer.toString(108));
        System.out.println(Double.toString(1.3443));
        System.out.println(Integer.toString(255, 16));
        System.out.println(Integer.toHexString(255) instanceof String);

        // String compareTo Unicode値で比較
        System.out.println("def".compareTo("abc"));
        System.out.println("def".compareTo("def"));
        System.out.println("def".compareTo("xyz"));
        System.out.println("def".compareToIgnoreCase("DEF"));

        // isEmpty isBlank(since 11)
        System.out.println("".isEmpty());
        System.out.println("   ".isEmpty());
        System.out.println("   ".isBlank());

        // strip(since 11) trim(before)
        System.out.println("  aaa  ".strip());
        System.out.println("  aaa  ".stripLeading());
        System.out.println("  aaa  ".stripTrailing());

        // indexOf　見つからない時は　-1
        var str = "にわにはにわにわとりがいる";
        System.out.println(str.indexOf("にわ"));
        System.out.println(str.indexOf("にも"));
        System.out.println(str.lastIndexOf("にわ"));
        System.out.println(str.indexOf("にわ", 3));

        // contains startsWith endsWith

        System.out.println(str.contains("にわ"));
        System.out.println(str.startsWith("にわ"));
        System.out.println(str.startsWith("にわ", 8));
        System.out.println(str.endsWith("いない"));

        // substring charAt
        var mail = "tachibanna@gmail.com";
        System.out.println(mail.substring(mail.lastIndexOf("@") + 1, mail.length()));
        System.out.println(mail.charAt(4));

        // split join
        var str1 = "aa,bbb,cccc";
        var result1 = str1.split(",");
        System.out.println(String.join("&", result1));

        // regular expression
        var tel = new String[]{"080-0000-0000", "084-000-0000", "184-0000"};
        var rx = "\\d{2,4}-\\d{2,4}-\\d{4}";
        for (var t : tel) {
            System.out.println(Pattern.matches(rx, t) ? t : "unmatch");
        }

        var str2 = "会社の電話番号は0123-99-0000です。自宅は000-123-4567でございます。";
        var ptn = Pattern.compile("(\\d{2,4})-(\\d{2,4})-(\\d{4})");
        var match = ptn.matcher(str2);
        // matcherを使うと一回でコンパイルが済むので、ループさせるときに便利
        while (match.find()) {
            System.out.println("開始位置:" + match.start());
            System.out.println("終了位置:" + match.end());
            System.out.println("マッチング文字列:" + match.group());
            System.out.println("市外局番:" + match.group(1));
            System.out.println("市内局番:" + match.group(2));
            System.out.println("加入者番号:" + match.group(3));
            System.out.println("---------------");
        }

        var str3 = "住所は160-0000 新宿区南町0-0-0です。\n あなたの住所は210-9999 川崎市北町1-1-1ですね";
        var ptn3 = Pattern.compile("(\\d{3}-\\d{4})");
        var match3 = ptn3.matcher(str3);
        while (match3.find()) {
            System.out.println(match3.group());
        }



        System.out.println(LocalDateTime.now());
        System.out.println(OffsetDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

        var dt1 = LocalDateTime.of(2019, 12, 31,10,20,30);
        var dt2 = LocalDateTime.of(2019, 12,31,10,20,35);
        System.out.println(dt1.equals(dt2));
        System.out.println(dt1.isAfter(dt2));
        System.out.println(dt1.isBefore(dt2));


        // Math

        System.out.println(Math.abs(-100));
        System.out.println(Math.max(6, 3));
        System.out.println(Math.min(6, 3));
        System.out.println(Math.ceil(1234.56));
        System.out.println(Math.floor(1234.56));
        System.out.println(Math.round(1234.56));
        System.out.println(Math.sqrt(10000));
        System.out.println(Math.cbrt(10000));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.sin(Math.toRadians(30)));
        System.out.println(Math.cos(Math.toRadians(60)));
        System.out.println(Math.tan(Math.toRadians(45)));
        System.out.println(Math.log(100));
        System.out.println(Math.log10(100));

        long result = 1;
        for (var i = 1; i < 26; i++){
            result *= i;
            System.out.println(result);
        }

        var result2 = BigInteger.valueOf(1);
        for (var i = 1; i< 26 ; i++){
            result2 = result2.multiply(BigInteger.valueOf(i));
            System.out.println(result2);
        }


        // Random
        var rnd = new Random();
        System.out.println(rnd.nextBoolean());
        System.out.println(rnd.nextFloat());
        System.out.println(rnd.nextDouble());
        System.out.println(rnd.nextInt(100));
        System.out.println(rnd.nextLong());

        // NumberFormat
        var num1 = 1234.5678;
        var nf1 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        var nf2 = NumberFormat.getIntegerInstance();
        var nf3 = NumberFormat.getNumberInstance();
        System.out.println(nf1.format(num1));
        System.out.println(nf2.format(num1));
        System.out.println(nf3.format(num1));

        var num2 = 0.567;
        var nf4 = NumberFormat.getPercentInstance();
        System.out.println(nf4.format(num2));

        // Array

        var array1 = new String[] { "dog", "cat", "mouse", "fox", "lion"};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.binarySearch(array1, "mouse"));

        var array2 = new String[] {"あ", "い", "う", "え", "お"};
        var array3 = Arrays.copyOf(array2, 2);
        System.out.println(Arrays.toString(array3));

        var array4 = Arrays.copyOfRange(array2, 1, 7);
        System.out.println(Arrays.toString(array4));

        Arrays.fill(array4, 3, 6, "-");
        System.out.println(Arrays.toString(array4));

        //test

        var testStr1 = "となりのきゃくはよくきゃくくうきゃくだ";
        System.out.println(testStr1.lastIndexOf("きゃく"));
        System.out.println(String.format("%sの気温は%.2f℃です", "千葉", 17.256));

        System.out.println("彼女の名前は花子です".replace("彼女", "妻"));

        var testDate = LocalDateTime.now();
        System.out.println(testDate.plusDays(5).plusHours(6));

        var testDate2 = LocalDateTime.of(2020, 3, 12, 0,0,0);
        var testDate3 = LocalDateTime.of(2018, 11, 5,0,0,0);
        var period = Period.between(testDate3.toLocalDate() ,testDate2.toLocalDate() );
        System.out.println(period.getMonths() + "ヶ月間" + period.getDays() + "日間");

        System.out.println(Math.pow(6, 3));
        System.out.println(Math.abs(-15));
        var testArray = new int[] {110, 14, 28, 32};
        Arrays.sort(testArray);
        System.out.println(Arrays.toString(testArray));




    }
}
