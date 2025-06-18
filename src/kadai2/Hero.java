package kadai2;

public class Hero extends Character {
    public void attack(Matango m1){
        System.out.println(this.name +"の攻撃！");
        System.out.println("敵に10のダメージを与えた！");
        m1.hp -= 10;
    }

}
