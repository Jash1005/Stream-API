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
      
		Stream.of(1,2,3,4,5,6,7,8,9)
		      .filter(integer -> integer < 8)
		      .map(num -> num * num)
		      .forEach(integer -> System.out.println(integer));
		      
		// filter is stateless value
		      
        // using takewhile -> short - circuiting stateful
        // the moment it doesnot satisfy condition than it will break it down pipeline
        
        Stream.of(1,2,3,4,5,6,7,8,9)
		      .takeWhile(integer -> integer < 8)
		      .map(num -> num * num)
		      .forEach(integer -> System.out.println(integer));
        
        
        Stream.of("joe","abhilash","param","ansh","jash","tejal","Prachi")
              .skip(3)
              .forEach(str -> System.out.println(str));
        
        System.out.println("------------DISTICT------------------");   
              
        Stream.of(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7)
              .distinct() // stateful method
              .forEach(num -> System.out.println(num));
        
	}
}

    }
}
