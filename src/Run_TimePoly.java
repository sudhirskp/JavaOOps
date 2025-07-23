class Bag{
    int price;
    int size;

    Bag(int cost ,int size){
        price = cost;
        this.size = size;
    }
    void display(){
        System.out.println("The price of the Bag : "+ price +"\n"+ " The size of the Bag : "+size);
    }

    public int getPrice(){
        return price;
    }
}

class Student extends Bag{

    //call parent class constructor
    Student(int cost,int size){
        super(cost,size);
    }

    @Override
    void display(){
        System.out.println("The Price is too High");
    }
}

public class Run_TimePoly {
    public static void main(String[] args) {
        Bag b = new Bag(799,10);
        Bag bs = new Student(799,10); //Parent refers to the child class obj
        Student st = new Student(799,10);

        b.display();

        bs.display();

        st.display();

        System.out.println(st.getPrice());

        //st.price - parent class method is called

        System.out.println(bs.getPrice());

        System.out.println(bs.price);

    }
}