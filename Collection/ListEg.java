package Collection;

import java.util.ArrayList;
public class ListEg {
    public static void main(String[] args) {
       ArrayList alist=new ArrayList();
       alist.add(10);
       alist.add("hello");
       alist.add(3.5);
       System.out.println(alist);
       Integer a=(Integer)alist.get(0);
       System.out.println(a);
    }
}