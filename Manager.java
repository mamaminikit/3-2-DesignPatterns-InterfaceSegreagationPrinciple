public class Manager implements IManager {
    @Override
    public void addBonus() { /* code duplication */
        System.out.println("Adding bonus at the end of the year...");
    }

    @Override
    public void hire() {
        System.out.println("Making decisions to hire the new employee...");
    }

    @Override
    public void train() {
        System.out.println("Training the new employee...");
    }

    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }
}
