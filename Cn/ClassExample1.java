// // class Employee {
    
// //     private int empid;
// //     String empname;
// //     double salary;
// //     void setEmp(int id,String name,double sal){
// //         empid = id; empname = name; salary = sal;
// //     }
// //     void putEmp()
// //     {
// //         System.out.println(empid);
// //         System.out.println(empname);
// //         System.out.println(salary);
// //     }
// // }
// // public class ClassExample1 {
// //     public static void main(String[] args) {
// //         Employee e1 = new Employee();
// //         // System.out.println(e1.empid);
// //         // System.out.println(e1.empname);
// //         // System.out.println(e1.salary);
// //         e1.setEmp(12, "ram", 30000.0);
// //         e1.putEmp();
    
        
// //     }
// // }
// class Employee
// {
//     static String companyName = "ABC pvt. ltd.";
//     private int id 
//     private int empid;
//     private String empname;
//     private double salary,basic,da,hra;
// //     void setEmp(int id,String name,double sal)
// //     {
// //         empid=id;empname=name;salary=sal;
// //     }
// //     void putEmp()
// //     {
// //         System.out.println(empid);
// //         System.out.println(empname);
// //         System.out.println(salary);
// //     }
// // }
// // public class ClassExample1 {
// //     public static void main(String[] args) {
// //         Employee e1=new Employee();
// //         e1.setEmp(12,"ram",30000.0);
// //         e1.putEmp();
        
// //         Employee siva=new Employee();
// //         siva.setEmp(13,"siva",  40000.0);
// //         siva.putEmp();  
// //         // System.out.println(e1.empid);
// //         // System.out.println(e1.empname);
// //         // System.out.println(e1.salary);
// //     }
// // }
class Employee {
    static{ 
            idcount = 1001;
            System.out.println("static block calling");

    }
    static String companyName = "ABC pvt. ltd";
    private static int idcount;
    private int empid;
    private String empname;
    private double salary,basic,da,hra;
    private double hikeper = 0.05;

    public Employee() {
        System.out.println("empty constructor");
    }

    Employee(String empname, double basic, double da, double hra) 
    {
        this.empid = idcount++;
        this.basic = basic;
        this.da = da;
        this.hra = hra;
    }

    public static int getid(){
        return idcount;
    }

    
    
    void setEmp(int empid,String empname,double basic,double da,double hra){
        this.empid = empid; 
        this.empname = empname; 
        this.basic = basic;
        this.da = da;
        this.hra = hra;
    }
    void calculateSalary(){
        this.salary = this.basic + this.da + this.hra;
    }
    void putEmp()
    {
        System.out.println(this.companyName);
        System.out.println(this.empid);
        System.out.println(this.empname);
        System.out.println(this.salary);
    }
}
public class ClassExample1 {
    public static void main(String[] args) {
        Employee ram = new Employee();
        int id = Employee.getid();
        ram.setEmp(id, "ram", 30000.00,4000,5000);
        ram.putEmp();
        
        Employee siva = new Employee();
        id = Employee.getid();
        siva.setEmp(id, "siva", 40000.00, 5000, 4000);
        siva.putEmp();
    }
}