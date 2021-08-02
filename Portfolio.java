import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    public Portfolio(){
        this.projects= new ArrayList<Project>();
    }

    public ArrayList getAll(){
        return this.projects;
    }

    public void addNew(Project project) {
        this.projects.add(project);
    }

    public double getPortfolioCost(){
        double sum=0;
        for(int i=0; i<this.projects.size(); i++){
            sum+= this.projects.get(i).getInitialCost();
        }
        return sum;
    }

    public void showPortfolio(){
        for(int i=0; i<this.projects.size(); i++){
            this.projects.get(i).elevatorPitch();
        }
        System.out.println(getPortfolioCost());
    }
}