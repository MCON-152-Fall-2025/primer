import org.apache.commons.lang3.StringUtils;

public class UseCommons {
    public static void main(String[] args) {
        String input = (args.length > 0) ? args[0] : "maven";
        System.out.println(StringUtils.capitalize(input));
    }
}