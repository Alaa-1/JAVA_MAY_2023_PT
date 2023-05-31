public class Ninja{

    // MEMBER VARIABLES
    private String name;
    private Integer health;
    private String weapon;
    private int power;
    // ClASS VARIABLES
    private static int numberOfNinja = 0;
    // private static String dojoName = "Coding DOJO";

    // CONSTRUCTOR
    public Ninja(){
        this.name = "Anonymous";
        this.health = 100;
        this.weapon = "punches";
        this.power = 25;
        numberOfNinja ++;
    }

    // Overloading Constructor
    public Ninja(String name, Integer health, String weapon, int power){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.power = power;
        numberOfNinja ++;
    }

    // Methods
    public void displayStats(){
        System.out.println(String.format("Name: %s \n Health: %d \n Weapon: %s \n Power: %d", this.name, this.health, this.weapon, this.power ));
    }

    public void attack(Ninja anotherNinja){
        System.out.println(this.getName() + " is attacking " + anotherNinja.getName());
        // anotherNinja's health - this Ninja's power
        anotherNinja.setHealth(anotherNinja.getHealth() - this.getPower());
        System.out.println(anotherNinja.getName() + " now has " + anotherNinja.getHealth() + " HP left.");

    }

    // public static void SayHello(){
    //     System.out.println("Hello Ninjas !" + numberOfNinja);
    // }

    // GETTERS & SETTERS
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getHealth(){
        return this.health;
    }

    public void setHealth(Integer health){
        this.health = health;
    }

    public String getWeapon(){
        return this.weapon;
    }

    public void setWeapon(String weapon){
        this.weapon = weapon;
    }

    public int getPower(){
        return this.power;
    }

    public void setPower(int power){
        this.power = power;
    }

    public static int getNumberOfNinja(){
        return numberOfNinja;
    }

    public static void setNumberOfNinja(int numberOfNinja){
        numberOfNinja = numberOfNinja;
    }




}