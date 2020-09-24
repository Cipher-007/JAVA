class A
{
    int a;
    void set_a(final int i)
    {
        a=i;
    }
    void show_a()
    {
        System.out.println("The value of a: "+a);
    }
}
class B extends A
{
    int b;
    void set_b(final int i)
    {
        b=i;
    }
    void show_b()
    {
        System.out.println("The value of b: "+b);
    }
    void mul()
    {
        int c;
        c=a*b;
        System.out.println("The value of c: "+c);
    }
}
public class Inherit
{
     public static void main(final String[] args)
     {
         final B obj_B=new B();
         obj_B.set_a(10);
         obj_B.set_b(20);
         obj_B.show_a();
         obj_B.show_b();
         obj_B.mul();
     }
}