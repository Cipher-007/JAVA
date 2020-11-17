import java.util.*;

class employee
{
    int empid;
    long mobile;
    String name, address, mailid;
    Scanner get = new Scanner(System.in);

    void getdata()
    {
        System.out.print("Enter Name of the Employee: ");
        name = get.nextLine();
        System.out.print("Enter Mail id: ");
        mailid = get.nextLine();
        System.out.print("Enter Address of the Employee: ");
        address = get.nextLine();
        System.out.print("Enter employee id: ");
        empid = get.nextInt();
        System.out.print("Enter Mobile Number: ");
        mobile = get.nextLong();
    }

    void display()
    {
        System.out.println("Name of the employee is:- "+name);
        System.out.println("Employee id:- "+empid);
        System.out.println("Email address of the employee is:- "+mailid);
        System.out.println("Employee's current address is:- "+address);
        System.out.println("Mobile Number of the employee is:- "+mobile);
    }
}
class Programmer extends employee
{
    double salary,bp,da,hra,pf,club,net,gross;

    void getprogrammer()
    {
        System.out.print("Enter basic pay: ");
        bp = get.nextDouble();
    }

    void calculateprog()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("************************************************");
        System.out.println("PAY SLIP FOR PROGRAMMER");
        System.out.println("************************************************");
        System.out.println("Basic Pay: ₹"+bp);
        System.out.println("DA: ₹"+da);
        System.out.println("PF: ₹"+pf);
        System.out.println("HRA: ₹"+hra);
        System.out.println("CLUB: ₹"+club);
        System.out.println("GROSS PAY: ₹"+gross);
        System.out.println("NET PAY: ₹"+net);
    }

}

class TeamLead extends employee
{
    double salary,bp,da,hra,pf,club,net,gross;

    void getlead()
    {
        System.out.print("Enter basic pay: ");
        bp = get.nextDouble();
    }

    void calculatelead()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("************************************************");
        System.out.println("PAY SLIP FOR TEAM LEAD");
        System.out.println("************************************************");
        System.out.println("Basic Pay: ₹"+bp);
        System.out.println("DA: ₹"+da);
        System.out.println("HRA: ₹"+hra);
        System.out.println("PF: ₹"+pf);
        System.out.println("CLUB: ₹"+club);
        System.out.println("GROSS PAY: ₹"+gross);
        System.out.println("NET PAY: ₹"+net);
    }
}

class AssistantProjectManager extends employee
{
double salary,bp,da,hra,pf,club,net,gross;

void getassistant()
    {
        System.out.print("Enter basic pay: ");
        bp = get.nextDouble();
    }

void calculateassistant()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("************************************************");
        System.out.println("PAY SLIP FOR ASSISTANT PROJECT MANAGER");
        System.out.println("************************************************");
        System.out.println("Basic Pay: ₹"+bp);
        System.out.println("DA: ₹"+da);
        System.out.println("HRA: ₹"+hra);
        System.out.println("PF: ₹"+pf);
        System.out.println("CLUB: ₹"+club);
        System.out.println("GROSS PAY: ₹"+gross);
        System.out.println("NET PAY: ₹"+net);
    }
}

class ProjectManager extends employee
{
    double salary,bp,da,hra,pf,club,net,gross;

    void getprojectmanager()
    {
        System.out.print("Enter basic pay: ");
        bp = get.nextDouble();
    }

    void calculateprojectmanager()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("************************************************");
        System.out.println("PAY SLIP FOR PROJECT MANAGER");
        System.out.println("************************************************");
        System.out.println("Basic Pay: ₹"+bp);
        System.out.println("DA: ₹"+da);
        System.out.println("HRA: ₹"+hra);
        System.out.println("PF: ₹"+pf);
        System.out.println("CLUB: ₹"+club);
        System.out.println("GROSS PAY: ₹"+gross);
        System.out.println("NET PAY: ₹"+net);
    }
}

class salary
{
    public static void main(String args[])
    {
        int choice,cont;
        do
        {
            System.out.println("************************************************");
            System.out.println("PAYROLL");
            System.out.println("************************************************");
            System.out.print("1.PROGRAMMER \n2.TEAM LEAD \n3.ASSISTANT PROJECT MANAGER \n4.PROJECT MANAGER\nYour choice: ");
            Scanner c = new Scanner(System.in);
            choice=c.nextInt();
            switch(choice)
            {
                case 1:
                {
                    Programmer p=new Programmer();
                    p.getdata();
                    p.getprogrammer();
                    p.display();
                    p.calculateprog();
                    break;
                }
                case 2:
                {
                    TeamLead lead=new TeamLead();
                    lead.getdata();
                    lead.getlead();
                    lead.display();
                    lead.calculatelead();
                    break;
                }
                case 3:
                {
                    AssistantProjectManager assis=new AssistantProjectManager();
                    assis.getdata();
                    assis.getassistant();
                    assis.display();
                    assis.calculateassistant();
                    break;
                }
                case 4:
                {
                    ProjectManager pm=new ProjectManager();
                    pm.getdata();
                    pm.getprojectmanager();
                    pm.display();
                    pm.calculateprojectmanager();
                    break;
                }
            }
            System.out.print("1 to continue & 0 to quit: ");
            cont=c.nextInt();
        }
        while(cont==1);
    }
}