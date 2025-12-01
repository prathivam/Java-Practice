package testPackage;
public class Example {
    public String name = "Samurai";

    public Example(){
        printSomeData();
    }

    public void displayData(){
        System.out.println("Name: " + name);
        int age = 30;
        System.out.println("Age: " + age);
    }

    private void printSomeData(){
        System.out.println("Printing Some Data");
    }
}
