import java.util.ArrayList;

public class Guests {
    private String name;

    ArrayList<Products> pList = Admin.getProductsList();
    public Guests(String name) {
        this.name = name;
    }
    public void ViewProducts(){
        for(Products p :pList){
            System.out.println("ID: "+p.getId()+"Name: "+p.getName()+"Group: "+p.getGroup()+"Subgroup: "+p.getSubgroup());
        }
    }


}
