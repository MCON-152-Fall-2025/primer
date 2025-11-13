package edu.touro.mcon152;
// After you add deps, these imports will resolve:
import org.apache.commons.lang3.StringUtils;
import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        String input = (args.length > 0) ? args[0] : "maven project";
        String cap   = StringUtils.capitalize(input);
        System.out.println("Cap (commons-lang3): " + cap);

        // Uncomment after adding Gson to pom.xml:
        // Gson gson = new Gson();
        // String json = gson.toJson(new Msg(cap));
        // System.out.println("JSON (gson): " + json);
    }

    // Uncomment after adding Gson:
    // static class Msg {
    //     String message;
    //     Msg(String m) { this.message = m; }
    // }
}
  