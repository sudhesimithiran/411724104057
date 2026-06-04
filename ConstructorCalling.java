// // class Employee
// // {
// //     int id;
// //     String name;
// //     double salary;

// // }
// // class Manager extends Employee 
// // {
// //         double bonus;
// //         Manager()
// //         {
// //             System.out.println("employee : empty constructor");
// //         }
// //         Manager(int id,String name,double salary,double bonus)
// //         {
// //             System.out.println("MANAGER...!");
// //             this.id=id;
// //             this.name=name;
// //             this.salary=salary;
// //             this.bonus = bonus;
// //         }
// //         public void putEmp()
// //         {
// //             System.out.println(id);
// //             System.out.println(name);
// //             System.out.println(salary);
// //             System.out.println(bonus);
// //         }
// // }

// // public class ConstructorCalling  // 11-02-26
// // {
// //     public static void main(String[] args)
// //     {
// //         // Employee e = new Employee();
// //         // e.putemp();

// //         Manager m = new Manager(102,"siva",4000,500);
// //         m.putEmp();

// //     }
// // }
// class Employee
// {
//     int id;
//     String name;
//     double salary;
//     Employee()
//     {
//         System.out.println("empty constructor...!");
//     }

//     Employee(int id,String name,double salary)
//     {
//         this.id=id;
//         this.name=name;
//         this.salary=salary;
//     }
//     void putemp()
//     {
//         System.out.println("ID : "+id);
//         System.out.println("Name : "+name);
//         System.out.println("Salary : "+salary);
//     }

// }
// class Manager extends Employee 
// {
//         double bonus;
//         Manager()
//         {
//             System.out.println("employee : empty constructor");
//         }
//         Manager(int id,String name,double salary,double bonus)
//         {
//             System.out.println("MANAGER...param const!");
//             this.bonus = bonus;
//         }
//         public void putMan()
//         {
//             super
//             System.out.println("Bonus : "+bonus);
//         }
// }

// public class ConstructorCalling  // 11-02-26
// {
//     public static void main(String[] args)
//     {
//         // Employee e = new Employee();
//         // e.putemp();

//         Manager m = new Manager(102,"siva",4000,500);
//         m.putMan();

//     }
// }

class Employee
{
    int id;
    String name;
    double salary;
    Employee()
    {
        System.out.println("employee empty constructor");
    }
    Employee(int id,String name,double salary)
    {
        System.out.println("Employee param constructor");
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void putEmp()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary"+salary);
    }
}
class Manager extends Employee{
    double bonus;
    Manager()
    {
        System.out.println("manager empty constructor");
    }
    Manager(int id,String name,double salary,double bonus)
    {
        super(id, name, salary);
        System.out.println("manager param constructor");
        this.bonus=bonus;
    }
    public void putEmp()
    {
        super.putEmp();
        System.out.println("Bonus: "+bonus);
    }
}
public class ConstructorCalling {
    public static void main(String[] args) {
        // Employee e=new Employee(101,"Ram",50000.0);
        // e.putEmp();
        Manager m= new Manager(102,"Siva", 40000, 5000);
        m.putEmp();
        //m.putBonus();
    }
}