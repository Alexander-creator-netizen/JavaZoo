public class AnimalHorse extends Animals{
    private String typeHorse;

    public AnimalHorse(String liveCountry, String typeEat, int averageLifeExpectancy, String foodRation, String typeHorse) {
        super(liveCountry, typeEat, averageLifeExpectancy, foodRation);
        this.typeHorse = typeHorse;
    }

    public AnimalHorse(String nameAnimal) {
        super(nameAnimal);
    }

    public String getTypeHorse() {
        return typeHorse;
    }

    public void setTypeHorse(String typeHorse) {
        this.typeHorse = typeHorse;
    }
}
