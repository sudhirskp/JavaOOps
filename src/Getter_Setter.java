class ReadOnly{
    private String name;

    ReadOnly(){
        this.name = "Rahul";
    }
    public String getName(){
        return name;
    }
}

class WriteOnly {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}

class ReadWrite {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Getter_Setter {
    public static void main(String[] args) {
        System.out.println("--------------read only");
        ReadOnly readOnly = new ReadOnly();
        System.out.println(readOnly.getName());

        System.out.println("--------------write only");
        WriteOnly WriteOnly = new WriteOnly();
        WriteOnly.setName("Rahul");

        System.out.println("--------------read write");
        ReadWrite readWrite = new ReadWrite();
        readWrite.setName("Shaktiman");
        System.out.println(readWrite.getName());
    }
}
