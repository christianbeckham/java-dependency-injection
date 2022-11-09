public class Werewolf implements Attacker {
    public String name;
    public int attackPower;

    public Werewolf(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void attack() {
        System.out.println(this.name + " attacked with a power of " + this.attackPower);
    }
}
