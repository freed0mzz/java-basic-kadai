package kadai_015;

public class Car_Chapter15 {

    // フィールド
    private int gear = 1;   // ギア（初期値1）
    private int speed = 10; // 速度（初期値10）

    // ギア変更メソッド
    public void changeGear(int afterGear) {

        int beforeGear = this.gear; // 変更前を保存
        this.gear = afterGear;

        switch (gear) {
        case 1: speed = 10; break;
        case 2: speed = 20; break;
        case 3: speed = 30; break;
        case 4: speed = 40; break;
        case 5: speed = 50; break;
        default: speed = 10; break;
    }

    // ★追加（ここが重要）
    System.out.println("ギア" + beforeGear + "から" + gear + "に切り替えました");
}

// 走行
public void run() {
    // ★修正（ここも重要）
    System.out.println("速度は時速" + speed + "kmです");
}
}
