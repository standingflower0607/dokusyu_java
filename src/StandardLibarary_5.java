public class StandardLibarary_5 {
    public static void main(String[] args){
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
        System.out.println(str.startsWith("にわ",8));
        System.out.println(str.endsWith("いない"));

        // substring charAt
        var mail = "tachibanna@gmail.com";
        System.out.println(mail.substring(mail.lastIndexOf("@") + 1, mail.length()));
        System.out.println(mail.charAt(4));

        // split join
        var str1 = "aa,bbb,cccc";
        var result1 = str1.split(",");
        System.out.println(String.join("&", result1));

        

    }
}
