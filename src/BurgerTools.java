class BurgerTools {
    public String mostPopularToping;
    public int averageDaysDeforeExpiration;
    public int temperatureWhenCooked;

    public String grill() {
        return String.format("Grillin\' da burgz.\nMake sure it's cooked to %s\u00B0F.\nDon't forget the %s", temperatureWhenCooked, mostPopularToping);
    }
}


