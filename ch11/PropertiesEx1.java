import java.util.*;
class PropertiesEx1{
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        Enumeration e = prop.propertyNames();
        while(e.hasMoreElements()){
            String element = (String)e.nextElement();
            System.out.println(element + "=" + prop.getProperty(element));
        }
        System.out.println();
        prop.setProperty("size", "20");
        System.out.println("size="+prop.getProperty("size"));
        System.out.println("capacity="+prop.getProperty("capacity", "20"));
        System.out.println("loadfactor="+prop.getProperty("loadfactor","0.75"));
        System.out.println(prop);
        prop.list(System.out);

    }
}
// capacity=10
// size=10
// timeout=30
// language=kr

// size=20
// capacity=10
// loadfactor=0.75
// {capacity=10, size=20, timeout=30, language=kr}
// -- listing properties --
// capacity=10
// size=20
// timeout=30
// language=kr