package com.hcltech.Assignments;

class Hello {
    //Without public modifier
    public  void main2(String[] args) {
        
        System.out.println("Welcome to the world of Java");
    }
    
 // Without static modifier
    public void main1(String[] args) {
        System.out.println("Welcome to the world of Java");
    }

    // Without argument
    public static void main() {
        System.out.println("Welcome to the world of Java");
    }
/// Does not work
    
    
    // With integer argument
    public static void main(int arg) {
        System.out.println("Welcome to the world of Java");
    }

    // Interchange public and static keywords
    static public void main(String[] args) {
        System.out.println("Welcome to the world of Java");
    }
}


