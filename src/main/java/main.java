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
        Guests b= new Guests("Anindo");
        b.ViewProducts();
    }
}