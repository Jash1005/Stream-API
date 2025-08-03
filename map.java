import java.util.*;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        
        // Normal 
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};
        
        // Stream pipeline: filter + map
        // intermediate -> always return us stream
        Stream<Integer> stream = Arrays.stream(numbers);
        Stream<Integer> filteredStream = stream.filter(num -> num > 5);
        
        Stream<String> mappedStream = filteredStream.map(num -> {
            switch(num){
                case 6: return "six";
                case 7: return "seven";
                case 8: return "eight";
                case 9: return "nine";
                default: return "Number not available";
            }
        });
        
        mappedStream.forEach(System.out::println);
        // terminal operation -> if method doesnot return anything
    }
}
