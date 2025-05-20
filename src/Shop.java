import java.util.ArrayList;
import java.util.Scanner;
public class Shop {
    protected ArrayList<Customer> customers = new ArrayList<>();
    protected ArrayList<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Shop() {

        customerCome();
        showCustomers();
        customerLeave();
        addProduct();
        showProducts();
        removeProduct();


    }


    public void customerCome(){
        System.out.println("Customer Come Menu");
        String name = "";
        String exit = "";
        Scanner sc = new Scanner(System.in);
        while(!exit.equalsIgnoreCase("y")) {
            System.out.print("Please Type the Customer name: ");
            name = sc.next();

            System.out.print("All done? (Y/N) : ");
            exit = sc.next();

            customers.add(new Customer(name));

        }


    }

    public void customerLeave(){
        System.out.println("Customer Leave Menu");
        String name = "";
        String exit = "";
        Scanner sc = new Scanner(System.in);
        while(!exit.equalsIgnoreCase("y")) {
            System.out.print("Type the name of customer that you want to remove : ");
            name = sc.next();

            for(int i = 0; i<customers.size(); i++){
                if(customers.get(i).getName().equalsIgnoreCase(name)){
                    customers.remove(i);
                    System.out.println("Customer " + name + " Has been removed");
                    break;
                }
            }

            System.out.print("All done? (Y/N) : ");
            exit = sc.next();
        }


        System.out.println("Update Customer List");
        for(int i = 0; i<customers.size(); i++){
            System.out.println((i+1) + ". " + customers.get(i).getName());
        }

    }

    public void addProduct(){
        System.out.println("Add Product Menu");
        String name = "";
        String exit = "";
        String priceInput = "";
        Scanner sc = new Scanner(System.in);
        while(!exit.equalsIgnoreCase("y")) {

            System.out.print("Please Type the Product name: ");
            name = sc.next();
            if(!name.equalsIgnoreCase("")) {
                System.out.print("Please Type the Product Price : ");
                priceInput = sc.next();
                System.out.print("All done? (Y/N) : ");
                exit = sc.next();
            }
            int price = Integer.parseInt(priceInput);



            products.add(new Product(name, price));

        }


    }

    public void removeProduct(){
        System.out.println("Remove Product Menu");
        String name = "";
        String exit = "";
        Scanner sc = new Scanner(System.in);
        while(!exit.equalsIgnoreCase("y")) {
            System.out.print("Type the name of product that you want to remove : ");
            name = sc.next();

            for(int i = 0; i<products.size(); i++){
                if(products.get(i).getProdName().equalsIgnoreCase(name)){
                    products.remove(i);
                    System.out.println("Product " + name + " Has been removed");
                    break;
                }
            }

            System.out.print("All done? (Y/N) : ");
            exit = sc.next();
        }


        System.out.println("Update Product List");
        for(int i = 0; i<products.size(); i++){
            System.out.println((i+1) + ". " + products.get(i).getProdName() + " Price : Rp." + products.get(i).getPrice()+ ",-");
        }

    }

    public void showCustomers(){
        System.out.println("Registered user list");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i+1) + ". " + customers.get(i).getName());
        }
    }

    public void showProducts(){
        System.out.println("Product list");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i+1) + ". " + products.get(i).getProdName() + " Price : Rp." + products.get(i).getPrice() + ",-");

        }
    }
}
