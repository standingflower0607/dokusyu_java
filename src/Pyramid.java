import java.util.*;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~10の数字を入力してください");
        while (true) {
            try {
                int num = sc.nextInt();
                if (num >= 1 && num <= 10) {
                    for (int i = 0; i < num; i++) {
                        for (int j = 0; j < num - (i + 1); j++) {
                            System.out.print("　");
                        }
                        for (int l = 0; l < (i + 1) * 2 - 1; l++) {
                            System.out.print("＊");
                        }
                        System.out.println();
                    }
                    break;
                } else {
                    System.out.println("1~10以内の数字を入力してください");
                }
            } catch (InputMismatchException e) {
                System.out.println("1~10以内の数字を入力してください");
                sc.next();
            }

        }

    }
}
