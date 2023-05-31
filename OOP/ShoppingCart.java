import java.util.ArrayList;
// Solution
public class ShoppingCart {

// Member Varibales
private String store; // null
public double total; // 0.0
public ArrayList<String> items = new ArrayList<String>(); // []

// Method
public void add_item(String item, double price){

this.items.add(item);
this.total += price;

}

}