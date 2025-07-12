import java.util.*;
class Inventory
{
    String name;
    int quantity;
    int price;
    
    Inventory(String name, int quantity, int price)
    {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    void setdetails(String name,int quantity,int price)
    {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    void view()
    {
        System.out.println(this.name+" "+this.quantity+" "+this.price);
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    ArrayList<Inventory> ll=new ArrayList<>();
        while(true)
        {
            System.out.println("press 1.additem 2.deleteitem 3.view item 4.updateitem 5.exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1->{ 
                             System.out.println("enter item name");
                             sc.nextLine();
                             String s=sc.nextLine();
                             System.out.println("enter the quantity");
                             int q=sc.nextInt();
                             System.out.println("enter the price of item");
                             int p=sc.nextInt();
                             ll.add(new Inventory(s,q,p));
                             System.out.println();
                             System.out.println("item added successfully!");
                        }
                        
                
                    case 2->
                    {
                       System.out.print("Enter item name to delete: ");
                        sc.nextLine();
                        String itemName = sc.nextLine();
                        boolean found = false;
                        
                        for (int i = 0; i < ll.size(); i++)
                        {
                            if (ll.get(i).name.equalsIgnoreCase(itemName)) 
                            {
                                ll.remove(i);
                                System.out.println("Item deleted successfully!");
                                found = true;
                                break;
                            }
                        }
                        
                        if (!found) 
                        {
                            System.out.println("Item not found.");
                        }
                        
                    }
                        
                    case 3->
                    {
                        
                        for(Inventory san:ll)
                        {
                           san.view();
                        }
                    }
                    case 4->
                    {
         
                        System.out.print("Enter the name of the item to update: ");
                        sc.nextLine(); // consume leftover newline
                        String nameToUpdate = sc.nextLine();
                    
                        boolean found = false;
                    
                        for (Inventory item : ll)
                        {
                            if (item.name.equalsIgnoreCase(nameToUpdate))
                            {
                                System.out.print("Enter new quantity: ");
                                item.quantity = sc.nextInt();
                    
                                System.out.print("Enter new price: ");
                                item.price = sc.nextInt();
                    
                                System.out.println("Item updated successfully!");
                                found = true;
                                break;
                            }
                        }

                        if (!found)
                        {
                            System.out.println("Item not found.");
                        }
                        
                    }
                    case 5-> System.exit(0);
                    default ->
                    {
                        System.out.println("enter valid choice");
                    }
                    
            }
        }
	}
        
}

