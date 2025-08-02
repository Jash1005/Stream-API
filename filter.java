import java.util.*;
import java.util.stream.Stream;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        
        // Normal 
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};
        for(Integer num : numbers) {
            if(num > 5) {
                System.out.println(num);
            }
        }
        
        System.out.println("------ Stream -------");
        // Stream API
        Stream<Integer> stream = Arrays.stream(numbers);
        
        stream.filter(num -> num > 5).forEach((num) -> System.out.println(num));
    
        // method : filter -> it takes Predicate -> used to check conditional check as it return true or false
        
        -> it creats new stream object 
        -> Stream is immuatble in nature.
        
        filteredintegerstream = stream.filter(new Predicate<>() {
           @Override
           public boolean test(Integer num) {
              return num > 5;
           }
        })
        
    }
}
