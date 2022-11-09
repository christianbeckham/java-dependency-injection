public class Main {
    public static void main(String[] args) {

        Blaster blaster = new Blaster();
        Sword sword = new Sword();
        Axe axe = new Axe();

        Robot robot_one = new Robot("Optimus Prime", blaster);
        Robot robot_two = new Robot("Megatron", sword);
        Robot robot_three = new Robot("Bumblebee", axe);

        robot_one.attack();
        robot_two.attack();
        robot_three.attack();
    }
}