package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    public String getMyChoice() {

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            input = scanner.nextLine();

            if (input.equals("r") || input.equals("s") || input.equals("p")) {
                return input;
            } else {
                System.out.println("入力が正しくありません。もう一度入力してください。");
            }
        }
    }

    public String getRandom() {

        String[] choices = {"r", "s", "p"};
        double randomValue = Math.random() * 3;
        int index = (int) Math.floor(randomValue);

        return choices[index];
    }

    public void playGame(String my, String enemy) {

        HashMap<String, String> map = new HashMap<>();
        map.put("r", "グー");
        map.put("s", "チョキ");
        map.put("p", "パー");

        System.out.println("自分の手は" + map.get(my) + ",対戦相手の手は" + map.get(enemy));

        if (my.equals(enemy)) {
            System.out.println("あいこです");
        } else if (
            (my.equals("r") && enemy.equals("s")) ||
            (my.equals("s") && enemy.equals("p")) ||
            (my.equals("p") && enemy.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}