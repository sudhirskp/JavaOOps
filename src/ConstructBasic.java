
class Mobile {
    int price ;
    String Brand;
    int ram;
    int rom;

    //parameterise constructor
    Mobile(int price , String Brand , int ram , int rom ){
        this.price = price;
        this.Brand = Brand;
        this.ram = ram;
        this.rom = rom;
    }

    //default constructor - if not parameterised then given default
    Mobile(){
        this.price = 0;
        this.Brand = "NULL";
        this.ram = 0;
        this.rom = 0;
    }

    //copy constructor - only copy not get reference
    Mobile(Mobile m){
        this.price = m.price;
        this.Brand = m.Brand;
        this.ram = m.ram;
        this.rom = m.rom;
    }

    void details(){
        System.out.println("price : "+price);
        System.out.println("Brand : "+Brand);
        System.out.println("ram : "+ram);
        System.out.println("rom : "+rom);
        System.out.println();
    }
}


public class ConstructBasic {

    public static void main(String[] args) {
        Mobile m1 = new Mobile(10000,"Samsung",8,128);
        m1.details();
        Mobile m2 = new Mobile();
        m2.details();
        Mobile m3 = new Mobile(m1); //deep copy
        m3.details();
        m1.price = 20000;
        System.out.println("price : " + m1.price);
        System.out.println("by m3 - price : " + m3.price);
        m3 = m1; // shallow copy
        System.out.println("by m3 - price : " + m3.price);
    }
}
//constructor is used to initialize the object