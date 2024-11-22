public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Hello Dave!");
        Dog dingo = new Dog(25, "Besenji", "Dingo Dog");
        
        dingo.bark();
        System.out.println("This dog is a " + dingo.getBreed() + "!");
        
        Dog [] kayla = new Dog[3];

        kayla [0] = dingo;
        kayla [0].bark();
        
    }
}