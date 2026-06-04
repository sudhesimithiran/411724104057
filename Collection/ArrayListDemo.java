 package Collection;

// // import java.util.ArrayList;

// // public class ArrayListDemo {
// //     public static void main(String[] args) {
// //         ArrayList<Integer> al = new ArrayList<>();
// //         al.add(10);
// //         al.add(20);
// //         al.add(30);
// //         System.out.println(al);
// //         System.out.println(al.size());
// //         al.remove(0);
// //         System.out.println(al);
// //         System.out.println(al.size());
// //     }
// // }

// import java.util.ArrayList;
// import java.util.Arrays;
// public class ArrayListDemo {
//     public static void main(String[] args) {
//         ArrayList <Integer> a1=new ArrayList <Integer>();

//         // a1.add(10);//autoboxing
//         // a1.add(20);
//         // a1.add(30);
// //         // System.out.println(a1);
// //         // System.out.println(a1.size());
// //         // a1.remove(0);
// //         // System.out.println(a1);
// //         // System.out.println(a1.size());
// //         // System.out.println(a1.get(0));
// //         // System.out.println(a1.contains(30));
// //         // for(int i=0;i<a1.size();i++){
// //         //     System.out.println(a1.get(i));
// //         // }
// //         // // Iterator<Integer> it=a1.iterator();
// //         // // while(it.hasNext()){
// //         // //     System.out.println(it.next());    
// //         // // }
        
// // // Integer[] a={1,2,1,3,4,5,2,4};
// // //         ArrayList<Integer> alist=new ArrayList<>(Arrays.asList(a));
// // //         System.out.println(alist);
// // //         alist.sort(null);
// // //         System.out.println(alist);
// // //         ArrayList<Integer> alist2= new ArrayList<>();
// // //         for(Integer integer:alist){
// // //             if(!alist2.contains(integer))
// // //                 alist2.add(integer);
// // //         }

// //        arr.add (custom)    
// // }

// // }

// import java.util.*;
// class Customer{
//     String name;
//     int balance;
//     int id;
//     Customer(String s, int i,int j){
//         name=s;
//         balance=i;
//         id=j;
//     }
//     //toString() method is overridden to give a meaningful S
//     public String toString(){
//         return "Name: "+name+"|Balance: "+balance+"|ID: "+id;
//     }
// }
// public class ArrayListDemo{
//     public static void main(String[] args) {
//         //ArrayList will contain a collection of customers
//         ArrayList <Customer> arr=new ArrayList<Customer>();
//         //Creating customer objects
//         Customer customer1=new Customer("Jay", 1000, 2);
//         Customer customer2=new Customer("Shane", 7000, 3);
//         Customer customer3=new Customer("Ram", 5000, 1);
//         //Storing objects in a ArrayList collection glass
//         arr.add(customer1);
//         arr.add(customer2);
//         arr.add(customer3);
//         for (Customer c : arr) {
//             System.out.println(c);
//         }
//     }
// }


import java.util.*;
class Customer
{
    String name;
    int balance;
    int id;

    //constructor
    Customer(String s,int i, int j)
    {
        name=s;
        balance=i;
        id=j;
    }
    public String getCustomerName()
    {
        return this.name;
    }
    //toString() method is overriden to give a meaningful 
    public String toString()
    {
        return "name:"+name+" Balance:"+balance+"Id:"+id;
    }
}
public class ArrayListDemo
{
    public static void main(String[] args) {
        //ArrayList will contain a collection of customer's\
        ArrayList <Customer> arr=new ArrayList<Customer>();
        Customer customer1=new Customer("keer",1000,2);
        Customer customer2=new Customer("keer1",7000,3);
        Customer customer3=new Customer("keer2",5000,1);

        arr.add(customer1);
        arr.add(customer2);
        arr.add(customer3);
        // for(Customer c:arr)
        // {
        //     System.out.println(c);
        // }
        boolean found=false;
        for (int i = 0; i < arr.size(); i++) {
            Customer c=arr.get(i);
            if(c.getCustomerName().equals("keer"))
            {
                System.out.println("found "+c);
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("customer not found");
        }
    }
}