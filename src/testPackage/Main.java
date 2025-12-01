package testPackage;

import java.io.IOException;
import java.util.logging.Level;


public class Main {

    static int plusMethodInt(int x1,int y1){
        return x1 + y1;
    }
    static double plusMethodDouble(double x, double y){
        return x + y;
    }

    int class_variable_1 = 10;

//    Constructor
    public Main(){
        System.out.println("This is the constructor of Main Class");
        InheritanceExampleChild inheritanceObj = new InheritanceExampleChild();
        inheritanceObj.displayInfo();

        InheritanceTwo innerTwo = new InheritanceTwo();
        innerTwo.sound();
    }

    public static void main() {
        int one = 1, two = 2, three = 3, four = 4;
        int x1;
        x1 = 20;
        System.out.println("One = " + one + " Two = " +two);
        System.out.println(one + two + three + " is the total");

//      Find String Index
        String name = "He man";
        System.out.println(name.indexOf("man"));

//      chatAt() Method.
        String text = "bruce lee";
        System.out.println(text.charAt(2));

        String textFinal = "The Name\"(s) is Heisenberg";
        System.out.println("Maximum of the number 2 & 3 is " + Math.max(2,3));

//      For Each Loop
        String[] names = {"Bruce Wayne", "Barry Allen", "Wally West"};
        for (String n: names){
            System.out.println("Part of ForEach Loop is - " +  n );
        }

        var loop = 0;
        for(loop = 0; loop < 5; loop++){
            if(loop == 2){
                break;
            }
            else{
                continue;
            }
        }
        System.out.println("Loop value is " + loop);

//        Array
        int[] numbers = {10, 20, 30, 40, 50};

//        Method Overloading
        System.out.println("Integer Addition: "+ plusMethodInt(1,2));
        System.out.println("Integer Addition: "+ plusMethodInt(2,3));
        System.out.println("Double Addition: "+ plusMethodDouble(1.5,2.5));
        System.out.println("Double Addition: "+ plusMethodDouble(2.5,3.5));

//      Main Class Variable
        Main myObj = new Main();
        System.out.println("Variable of First class is: " + myObj.class_variable_1);


//        Example.java File
        Example exampleObj = new Example();
        exampleObj.displayData();
//        exampleObj.printSomeData()

//      Encapsulation Example
        ClassesExample classObj = new ClassesExample();
        classObj.setName("Testing");
        System.out.println("Encapsulated Name is: " + classObj.getName());

//      Abstraction Example
        AbstractionExample absClass = new AbstractionExample();
        absClass.printAbstractMethod();

//      Abstraction by Interface
        InterfaceExampleChild interfaceObj = new InterfaceExampleChild();
        interfaceObj.carSound();
        interfaceObj.run();

//      Anonymous Class Example
        SampleClassAnonymous anonymousObj = new SampleClassAnonymous(){
            public void playChess(){
                System.out.println("This is the Overridden method of Anonymous Class");
            }
        };
        anonymousObj.playChess();

//        Enum Example
        Number_List enumObj = Number_List.ONE;
        enumObj.getDescription();

//        File Handling
        FileHandling fileName = new FileHandling();

//        Reading Files
        ReadingFiles readingFileObj = new ReadingFiles();
    }
}