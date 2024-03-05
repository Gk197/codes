public class example
{
   private int rollno;
   private String name;
   
   public String getname()
   {
    return name;
   }

   public void setname(String name)
   {
    this.name=name;
   }

   public int getrollno()
   {
    return rollno;
   }
   public void setrollno()
   {
    this.rollno=rollno;
   }


   example(int roll,String name)
{
    this.name=name;
    this.rollno=rollno;
}
public static void main(String[] args) {
    example sc =new example(15,"nitin");
    sc.getname();
    sc.getrollno();
}
}