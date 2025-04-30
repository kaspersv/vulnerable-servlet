import java.io.File;
import java.io.FileInputStream;

public class B {
    public static void foo(String path) {
        // Vulnerability: Open file at user-controlled path
        try {
            File file = new File(path);
            FileInputStream stream = new FileInputStream(file);
            stream.close();
        } catch (Exception e) {
        }
    }
}
