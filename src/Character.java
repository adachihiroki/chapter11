public abstract class Character {
    String name ="怠け者";
    int hp;
    public void run(){
        System.out.println(this.name+"は逃げ出した");
    }
    public abstract void talk();
}
