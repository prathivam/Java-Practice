package testPackage;

public class InheritanceExampleChild extends ClassesExample {
    public InheritanceExampleChild(){
        System.out.println("------------->This is the constructor of InheritanceExampleChild Class<-------------");
    }

    public void displayInfo(){
        this.setName("Bruce Banner");
        String name = this.getName();
        System.out.println("Place from parent class: " + place);
        System.out.println("Inheritance Result : " + name);
    }
}

