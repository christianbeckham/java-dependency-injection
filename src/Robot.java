public class Robot {

    public String name;
    public Weapon weapon;

    public Robot(Weapon weapon) {
        this.name = "Optimus Prime";
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println(this.name + " attacks with a " + this.weapon.name + " for " + this.weapon.power + " damage!");
    }
}