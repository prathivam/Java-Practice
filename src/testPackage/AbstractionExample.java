package testPackage;

abstract class AbstractionClass {
    abstract void printAbstractMethod();
}
public class AbstractionExample extends AbstractionClass{
    @Override
    void printAbstractMethod() {
        System.out.println("This is an abstract method implementation.");
    }
}

