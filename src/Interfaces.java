interface Tech{
    void allDetails();
    void price();

    default void display(){
        System.out.println("This is a display method---Tech interface");
    }
}

interface tool extends Tech{
    void toolDetails();
    void toolPrice();

    default void display(){
        System.out.println("This is a tool display method ---tool interface");
    }

}

//interface tool{
//    void toolDetails();
//    void toolPrice();
//
//    default void display(){
//        System.out.println("This is a tool display method---tool interface");
//    }
//
//}

class Laptop implements tool,Tech{
    public void allDetails(){
        System.out.println("Laptop details are : XYZ ");
    }
    public void price(){
        System.out.println("Laptop price is : 000");
    }

    public void toolDetails() {
        System.out.println("Tool details are : ABC");
    }

    public void toolPrice() {
        System.out.println("Tool price is : 100");
    }

//    public void display(){
//        System.out.println("This is a display method---Laptop class");
//    }
}



public class Interfaces {
    public static void main(String[] args) {
        Laptop ob = new Laptop();
        System.out.println("Interface Example ----tech");
        ob.display();
        ob.allDetails();
        ob.price();
        System.out.println();

        Tech ob1 = new Laptop();
        ob1.display();
        System.out.println();



        System.out.println("Interface Example ----tool");
        ob.toolDetails();
        ob.toolPrice();
        ob.display();
    }
}
