import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception{
       Locale[] l={new Locale("en","US"),new Locale("no","NO"),new Locale("sv","SE")};
       for(int i=0;i<l.length;i++){
        String display=l[i].getDisplayLanguage(l[i]);
        System.out.println("The Display Language of "+l[i]+" is in "+display);
       }
    }
}
