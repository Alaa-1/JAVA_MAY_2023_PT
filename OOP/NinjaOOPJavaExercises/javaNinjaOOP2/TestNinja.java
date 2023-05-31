public class TestNinja {
    public static void main(String[] args) {
    
    // INSTANTIATE NINJAS !
        Ninja unknown = new Ninja();
        Ninja ninja1 = new Ninja("Leonardo", 200, "sword", 75);
        Ninja villan = new Ninja("Shredder", 500, "claws", 100);

        ninja1.displayStats();
        // unknown.displayStats();
        // System.out.println(ninja1.getName());
        // villan.displayStats();
        // System.out.println("===========");
        // ninja1.attack(villan);
        // System.out.println("===========");
        // villan.displayStats();

        // System.out.println(Ninja.getNumberOfNinja());
        // Ninja.SayHello();
        //TODO make the weapon a class and refactor (association)
    }

}