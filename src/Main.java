public class Main {

    static int plusMethodInt(int x,int y){
        return x + y;
    }
    static double plusMethodDouble(double x, double y){
        return x + y;
    }

    int class_variable_1 = 10;

//    Constructor
    public Main(){
        System.out.println("This is the constructor of Main Class");
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
        String text = "brucelee";
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
        System.out.println("Double Addition: "+ plusMethodDouble(1.5,2.5));

//      Main Class Variable
        Main myObj = new Main();
        System.out.println("Variable of First class is: " + myObj.class_variable_1);
//        "Second" Class Variable
        System.out.println("Variable of Second Class is: " + Second.class_variable_2);

    }
}

class Second {
    static int class_variable_2 = 20;
}