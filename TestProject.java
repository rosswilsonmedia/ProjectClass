public class TestProject {
    public static void main (String[] args){
        Project instance1 = new Project();
        System.out.println(instance1.getName());
        System.out.println(instance1.getDescription());
        Project instance2 = new Project("random");
        System.out.println(instance2.getName());
        System.out.println(instance2.getDescription());
        Project instance3 = new Project("random2", "an excuse to make money and have fun");
        System.out.println(instance3.getName());
        System.out.println(instance3.getDescription());
        instance3.elevatorPitch();

        Portfolio portfolio = new Portfolio();
        portfolio.addNew(instance3);
        portfolio.showPortfolio();
    }
}