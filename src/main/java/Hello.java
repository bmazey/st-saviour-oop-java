import java.util.ArrayList;

public class Hello {
    public static void main(String[] args) {

        // ArrayList demonstration.
        ArrayList<String> jolibee = new ArrayList<String>();
        jolibee.add("Honey BBQ Tenders 6pc");
        jolibee.add("XL Lemonade");
        jolibee.add("Spaghetti");
        jolibee.add(1, "French Fries");

        for(String item : jolibee) {
            System.out.println(item);
        }

        if (jolibee.contains("Small Lemonade")) {
            System.out.println("Small Lemonade is in the list!");
        } else {
            System.out.println("Small Lemonade is NOT in the list!");
        }
    }
}