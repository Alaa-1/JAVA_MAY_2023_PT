public class Test{

    public static void main (String[] args){

        // Instantiating an object from class
        // call the constructor -> return defaults
        ShoppingCart myCart = new ShoppingCart();

        System.out.println(myCart.store); // error: store has private access in ShoppingCart

    }
}