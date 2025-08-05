import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".

interface Isum {
    int sum(int val1 , int val2);
}

class Main {
    public static void main(String[] args) {
         Isum isum = new Isum() {
             @Override
             public int sum(int val1 , int val2) {
                 return val1 + val2;
             }
         };

        Isum newway = (val1 ,val2) -> {
            return val1 + val2;
        };

         int sum = isum.sum(10,10);
         int nsum = newway.sum(10,20);
        
        // when i call sum method it calls interface sum method. it is abstract method so now call goes to child class
         System.out.println(sum);
         System.out.println(nsum);
        
    }
}







---------------------------------------------------------------------------------------------------------------------------------

** METHOD REFERENCE  **



import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".

interface Isum {
    int sum(int val1 , int val2);
}

class Main {

    public static int addition(int a , int b) {
        return a + b;
    }
    // here we can see sum method was also doing same thing what addtion is doing
    
    public static void main(String[] args) {

         Isum isum = Main::addition; // reffering to static method
         // isum refers to addition method for implementation

         int sum2 = isum.sum(10,10);
         System.out.println(sum2);



        // Integer class in java also has a method called sum
        // (a,b) -> Integer.sum(a,b)

        Isum isum = Integer::sum;
        int add = isum.sum(10 , 20);
        System.out.println(add); 

    }
}


--------------------------------------------------------------------------------------------------------------------------

  
interface Isort {
    void sortAList(List<Integer> unsortedList); 
}

class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 7, 5, 3, 4, 2, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(9, 8, 6, 4, 2, 0));

        // Lambda expression
        Isort isort1 = (list) -> {
            Collections.sort(list);
        };

        isort1.sortAList(list1);    

        // Method reference
        Isort isort2 = Collections::sort;
        isort2.sortAList(list2);

        System.out.println("1 " + list1);
        System.out.println("2 " + list2); 
    }
}
