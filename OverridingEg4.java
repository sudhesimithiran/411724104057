class Employee1{
    int empid;
    String empname;
    Employee1(){}
    Employee1(int id,String name){
        empid = id;
        empname = name;
    }
    void display(){
        System.out.println("id:"+empid);
        System.out.println("name:"+empname);
    }
    @Override
    public String toString() {
        String data="id"+empid+"name"+empname;
        return data;
    }
    
}
public class OverridingEg4 {
 public static void main(String[] args){
    Employee1 e=new Employee1(101,"ram");
    Employee1 e1=new Employee1(101,"ram");
    System.out.println(System.identityHashCode(e));
    System.out.println(System.identityHashCode(e1));
    System.out.println(e.equals(e1));
 }
    
}