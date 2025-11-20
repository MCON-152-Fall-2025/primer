import com.example.utils.TextTools;

public class UseLocal {
    public static void main(String[] args) {
        String input = (args.length > 0) ? args[0] : "local lib";
        System.out.println("Cap: " + TextTools.capitalize(input));
    }
}