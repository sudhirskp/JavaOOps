abstract class Bank{
    abstract void getRateOfInterest();
    void display(){
        System.out.println("This is a bank class - Non abstract method");
    }
    Bank(){
        System.out.println("This is a bank class - constructor");
    }
}

class SBI extends Bank{
    void getRateOfInterest(){
        System.out.println("The rate of interest is 8% of SBI");
    }
    void display(){
        System.out.println("This is a SBI class");
    }
}

abstract class ICICI extends Bank {
    void Dispaly(){
        System.out.println("it is another asbtract class of ICICI bank");
    }

    void Interes(){
        System.out.println("The ICICI bank interes is : 6.9%");
    }
}

class Hdfc extends ICICI{
    void getRateOfInterest() {
        System.out.println("The rate of interest is 8% of Hdfc");
    }
    void print(){
        System.out.println("I am Child of the ICICI class");
    }

    void Dispaly(){
        System.out.println("This is a Hdfc class");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.getRateOfInterest();
        b.display();
        System.out.println();


        ICICI i = new Hdfc();
        i.Interes();
        i.Dispaly();
        ((Hdfc) i).print();
        System.out.println();

        Bank b1 = new Hdfc();
        b1.getRateOfInterest();
    }
}
