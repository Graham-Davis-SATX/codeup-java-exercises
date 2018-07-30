class Dish {
    public double costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public String eat() {
        return String.format("%s costs $%s. Do other diners recommend this sandwich? %s\nNom Nom Nom!", nameOfDish, costInCents, wouldRecommend);
    }

    public static void main(String[] args) {
        Dish meal1 = new Dish();
        meal1.costInCents = 5.15;
        meal1.nameOfDish = "The Manwich";
        meal1.wouldRecommend = true;
        System.out.println(meal1.eat());
    }
}