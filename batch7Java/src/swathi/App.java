package swathi;

import java.io.FileInputStream;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("file.properties"));
        properties.list(System.out);
        System.out.println(properties.getProperty("key"));
    }
}
