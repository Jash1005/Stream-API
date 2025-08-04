import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       
    // sorting
    Stream<Integer> stream= Stream.of(10,2,6,4,5,7,9,5,7,9);
    
    Stream<Integer> sortedstream = stream.sorted();
        
    sortedstream.forEach(num -> System.out.println(num));   
    
    // sorted is stateful operation -> it buffers the data (temporary memory)
    /* in stream data flows one by one but when we use sorted or limit than they use some type of memory
     bcoz we cant sort without seeing whole data */
     
     
     System.out.println("-------- sorting string ------");
     Stream.of("Jash","Amit","Sheth","Mukund","Tejal","Jeel").sorted().forEach(str -> System.out.println(str));
     
     // filtering on basis of len
     System.out.println("--------------------");
     Stream.of("Jash","Amit","Sheth","Mukund","Tejal","Jeel","A","B")
           .filter(str -> str.length() > 2)
           .sorted()
           .peek(name -> System.out.println("sorting done for name" + name))
           .forEach(str -> System.out.println(str));
             
      // filter doesnot need to store data so it is stateless operation
      
        
    }
}
