public class ControlStatements_4 {

    public static void main (String[] args){
        for(int i = 1; i < 10; i++ ){
            for(int j = 1; j < 10; j++){
                // %2 は最低2 桁出力する命令。 1桁だったら空白で埋める
                System.out.printf(" %2d",i * j);
            }
            System.out.print("\n");
        }
        var sum =0;
        for (int k = 100; k <= 200; k++){
            if (k % 2 == 0){
                continue;
            }
            sum += k;

        }
        System.out.println(sum);

        var language = "Scala";

        switch(language){
            case "Scala":
            case "Kotlin":
            case "Groovy":
                System.out.println("JVM言語");
                break;
            case "C#":
            case "Visual Basic":
                System.out.println(".NET言語");
            default:
                System.out.println("不明");
        }
    }

}
