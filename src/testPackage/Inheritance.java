package testPackage;

public class Inheritance{ 
//    Method Overloading / Compile Time Polymorphism
    static int add(int a, int b, int c){
        return (a + b + c);
    }
    static double add(double a, double b){
        return (a + b);
    }


//    Method Overriding
    void sound(){
        System.out.println("Dog is Barking");
    }
}
