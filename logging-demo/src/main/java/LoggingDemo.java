import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Demonstrates basic logging using the SLF4J API.
 */
public class LoggingDemo
{
    // The Facade: We ask the factory to give us a Logger.
    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main( String[] args )
    {
        // 1. Log at different levels (ERROR, WARN, INFO, DEBUG)
        logger.error("An ERROR occurred: Database connection failed on first attempt.");
        logger.warn("A WARN occurred: User 'guest' is logged in. This is insecure.");
        logger.info("An INFO occurred: Application started successfully.");

        // 2. Demonstration of Parameterized Logging (Best Practice)
        String recipeName = "Chocolate Cake";
        int ingredientCount = 12;

        // Use '{}' placeholders for performance and security.

        logger.info("Processing recipe: {} with {} ingredients.", recipeName, ingredientCount);

        // 3. Log a DEBUG message (will be filtered out by default Logback settings)
        logger.debug("Debug message: Current thread ID is " + Thread.currentThread().getId());

        // 4. Demonstrate TRACE (even lower level)
        MDC.put("userID", "user123");
        logger.trace("Trace message: Checking user permissions array.");
        MDC.clear();

        try {
            // Simulate an exception
            if (ingredientCount > 10) throw new IllegalArgumentException("Too many ingredients for this recipe style.");
        } catch (Exception e) {
            // Logging the exception ensures the full stack trace is sent to the Appender
            logger.error("Caught Exception: Invalid recipe configuration.", e);
        }
    }
}
