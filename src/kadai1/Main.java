package kadai1;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        Wizard w = new Wizard();
        w.name ="アサカ";

        Matango m1 = new Matango('A');
        Matango m2 = new Matango('B');

        System.out.println("---勇者のターン---");
        h.attack(m1);
        h.run();

        System.out.println("\n---魔法使いのターン---");
        w.attack(m2);
        w.run();

    }
}