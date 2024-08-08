import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;


public class NonEmptyStrings {
    public static void main(String[] args)
    {
        List<String> listStrings= Arrays.asList("abc","","bc","efg","abcd","","jkl");
        Predicate<String> p=(s) ->s.length()>0;
        for (String st : listStrings) {
            if (p.test(st))
                System.out.println(st);
        }
    }
}
