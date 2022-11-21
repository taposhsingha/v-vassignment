import java.util.ArrayList;

public class Guests {
    private String name;
    private String password;
    private boolean registered;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    ArrayList<Products> pList = Admin.getProductsList();
    public Guests(String name,String password) {
        this.name = name;
        this.password = password;
    }
    public void ViewProducts(){
        for(Products p :pList){
            System.out.println("ID: "+p.getId()+"Name: "+p.getName()+"Group: "+p.getGroup()+"Subgroup: "+p.getSubgroup());
        }
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public void GetRegistered(){
        setRegistered(true);
        System.out.println("User "+name+" Registered!");
    }
}
