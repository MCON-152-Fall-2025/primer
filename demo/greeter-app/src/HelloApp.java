import edu.touro.mcon152.Greeter;

public class HelloApp {
    public static void main(String[] args) {
        Greeter g = new Greeter(args.length > 0 ? args[0] : "World");
        System.out.println(g.greet());
    }
}