import oop.Animal;
import oop.Mammal;
import oop.Platypus;

public class Hello {
    public static void main(String[] args) {
         // System.out.println("new dawn, new day.");
         Platypus perry = new Platypus("Perry", 0);
         System.out.println(perry.eat("shrimp"));
         System.out.println(perry.sleep());

         assert perry instanceof Animal;
         assert perry instanceof Mammal;
         assert perry instanceof Platypus;

        perry.setName("Fineous");
        System.out.println(perry.eat("shrimp"));
        System.out.println(perry.sleep());

    }
}