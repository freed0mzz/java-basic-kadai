package kadai_028;

public class JyankenExec_Chapter28 {

    public static void main(String[] args) {

        Jyanken_Chapter28 game = new Jyanken_Chapter28();

        String my = game.getMyChoice();
        String enemy = game.getRandom();

        game.playGame(my, enemy);
    }
}