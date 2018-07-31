public class RestaurantDish {
    private double costDollarsCents;
    private String nameOfDish;
    private boolean wouldRecommend;


    public RestaurantDish(double costDollarsCents, String nameOfDish, boolean wouldRecommend) {
        this.costDollarsCents = costDollarsCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public double getCostDollarsCents() {
        return costDollarsCents;
    }

    public void setCostDollarsCents(double costDollarsCents) {
        this.costDollarsCents = costDollarsCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

//    public boolean getWouldRecommend() {
//        return wouldRecommend;
//    }

//    public void setWouldRecommend(boolean wouldRecommend) {
//        this.wouldRecommend = wouldRecommend;
//    }

//
//    class Person {
//        public String name;
//
//        // the Person constructor
//        public Person() {
//            System.out.println("A Person is being created!");
//        }
//
//        public static void main(String[] args) {
//            Person p1 = new Person();
//            Person p2 = new Person();
//        }
//    }

}