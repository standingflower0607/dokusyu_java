import java.util.*;

public class Separation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("整数を入力してください");
                int num = sc.nextInt();
                System.out.println(String.format("%,d", num));
                break;
            }catch (InputMismatchException e){
                sc.next();
            }
        }

    }
}
