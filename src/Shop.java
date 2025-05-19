import java.util.ArrayList;
import java.util.Scanner;
public class Shop {
    protected ArrayList<Customer> customers = new ArrayList<>();
    protected ArrayList<Item> items;
    Scanner sc = new Scanner(System.in);

    public Shop() {
        String nameInput="";
        String optionInput = "";
        while(!nameInput.equalsIgnoreCase("exit")) {
            System.out.println("Please Type the Customer name: (Type exit to finish populating customers");
            nameInput = sc.next();
            populateCustomers(nameInput);
            System.out.println("Registered user list");
            for(int i = 0; i<customers.size(); i++){
                System.out.println(customers.get(customers.size()-1).getName());
            }
        }

    }

    public void populateCustomers(String name){


        Customer c = new Customer();
        c.setName(name);
        customers.add(c);

    }

    public void customerCome(String name){
        System.out.println("Customer Come Menu");



    }

    public void registerCustomer(String name){


    }
    // customerLeave()
    // addProduct()
    // removeProduct()
    // showCustomers()
    // showProducts()
}
