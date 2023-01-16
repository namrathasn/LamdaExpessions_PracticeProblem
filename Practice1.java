@FunctionalInterface
interface flyable {
    void fly();
}

public class Practice1 {
    public static void main(String[] args) {
        flyable flying = () -> System.out.println("fly executed");
        flying.fly();


    }

}
