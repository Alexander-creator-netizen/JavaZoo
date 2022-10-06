public abstract class Animals {

    private String liveCountry;
    private String typeEat;
    private int averageLifeExpectancy;
    private String foodRation;
    private String nameAnimal;

    public Animals(String liveCountry, String typeEat, int averageLifeExpectancy, String foodRation) {
        this.liveCountry = liveCountry;
        this.typeEat = typeEat;
        this.averageLifeExpectancy = averageLifeExpectancy;
        this.foodRation = foodRation;
    }

    public Animals(String liveCountry, String typeEat, int averageLifeExpectancy, String foodRation ,String nameAnimal) {
        this.liveCountry = liveCountry;
        this.typeEat = typeEat;
        this.averageLifeExpectancy = averageLifeExpectancy;
        this.foodRation = foodRation;
        this.nameAnimal = nameAnimal;
    }

    public Animals(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getLiveCountry() {
        return liveCountry;
    }

    public void setLiveCountry(String liveCountry) {
        this.liveCountry = liveCountry;
    }

    public String getTypeEat() {
        return typeEat;
    }

    public void setTypeEat(String typeEat) {
        this.typeEat = typeEat;
    }

    public int getAverageLifeExpectancy() {
        return averageLifeExpectancy;
    }

    public void setAverageLifeExpectancy(int averageLifeExpectancy) {
        this.averageLifeExpectancy = averageLifeExpectancy;
    }

    public String getFoodRation() {
        return foodRation;
    }

    public void setFoodRation(String foodRation) {
        this.foodRation = foodRation;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }
}
