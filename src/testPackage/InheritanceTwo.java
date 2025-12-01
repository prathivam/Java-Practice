package testPackage;
import testPackage.*;

public class InheritanceTwo extends Inheritance{


    @Override
    void sound() {
        super.sound();
        System.out.println("Wazzup Hyderabad");
        //    Inheritance Example
        var addInteger = InheritanceTwo.add(2,3,4);
        var addDouble = InheritanceTwo.add(1.5, 2.5);
        System.out.println("Integer addition from inheritance = " + addInteger);
        System.out.println("Double addition from inheritance = " + addDouble);
    }

    OuterClass outClass = new OuterClass();
    OuterClass.InnerClass outInner = outClass.new InnerClass();

    // Constructor to handle printing
    public InheritanceTwo() {
        System.out.println("Value from Outer Class: " + outClass.x);
        System.out.println("Value from Inner Class: " + outInner.y);
    }

}
