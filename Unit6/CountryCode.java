package Unit6;
import java.util.*;
public class CountryCode{
    public static void main(String[] args) {
        Local l=Local.getDefault();
        Locale loc = new Locale("en", "US");
        System.out.println(l.getDisplayCountry());
        System.out.println(l.getDisplayLanguage());
        System.out.println(l.DisplayName());
        Locale en=new Locale("en","US");
        Locale dr=new Locale("fr","FR");
        Locale es=new Locale("es","ES");
        System.out.println(en.getDisplayLanguage());
        System.out.println(dr.getDisplayLanguage());
        System.out.println(es.getDisplayLanguage());
        
    }
}