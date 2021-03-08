import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class InputValidator {
    private static List<Character> allowed = Arrays.asList('1','2','3');
    public static boolean validateInput(String input){
        if(allowed.contains(input.charAt(0))){
            return true;
        }
        return false;
    }
}
