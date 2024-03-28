package superheroe;

public class Superheroe {
    String name;
    String description;
    boolean cape;

    public Superheroe(String name) {
        this.name = name;
        this.description = "";
        this.cape = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCape() {
        return cape;
    }

    public void setCape(boolean cape) {
        this.cape = cape;
    }
    
    @Override
    public String toString() {
        return "Superheroe{" + "name=" + name + ", description=" + description + ", cape=" + cape + '}';
    }
    
}
