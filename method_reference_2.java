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
