public class EnvDemo  {
    public static void main(String[] args) {
        // Retrieve and print all environment variables
        System.out.println("Environment Variables:");
        System.getenv().forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
        //Retrieve and print a specific environment variable
        String pathVar = System.getenv("PATH");
        System.out.println("\nPATH Variable: " + pathVar);
        // Check for a non-existent environment variable
        String nonExistentVar = System.getenv("NON_EXISTENT_VAR");
        System.out.println("\nNON_EXISTENT_VAR: " + nonExistentVar);
        //Retrieve and print system properties
        System.out.println("\nSystem Properties:");
        System.getProperties().forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
        //Retrieve and print a specific system property
        String javaVersion = System.getProperty("java.version");
        System.out.println("\nJava Version: " + javaVersion);
    }

}