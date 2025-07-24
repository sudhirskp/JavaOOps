//nested class - non static
class Outer{
    private static int roll;
    private int age;
    int data;
    String name;


    Outer(int roll , int age , int data , String name){
        this.roll = roll;
        this.age = age;
        this.data = data;
        this.name = name;
    }

    void display(){
        System.out.println("Roll : "+roll);
        System.out.println("Age : "+age);
        System.out.println("Data : "+data);
        System.out.println("Name : "+name);
    }

    class Inner{
        private int roll;
        int data;
        static String name;

        Inner(){
            this.roll = 22;
            this.data = 100;
            name = "Rahul";
        }

        void display(){
            System.out.println("Roll : "+roll);
            System.out.println("Age : "+age);
            System.out.println("Data : "+data);
            System.out.println("Name : "+name);

            System.out.println();
            System.out.println("Outer Details -----------------------------------------------\n");

            System.out.println("Roll : "+Outer.roll);
            System.out.println("Age : "+Outer.this.age);

            System.out.println("Outer display method call--------------------------------------");
            Outer.this.display();

        }
    }


}
//static nested class
class Outer2{
    static class Inner2{
        public static void display(){
            System.out.println("Static Inner class");
        }
    }
}
//local inner class
class Outer3{
    public void display(){
        class Inner3{
            public void display(){
                System.out.println("Local Inner class");
            }
        }
        Inner3 in = new Inner3();
        in.display();
    }
}
//anonymous inner class
class Outer4{
    public void display(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner class");
            }
        }).start();
    }
}

//anonymous nested through interface and abstract class

abstract class abs {

    abstract void  print();
    void display(){
        System.out.println("Abstract class");
    }
}

interface inter{
    void print();
    void display();
}



public class NestedClass {
    public static void main(String[] args) {

        //Outer o = new Outer(22,22,22,"Sudhir");
        Outer.Inner in = new Outer(22,18,999,"Sudhir").new Inner();
        in.display();

        System.out.println();

        Outer2.Inner2.display();
        Outer3 o3 = new Outer3();
        o3.display();
        Outer4 o4 = new Outer4();
        //o4.display();

        System.out.println();

        System.out.println("Anonymous Inner class through-------------------interface and abstract class");
        //for the anonymous inner class through interface and abstract class

        abs  ab = new abs(){
            void dispaly(){
                System.out.println("Abstract class");
            }

            void print (){
                System.out.println("This is print method of the abstract");
            }
        };

        inter inn = new inter(){
            public void display(){
                System.out.println("Interface display method");
            }

            public void print(){
                System.out.println("this is print method of the Interface");
            }

        };

        System.out.println("----------------------------------");
        inn.display();
        inn.print();

        System.out.println();

        System.out.println("----------------------------------");
        ab.display();
        ab.print();
    }

}
