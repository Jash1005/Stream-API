class Main {
    
    private interface Iaddition {
       int sum(int a,int b);
    }

    public static void main(String[] args) {
        Iaddition iadd = (a,b) -> {
            return a + b;
        };
        
        int sum = iadd.sum(10,10);
        System.out.println(sum);
    }
}



class Main {
    
    private interface Iaddition {
       int sum(int a,int b);
    }

    public static void main(String[] args) {
        
        Iaddition iadd = Main::addtwo; // method reference (static is imp bcoz non-static cant be referenced from static)

// if not static then object reference is needed

        int sum = iadd.sum(10,10);
        System.out.println(sum);
    }
    
    static int addtwo(int a,int b) {
        return a + b;
    }
}




class Main {
    
    private interface Iaddition {
       int sum(int a,int b);
    }

    public static void main(String[] args) {
        
        Main m = new Main();
        Iaddition iadd = m::addtwo; // method reference
        
        int sum = iadd.sum(10,10);
        System.out.println(sum);
    }
    
    int addtwo(int a,int b) {
        return a + b;
    }
}



class Main {
    
    private interface Iadd {
        int sum (int a,int b);
    }
    
    public int addtwonum(int a,int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        // diff btw direct refernce or method calling and method reference
        
        Main m = new Main();
        int a = m.addtwonum(10,10); // this means at this position of code i want my output to be done
        System.out.println(a);
        
        Iadd iadd = m::addtwonum;
        // here i can anytime invoke this method
        
        System.out.println(iadd.sum(1,2));
        
    }
}


// calling by class name

class Main {
    
    private interface Iadd {
        int sum (int a,int b);
    }
    
    private interface Iadd2 {
        int sum (Main sampleobj , int a , int b);
    }
    
    public int addtwonum(int a,int b) {
        return a + b;
    }
    
    
    public static void main(String[] args) {
        
        Iadd iadd = new Main()::addtwonum;
        // we can use instance of obj 
        
        // Iadd iadd = Main::addtwonum; // addtwonum should be static here
                // Main is class name but we wont instance of obj
       
        Iadd2 iadd2 = Main::addtwonum; // new Main().addtwonum() 
        // the obj we pass will replace class name and it will work as object
        int sum = iadd2.sum(new Main() , 2 , 5);
        System.out.println(sum);
        
    }
}
