import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      
        Stream<Integer> integerstream = Stream.of(1,2,3,4,5,6,7,8,9);
        // this is not infinte Stream
        
        Consumer<Integer> consumer = new Consumer<>() {
           @Override
           public void accept(Integer num) {
               System.out.println(num);
           }
        };
        
        integerstream.forEach(consumer);
        
    }
}
