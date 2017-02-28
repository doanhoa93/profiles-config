import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by framgia on 28/02/2017.
 */

public class PropertyReader {


    public static String getEnvironment() throws IOException {
//        final Properties properties = new Properties();
//        InputStream input = null;
//        input = new FileInputStream("application.properties");
//        properties.load(input);
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream input = classloader.getResourceAsStream("application.properties");
        final Properties properties = new Properties();
        properties.load(input);
        properties.getProperty("com.framgia.env");
        return properties.getProperty("com.framgia.env");
    }

    public static void main(String[] args) throws IOException {
        System.out.print(PropertyReader.getEnvironment());
    }
}
