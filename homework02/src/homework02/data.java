package homework02;

class Data {
    protected String name;
    protected String code;
    protected String language;
    protected String location;
    protected double population;
    protected double unemployment;
    
    public double calculateUnemployment() {
       double unemployment = Math.round(this.population / 100 * this.unemployment * 1000000);
        //System.out.println(Math.round(unemployment));
        return unemployment;
    }
}
