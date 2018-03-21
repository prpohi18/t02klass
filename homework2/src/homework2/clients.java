package homework2;

public class clients {
    protected String customer;
    protected String nationality;
    protected int budget;
    protected int projects;
    protected int minimumEmployees;
    protected int minimumRevenue;
    
    public clients(String customer, String nationality, int budget, int projects, int minimumEmployees, int minimumRevenue){
        this.customer = customer;
        this.nationality = nationality;
        this.budget = budget;
        this.projects = projects;
    }
    
    public int projectValue(){
        return budget/projects;
    }
    

    

}

