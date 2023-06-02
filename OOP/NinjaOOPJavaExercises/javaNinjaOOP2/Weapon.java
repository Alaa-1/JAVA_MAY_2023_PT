// NEW EXCITING CLASS!!!!!

public class Weapon {
// MEMBER VARIABLES
private String type;
private int damage;

// CONSTRUCTOR
public Weapon(String type, int damage){
    this.type = type;
    this.damage = damage;
}

// GETTERS AND SETTERS
   // GETTERS & SETTERS
    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    // GETTERS & SETTERS
    public int getDamage(){
        return this.damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }


}