public class Hello {
    public static void main(String[] args) {
        Cake first = new Cake();
        System.out.println(first.eat());

        Cake second = new Cake(3, true, true, "red velvet");
        System.out.println(second.eat());
    }
}