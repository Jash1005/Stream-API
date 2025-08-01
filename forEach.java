import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      
        // Supplier is an interface that supplies data
        Supplier<String> supplier = new Supplier<>() {
            @Override
            public String get() {
                return "hello stream!!";
            }
        };

        // Consumer is an interface that consumes data
        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        };

        // Create an infinite stream from the supplier
        // generate keeps producing data which are streamed in data pipe
        Stream<String> streamOfStrings = Stream.generate(supplier);

        // Limit the stream to prevent infinite loop
        streamOfStrings
            .limit(5) // limit to 5 items
            .forEach(consumer);
    }
}



   // program 1 -> writing using lambda
       
       Stream<String> streamOfString = Stream.generate(() -> "hello Stream!!");
       
       streamOfString.limit(10).forEach((str) -> System.out.println(str));
