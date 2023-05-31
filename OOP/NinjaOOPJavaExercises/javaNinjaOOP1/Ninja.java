public class Ninja {

    // ==== MEMBER VARIBALES ====
    private String name;
    private int health;

    // CONSTRUCTOR(s) - make custom defaults
    // Empty Constructor
    // public Ninja(){}

    public Ninja(String name){
        this.name = name;
        this.health = 100; // by default 100
    }

    // Overloaded Constructor
    public Ninja(String name, int health){
            this.name = name;
            this.health = health; // by default 100
        }

//     ======== Methods ========
    public void displayStats(){
        System.out.println("Name: " + this.name);
        System.out.println("Health:" +Integer.toString(this.health));
    }

    public void eatStrawberry(){
        this.health += 10;
    }


    //* GETTERS & SETTERS

    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}