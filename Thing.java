import javax.naming.Name;

// Taqi
// when making any in game thing, extend it off this class to use the name and description.

public class Thing {

    private String name;
    private String description;

    public Thing(String Name, String Description) {
        this.name = Name;
        this.description= Description;
    }

    public Thing() {

    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.name = Description;
    }
}