/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class AppISP {
    public static void main(String[] args) {
        ICEO ceo = new CEO();
        ceo.addBonus();
        ceo.salary();
        ceo.makeDecisions();
        ceo.addStocks();

        IEmployee manager = new Manager();
        manager.salary();
        /* manager.addBonus();
         * Error: not use interface IManager
         * Mean: Does not have addBonus method
         */
    }
}
