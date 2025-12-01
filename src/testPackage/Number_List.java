package testPackage;

public enum Number_List {
    ONE("ONE"),
    TWO("TWO"),
    THREE("THREE");

    private final String description;

    Number_List(String description) {
        this.description = description;
    }

    public void getDescription() {
        System.out.println("Description: " + this.description);
    }
}