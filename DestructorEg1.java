class Employee {

    private int empno;
    private String empname;
    private double salary;

    void setEmployee(int no,String name,double sal)
    {
        this.empno = no;
        this.empname = name;
        this.salary = sal;
    }
    void putEmployee()
    {
        System.out.println("no:"+this.empno);
        System.out.println("name:"+this.empname);
        System.out.println(("salary:"+this.salary));
    }
    protected void finalize()
    {
        System.out.println("internal destructor called...");
    }
    
}
public class DestructorEg1 {
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        e1.putEmployee();
        e1 = null;
        System.gc(); //forcing jvm to call internal destructor
    }
}