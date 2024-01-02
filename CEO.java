public class CEO implements ICEO {
    @Override
    public void addBonus() { /* code duplication */
        System.out.println("Adding bonus at the end of the year...");
    }

    @Override
    public void makeDecisions() {
        System.out.println("Making decisions...");
    }

    @Override
    public void addStocks() {
        System.out.println("Getting shares of the company as bonus...");
    }

    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }
}
