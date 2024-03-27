class Address{
    String province;
    String street;
    int ward;
    public Address(String province,String street,int ward){
        this.province=province;
        this.ward=ward;
        this.street=street;

    }
    public String toString(){
        return this.province+this.street+this.ward;
    }

}

public class Student {
    int roll;
    String name;
    Address addr;
    public Student(String name,int roll, Address addr){
        this.name=name;
        this.roll=roll;
        this.addr=addr;
    }
    public String toString(){
        return "Name ="+this.name+" Roll="+this.roll+" Address="+this.addr;
    }
    
}
class Chaloo{
    public static void main(String[] args) {
        Address a=new Address("Sudurpaschim ", " Chadani ", 2);
        Student s=new Student("Hemraj", 6, a);
        System.out.println(s);
    }
}
