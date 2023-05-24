import java.util.Arrays;
import java.util.ArrayList;

public class Intro {
    // entry point to compile
    // EVERYTHING will be executed
    public static void main(String[] args){
        // System.out.println("Hello and Welcome to JAVA !");

        //* ---------------------------------------- VARIABLES ----------------------------------------
        //? ===== PRIMITIVES =====
        int x = 3;
        // System.out.println(x);
        boolean vote = true;
        double pi = 3.14;
        float tax = 5.6f;
        char letter = 'a';

        //? ===== OBJECT TYPES (Class Wrappers) =====
        Integer y = 1254;
        String name = "Joe";
        Boolean isAdmin = false;
        Double anotherNumber = 45.89;

        // ------- STRING -------
        String a = "my name is Joe";
        String b = "my name is Mikey";
        // System.out.println(b.length());
        // System.out.println(a.indexOf("a"));
        // System.out.println(a.concat(b));

        // ------- ARRAYS ------- (fixed-length data structure)
        int[] numbers; // declare the array;
        numbers = new int[3]; // Instantiate
        // System.out.println(numbers);
        // System.out.println(Arrays.toString(numbers));

        int[] myArray = {33, 44, 55};
        // System.out.println(Arrays.toString(myArray));
        // ! can't do that - length is fixed to 3
        // myArray[3] = 77;
        myArray[2] = 101;
        // System.out.println(myArray[2]);
        // for( int i = 0; i < myArray.length; i++){
        //     System.out.println(myArray[i]);
        // }


        // ------- ARRAYSLIST ------- (Dynamic Array - variable-length data structure)
        // Declare & instantiate an ArrayList
        ArrayList<String> coolNames = new ArrayList<String>();

        // add elements to the ArrayList
        coolNames.add("Jammy"); 
        coolNames.add("Lauren");
        coolNames.add("Jack");
        coolNames.add("Jane");

        // System.out.println(coolNames);

        for (int i = 0; i < coolNames.size(); i++){
            // ArrayList.set() -> replace the element at the specified position in this list with the specified element
            System.out.println(coolNames.set(i, coolNames.get(i) + " is cool !"));
            if (coolNames.get(i) == "Jack"){
                System.out.println(coolNames.get(i) + " is the winner");
            }
        }
        System.out.println(coolNames);


        // ===============================================================
        
        // instantiate AnotherFile
        // AnotherFile sample = new AnotherFile();

        // sample.hello("Jane");
        // sample.hello("Jane", 8);

    }
}
