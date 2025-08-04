import java.util.stream.Stream;
import java.util.function.UnaryOperator;

public class Test1 {
    public static void main(String[] args) {
        
        // UnaryOperator -> interface this interface extends ClassNotFoundException
        // this is specialization of Function -> return same data type output
        // iterate(seed -> starting , object)
        
        Stream<Integer> streamofint = Stream.iterate(0, new UnaryOperator<>() {
            @Override
            public Integer apply(Integer num) {
                return num + 1;
            }
        });
        
         streamofint.filter(num -> num < 20).forEach(num -> System.out.println(num));
    
        streamofint.limit(20).forEach(num -> System.out.println(num));
    
        // when limit of 20 is reached limit function will short circuit my forEach method and it will shut down
        
        System.out.println("What happens when we use sorted with infinte stream");
        
        streamofint.sorted()
                   .forEach(num -> System.out.println(num));
        // this will use all heap memory
    } 
}
