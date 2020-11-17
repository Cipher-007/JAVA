import java.util.Scanner;
class ComplexNum
{
    private
    double real,img;
    public ComplexNum()
    {
        real=0;
        img=0;
    }
    public ComplexNum(double r, double i)
    {
        real=r;
        img=i;
    }
    public void Addition(ComplexNum cn2)
    {
        double rr, ii;
        rr= real + cn2.real;
        ii= img + cn2.img;
        System.out.println("Addition of two complex number is "+rr+" + ("+ii+"i)");
    }
    public void Subtraction(ComplexNum cn2)
    {
        double rr,ii;
        rr= real - cn2.real;
        ii= img - cn2.img;
        System.out.println("Subtraction of two complex number is "+rr+" + ("+ii+"i)");
    }
    public void Multiplication(ComplexNum cn2)
    {
        double rr,ii;
        rr = ((real * cn2.real) - (img * cn2.img));
        ii = ((img * cn2.real ) + (real * cn2.img));
        System.out.println("Multiplication is "+String.format("%.2f",rr)+" + ("+String.format("%.2f",ii)+"i)");
    }
    public void Division(ComplexNum cn2)
    {
        double numeratorReal,numeratorComp,denominator;
        numeratorReal = (real* cn2.real) - (img*(-1*(cn2.img)));
        numeratorComp = (real* (-1*(cn2.img)) + (img * cn2.real));
        denominator=  (cn2.real * cn2.real) - (cn2.img * (-1*(cn2.img)));
        double resultReal = numeratorReal/denominator;
        double resultComp = numeratorComp/denominator;
        System.out.println("Division is "+String.format("%.2f",resultReal)+" + ("+String.format("%.2f",resultComp)+"i)");
    }
}
public class ComplexNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and Complex part of the first Complex number: ");
        double r1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        System.out.println("Enter the real and Complex part of the second Complex number: ");
        double r2 = sc.nextDouble();
        double c2 = sc.nextDouble();
        ComplexNum cn1 = new ComplexNum(r1,c1);
        ComplexNum cn2 = new ComplexNum(r2,c2);
        char Selection;
        do
        {
            System.out.println("\n1) Addition");
            System.out.println("\n2) Subtraction");
            System.out.println("\n3) Multiplication");
            System.out.println("\n4) Division");
            System.out.println("\n5) Exit");
            System.out.print("\nYour choice: ");
            Selection = sc.next().charAt(0);
            switch (Selection)
            {
                case'1':
                cn1.Addition(cn2);
                break;
                case'2':
                 cn1.Subtraction(cn2);
                break;
                case'3':
                cn1.Multiplication(cn2);
                break;
                case'4':
                cn1.Division(cn2);
                break;
                case'5':
                System.out.println("Goodbye!!!");
                break;
                default:
                System.out.println("Invalid Entry!!... Please Enter Again ");
                break;
            }
        }
        while (Selection != '5' );
        sc.close();
    } 
}
