public class TestNinja {
    public static void main(String[] args) {

        // Predict the Output (if there are any errors,
        // try to predict what it will say, and then fix it.)
        Ninja ninja1 = new Ninja("Leo");
        ninja1.displayStats();
        // ! To access private variables we need Getters & Setters
        // System.out.println(ninja1.getHealth());
        // ninja1.setHealth(999);
        // System.out.println(ninja1.getHealth());
        // // Get the name of ninja
        // System.out.println(ninja1.getName());


        // create a new instance
        Ninja kikomo = new Ninja("Kikomo");
        kikomo.displayStats();
        kikomo.eatStrawberry();
        kikomo.displayStats();


        // Instantiate a new ninja
        Ninja ninja2 = new Ninja("Leo", 1000);
        ninja2.displayStats();
        
    }


    //? STEPS
    //*1. Create a class
    //*2. Create Member Variables (private)
    //!2a. Build Getters & Setters
    //*3. Create a Constructor(s) (Otherwise JAVA will provides an empty one)
    //*4. Create some methods
    IDE -- Code Editor

}