import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        String message = ""; // 肥満度を表示するメッセージ

        System.out.println("BMIを計算して肥満度を表示します。");

        System.out.print("・身長(m)を入力してください:");
        double height = stdIn.nextDouble();
        System.out.print("・体重(kg)を入力してください");
        double weight = stdIn.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        /** 肥満度の判定
         * 18.5未満　低体重(やせ型)
         * 18.5~25未満  普通体重
         * 25~30未満    肥満(level1)
         * 30~35未満    肥満(level2)
         * 35~40未満    肥満(level3)
         * 40以上       肥満(level4)
         */
        if (bmi < 18.5) {
            message = "低体重 (やせ型)";
        } else if (bmi >= 18.5 && bmi < 25) {
            message = "普通体重";
        } else if (bmi >= 25 && bmi < 30) {
            message = "肥満(level1)";
        } else if (bmi >= 30 && bmi < 35) {
            message = "肥満(level2)";
        } else if (bmi >= 35 && bmi < 40) {
            message = "肥満(level3)";
        } else if (bmi >= 40 ) {
            message = "肥満(level4)";
        }

        System.out.println("------------------------------------");
        System.out.println("BMI値は" + bmi + "です。");
        System.out.println("診断結果:" + message);
        System.out.println("------------------------------------");
    }
}
