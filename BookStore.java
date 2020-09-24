import java.util.Scanner;
class Publication
{
    int price;  
    String title; 
    int copies; 
    String author;
    
    Scanner KB = new Scanner(System.in);

    Publication()
    {
    }
    
    Publication(int p, String t, int c, String a)
    {   
        price = p;
        title = t;
        copies = c;
        author = a;
    }  
    
    void display()
    {
        System.out.println("Title of book: "+title);
        System.out.println("Price is: "+price);
        System.out.println("No of copies: "+copies);
        System.out.println("No of copies: "+author);
    }
    
    //method to purchase books
    void deposit() {
        int amt;
        System.out.println("Enter Amount of books you want to add to inventory : ");
        amt = KB.nextInt();
        copies = copies + amt;
    }

    //method to sell books
    void withdrawal() {
        int amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt = KB.nextInt();
        if (copies >= amt) {
            copies = copies - amt;
        } else {
            System.out.println("The inventory only has "+copies+" available ");
        }
    }

    // Method to search by title
    boolean search(String acn) {
        if (title.equals(acn)) {
            display();
            return (true);
        }
        return (false);
    }  
}        
public class BookStore {
    public static void main(String args[])
    {         
        Scanner KB = new Scanner(System.in);
        
        //create initial inventory
        System.out.print("How Many books you want to add to inventory: ");
        int n = KB.nextInt();
        Publication C[] = new Publication[n];
        for (int i = 0; i < C.length; i++) 
        {
        Scanner emp = new Scanner(System.in);
        int p;
        String t;
        int c; 
        String a;

        System.out.print("Enter the Price of the book: ");
        p = emp.nextInt();
        System.out.print("Enter the Title of the book:  ");
        t = emp.next();
        System.out.print("Enter the number of copies you want to add in inventory: ");
        c = emp.nextInt();
        System.out.print("Enter the author of the book: ");
        a = emp.next();

        C[i] = new Publication(p,t,c,a);
        KB.close();
        emp.close();
        }
        int ch;
        do {
            System.out.println("Main Menu\n1. Display All\n 2. Search By title\n 3. Add to inventory\n 4. Sell\n 5.Exit ");
                System.out.println("Ur Choice :"); ch = KB.nextInt();
                switch (ch) {
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].display();
                        }
                        break;
                    
                    case 2:
                        System.out.print("Enter the title of the book you want to search: ");
                        String acn = KB.next();
                        boolean found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search failed the book isn't in our inventory.");
                        }
                        break; 

                    case 3:
                        System.out.print("Enter the title of the book : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search failed the book isn't in our inventory.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter the title of the book : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].withdrawal();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search failed the book isn't in our inventory");
                        }
                        break;
                        
                    case 5:
                        System.out.println("Good Bye..");
                        break;
                }
            }
        while (ch != 5);
    }
} 