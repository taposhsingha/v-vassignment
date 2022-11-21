import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Admin ID: ");
        int admin_id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Admin name: ");
        String admin_name = scan.nextLine();
        Admin a = new Admin(admin_id,admin_name);
        System.out.println(a.getName());
        System.out.println("Enter Num of Products: ");

        int num_products =scan.nextInt();
        scan.nextLine();
        for(int i =1;i<=num_products;i++){
            System.out.println("Add product "+i+": ");
            System.out.println("Add product id for product "+i+"(int): ");
            int p_id = scan.nextInt();
            scan.nextLine();
            System.out.println("Add product name for product "+i+"(Char): ");
            String p_name = scan.nextLine();
            System.out.println("Add product group for product "+i+"(Char): ");
            String p_group = scan.nextLine();
            System.out.println("Add product subgroup for product "+i+"(Char): ");
            String p_subgroup = scan.nextLine();
            a.AddProducts(p_id,p_name,p_group,p_subgroup);
        }
        a.ViewProducts();
        System.out.println("Delete product by id(int): ");
        int getID = scan.nextInt();
        scan.nextLine();
        a.DeleteProducts(getID);
        a.ViewProducts();
        System.out.println("Modify product id(int): ");
        int getmodifyID = scan.nextInt();
        scan.nextLine();
        System.out.println("Modify product Name(char): ");
        String getmodifyName = scan.nextLine();
        System.out.println("Modify product Group(char): ");
        String getmodifyGroup = scan.nextLine();
        System.out.println("Modify product SubGroup(char): ");
        String getmodifySubGroup = scan.nextLine();
        a.ModifyProducts(getmodifyID,getmodifyName,getmodifyGroup,getmodifySubGroup);
        System.out.println("Get username");
        String username = scan.nextLine();
        System.out.println("Get Password");
        String password = scan.nextLine();
        Guests b = new Guests(username,password);
        b.ViewProducts();
        System.out.println("Do you want to get registered? (Y/N): ");
        String decision = scan.nextLine();
        if(decision.equals("Y")){
            b.GetRegistered();
        }else if(decision.equals("N")){
            System.out.println("Not registered");
        }
        System.out.println("Get customer ID: ");
        int customer_ID = scan.nextInt();
        scan.nextLine();
        System.out.println("Get customert Name: ");
        String customer_Name = scan.nextLine();
        scan.nextLine();
        System.out.println("Get customer Address: ");
        String customer_Address = scan.nextLine();
        scan.nextLine();
        System.out.println("Get customer Phone No: ");
        int customer_Phone = scan.nextInt();
        scan.nextLine();
        Customer c= new Customer(customer_ID,customer_Name,customer_Address,customer_Phone);
        System.out.println("Enter cart ID: ");
        int cartID = scan.nextInt();
        scan.nextLine();
        Cart m = new Cart(cartID);
        System.out.println("Enter number of products added to cart: ");
        int numofproducts = scan.nextInt();
        scan.nextLine();
        m.setNumberOfProducts(numofproducts);
        
    }
}