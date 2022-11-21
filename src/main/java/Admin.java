import java.util.ArrayList;

public class Admin {
    private int Id;
    private String Name;
    static ArrayList<Products> products = new ArrayList<Products>();

    static ArrayList<Products> getProductsList(){
        return products;
    }
    public Admin(int id, String name) {
        Id = id;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }
    public void AddProducts(int id,String name,String group,String subgroup){
        Products p = new Products(id,name,group,subgroup);
        products.add(p);
    }
    public void ViewProducts(){
        for(Products p :products){
            System.out.println("ID: "+p.getId()+"Name: "+p.getName()+"Group: "+p.getGroup()+"Subgroup: "+p.getSubgroup());
        }
    }
    public void DeleteProducts(int  ID){
        products.remove(ID);
    }
    public void ModifyProducts(int ID,String p_name,String p_group,String p_subgroup){
        products.get(ID).setName(p_name);
        products.get(ID).setGroup(p_group);
        products.get(ID).setSubgroup(p_subgroup);
        for (Products p : products) {
            System.out.println("Modified Product ID: "+p.getId()+"Name: "+p.getName()+"Group: "+p.getGroup()+"Subgroup: "+p.getSubgroup());
        }
    }

}
