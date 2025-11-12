package edu.touro.mcon152;
import org.apache.commons.lang3.StringUtils;

/**
 * Let's use Maven to build and test this app
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "capitalizing " + args[0] + ": " + StringUtils.capitalize(args[0]) );
    }
}
