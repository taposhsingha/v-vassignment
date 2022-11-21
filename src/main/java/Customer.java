import java.util.ArrayList;

public class Customer {
    private int Id;
    private String Name;
    private String Address;
    private int PhNo;
    private ArrayList<Products> pList = Admin.getProductsList();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhNo() {
        return PhNo;
    }

    public void setPhNo(int phNo) {
        PhNo = phNo;
    }

    public Customer(int id, String name, String address, int phNo) {
        Id = id;
        Name = name;
        Address = address;
        PhNo = phNo;
    }

    public void BuyProducts(){

    }

    public void ViewProducts(){
        System.out.println("Products List: ");
        for(Products p :pList){
            System.out.println("ID: "+p.getId()+"Name: "+p.getName()+"Group: "+p.getGroup()+"Subgroup: "+p.getSubgroup());
        }
    }

    public void AddToCart(){

    }
}
