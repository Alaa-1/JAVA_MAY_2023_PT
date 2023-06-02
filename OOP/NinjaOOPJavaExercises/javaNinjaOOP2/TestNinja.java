public class TestNinja {
    public static void main(String[] args) {
    
    // INSTANTIATE Weapon !

        Weapon katana = new Weapon("Sword", 92);
        Weapon shredderWeapon = new Weapon("armor", 92);


    // INSTANTIATE NINJAS !

        // Ninja unknown = new Ninja();
        // Ninja ninja1 = new Ninja("Leonardo", 200, "sword", 75);
        Ninja ninja1 = new Ninja("Leonardo", 200, katana, 75);
        Ninja villan = new Ninja("Shredder", 500,shredderWeapon , 100);


        // ninja1.displayStats();
        villan.displayStats();
        System.out.println("===========");
        ninja1.attack(villan);
        System.out.println("===========");
        villan.displayStats();
        // System.out.println("===========");
        // unknown.displayStats();
        // System.out.println(ninja1.getName());
        // villan.displayStats();
        // System.out.println("===========");
        // System.out.println("===========");
        // villan.displayStats();

        // System.out.println(Ninja.getNumberOfNinja());
        // Ninja.SayHello();
        //TODO make the weapon a class and refactor (association)
    }

}