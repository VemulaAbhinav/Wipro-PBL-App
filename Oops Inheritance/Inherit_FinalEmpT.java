package Oops_Inheritance;


public class Inherit_FinalEmpT {
 public static void main(String args[])
 {
   Inherit_Person per=new Inherit_Person("Abhinav Vemula");	 
   Inherit_Empl emp = new Inherit_Empl(per,1200.00,350,"0862571");
   System.out.println(emp.getPer()+" "+emp.getStart_year()+" "+emp.getAnnual_salary()+" "+emp.getNIN());

 }
}
