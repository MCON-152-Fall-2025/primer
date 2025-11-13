public class EnvDemo {
    public static void main(String[] args) {
        // Read an environment variable (e.g., export COURSE=MCON152)
        String course = System.getenv("COURSE");
        // Read a system property (e.g., -Dapp.name=LabRun)
        String appName = System.getProperty("app.name", "(not set)");

        System.out.println("=== Environment Variables (subset) ===");
        System.out.println("COURSE: " + course);
        System.out.println("HOME:   " + System.getenv("HOME"));

        System.out.println("\n=== System Properties (subset) ===");
        System.out.println("app.name:      " + appName);
        System.out.println("java.version:  " + System.getProperty("java.version"));
        System.out.println("os.name:       " + System.getProperty("os.name"));
        System.out.println("user.dir:      " + System.getProperty("user.dir"));

        // Optional: print all env or all props (commented to keep output short)
        // for (Map.Entry&lt;String,String&gt; e : System.getenv().entrySet()) System.out.println(e);
        // Properties p = System.getProperties(); p.forEach((k,v) -&gt; System.out.println(k + "=" + v));
    }
}