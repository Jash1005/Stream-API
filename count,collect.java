import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


class Main {
    public static void main(String[] args) {
        
        // Normal 
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};
        
        // Stream pipeline: filter + map
        // intermediate -> always return us stream
        Stream<Integer> stream = Arrays.stream(numbers);
        Stream<Integer> filteredStream = stream.filter(num -> {
          System.out.println("Applying filter on number" + num);
          return num > 5;
        });
        
        Stream<String> mappedStream = filteredStream.map(num -> {
            System.out.println("mapping number" + num);
            switch(num){
                case 6: return "six";
                case 7: return "seven";
                case 8: return "eight";
                case 9: return "nine";
                default: return "Number not available";
            }
        });
        
        /* instead of printing if i want to collect in list
        List<String> list  = mappedStream.collect(Collectors.toList()); */
        
        /* 
        
        counting how many items are there in mappedStream
        long count = mappedStream.count();
        System.out.println("number of element in mappedStream" + count);
        
        */
        
        
        //mappedStream.forEach(num -> System.out.println(num));
        
        /* The stream is lazzy in nature. Stream only gets invoked 
        when any terminal operation takes place . This map  terminal operation starts a stream*/
        
        
    }
}
