import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UpperCase {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Stream<String> names= Stream.of("abc","d","ef");
        List<String> upperCase = names
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Converted String Stream to upper case :"+upperCase);

    }
}