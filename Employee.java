// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Employee {
   int empid;
   String empname;

   Employee() {
   }

   Employee(int var1, String var2) {
      this.empid = var1;
      this.empname = var2;
   }

   void display() {
      System.out.println("id:" + this.empid);
      System.out.println("name:" + this.empname);
   }

   public String toString() {
      return super.toString();
   }
}
