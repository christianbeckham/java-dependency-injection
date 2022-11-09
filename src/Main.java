public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Weapon sword = new Weapon("Sword", 50);
        Weapon axe = new Weapon("axe", 80);
        Robot robot_one = new Robot(axe);
        System.out.println(robot_one.name);
        robot_one.attack();
    }
}