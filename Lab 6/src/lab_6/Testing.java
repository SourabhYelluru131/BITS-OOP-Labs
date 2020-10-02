package lab_6;


class Parent
{
    String x = "Parent";
    
    public void print()
    {
        System.out.println(x);
    }
}


class Child extends Parent
{
    String x = "Child";
    
    public void print()
    {
        System.out.println(x);
    }
}


public class Testing{

     public static void main(String []args){
        Parent p = new Child();
        System.out.println(p.x);
        p.print();
     }
}

