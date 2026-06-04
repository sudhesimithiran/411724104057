class Employee {
    int empid;
    String empname;
    Employee(){}
    Employee(int id,String name){
        empid = id;
        empname = name;
    }
    void display(){
        System.out.println("id:"+empid);
        System.out.println("name:"+empname);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String data = "id:"+empid+"name:"+empname;
        return data;
    }
}
public class Overridingeg3



{
    public static void main(String[] args) {
        Employee e = new Employee(101,"ram");
        System.out.println(e);
    }
}