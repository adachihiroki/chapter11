package kadai2;

public class Wizard extends Character {
    public void attack(Matango m2){
        System.out.println(this.name + "の攻撃");
        System.out.println( "魔法使いは火の玉を放った");
        System.out.println("敵に7ダメージを与えた");
        m2.hp -= 7;
    }
}
