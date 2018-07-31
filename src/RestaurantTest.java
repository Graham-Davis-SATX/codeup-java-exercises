public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish meal2 = new RestaurantDish(5.15, "The Manwich", true);
        System.out.println(meal2.getNameOfDish());
        meal2.setCostDollarsCents(5.50);
        System.out.println(meal2.getCostDollarsCents());
    }
}
