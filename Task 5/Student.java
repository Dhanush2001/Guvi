import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    public static void main(String[] args){
        List<String> names= Arrays.asList("John","Adam","Ryan","Ariana","Selena","Anne","Rachel","Jennifer","Hugh","Chris");
        List<String> namesWithA = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println("Students name starting with A:");
        namesWithA.forEach(name->System.out.println(name));

    }
}
