public class BurgerTest {
    public static void main(String[] args) {
        BurgerTools meal1 = new BurgerTools();
        meal1.mostPopularToping = "Pickles";
        meal1.averageDaysDeforeExpiration = 365;
        meal1.temperatureWhenCooked = 135;
        System.out.println(meal1.grill());
    }
}
