public class Main {
    public static void main(String[] args) {

        Weapon blaster = new Blaster();
        Weapon sword = new Sword();
        Weapon axe = new Axe();

        Attacker robot_one = new Robot("Optimus Prime", blaster);
        Attacker robot_two = new Robot("Megatron", sword);
        Attacker robot_three = new Robot("Bumblebee", axe);

        robot_one.attack();
        robot_two.attack();
        robot_three.attack();

        Attacker wolf = new Werewolf("Oz", 35);
        wolf.attack();
    }
}