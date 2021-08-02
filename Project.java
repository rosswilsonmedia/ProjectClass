public class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project() {
        this("", "", 0);
    }

    public Project(String name) {
        this(name, "", 0);
    }

    public Project(String name, String description) {
        this(name, description, 0);
    }

    public Project(String name, String description, double initialCost) {
        this.name=name;
        this.description=description;
        this.initialCost=initialCost;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public double getInitialCost(){
        return this.initialCost;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }

    public void elevatorPitch(){
        System.out.println(this.name + " (" + this.initialCost + "): " + this.description);
    }
}