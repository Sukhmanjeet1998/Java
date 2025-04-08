// Strings and its methods
import java.util.Locale;

public class JavaCWH2 {
    public static void main(String[] args) {
//        String Methods
        String name = "HARRY";
        String nameNew = "krishan";
        String nonTrimString = "    CodeWith   Harry  ";
        String paragraph = "There is a thirsty crow";
//        1
        int value = name.length();
//        System.out.println(value);

//        2
        String lString = name.toLowerCase();
//        System.out.println(lString);

//        3
        String uString = nameNew.toUpperCase();
//        System.out.println(uString);

//        4
//        System.out.println("Non Trim String: " + nonTrimString + " :<-");
        String trimString = nonTrimString.trim();
//        System.out.println("Trim String: " + trimString + " :<-");

//        5
        String subString = paragraph.substring(11);
//        System.out.println(subString);

//        6
        String replaceString = paragraph.replace("crow", "dog");
        String replaceOtherString = name.replace('R', 'P');
//        System.out.println(replaceString);
//        System.out.println(replaceOtherString);

//        7) more... { startsWith(), endsWith(), indexOf(), charAt(), equalsIgnoreCase() and escape sequence character}
    }
}
