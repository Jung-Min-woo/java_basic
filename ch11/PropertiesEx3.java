import java.util.*;
import java.io.*;
public class PropertiesEx3 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "한글");
        prop.setProperty("size", "10");
        prop.setProperty("capactiy", "10");
        try{
            prop.store(new FileOutputStream("output.txt"), "Properties Example");
            prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
/* output.txt */
// #Properties Example
// #Sat Dec 03 12:17:35 KST 2022
// capactiy=10
// size=10
// timeout=30
// language=\uD55C\uAE00

/* output.xml */
// <?xml version="1.0" encoding="UTF-8" standalone="no"?>
// <!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd">
// <properties>
// <comment>Properties Example</comment>
// <entry key="capactiy">10</entry>
// <entry key="size">10</entry>
// <entry key="timeout">30</entry>
// <entry key="language">한글</entry>
// </properties>