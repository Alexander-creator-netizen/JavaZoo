public class AnimalLeo extends Animals implements СharacterDependentBehavior {

    private String typeLion;
    private boolean characterLion;

    public AnimalLeo(String liveCountry, String typeEat, int averageLifeExpectancy, String foodRation, String typeLion) {
        super(liveCountry, typeEat, averageLifeExpectancy, foodRation);
        this.typeLion = typeLion;
    }

    public AnimalLeo(String nameAnimal, String typeLion,Boolean characterLion) {
        super(nameAnimal);
        this.typeLion = typeLion;
        this.characterLion = characterLion;
    }

    public String getTypeLion() {
        return typeLion;
    }

    public void setTypeLion(String typeLion) {
        this.typeLion = typeLion;
    }

    public boolean isCharacterLion() {
        return characterLion;
    }

    public void setCharacterLion(boolean characterLion) {
        this.characterLion = characterLion;
    }
}
