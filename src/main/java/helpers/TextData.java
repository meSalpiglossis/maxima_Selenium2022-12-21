package helpers;

import java.io.InputStream;
import java.util.Properties;

public class TextData {

    private static final Properties texts;

    static {
        texts = new Properties();
        InputStream is = TextData.class.getResourceAsStream("/text.properties");
        try {
            texts.load(is);
            is.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String get(String tagName) {
        return texts.getProperty(tagName);
    }

}


