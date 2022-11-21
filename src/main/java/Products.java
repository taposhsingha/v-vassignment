import java.util.ArrayList;

public class Products {
    private int Id;
    private String Name;
    private String Group;
    private String Subgroup;


    public Products(int id, String name, String group, String subgroup) {
        Id = id;
        Name = name;
        Group = group;
        Subgroup = subgroup;

    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getGroup() {
        return Group;
    }

    public String getSubgroup() {
        return Subgroup;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public void setSubgroup(String subgroup) {
        Subgroup = subgroup;
    }
}
