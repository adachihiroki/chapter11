public class Fool extends Character implements Human {
    public void attack() {
        System.out.println(this.name + "は戦わず遊んでいる");
    }
    public void talk() {
        System.out.println(this.name + "は意味のないことを話した");
    }
    public void hear() {
        System.out.println(this.name + "は虚空を見つめている");
    }
    public void watch() {
        System.out.println(this.name + "は誰かの声を聴いた気がした");
    }
    public void run() {
        System.out.println(this.name + "は大笑いしながら逃げ出した");
    }
}
