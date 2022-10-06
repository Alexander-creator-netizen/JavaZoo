public class AnimalDolphins extends Animals implements DolphinsSkills {

    public AnimalDolphins(String liveCountry, String typeEat, int averageLifeExpectancy, String foodRation, String nameAnimal) {
        super(liveCountry, typeEat, averageLifeExpectancy, foodRation, nameAnimal);
    }

    public AnimalDolphins(String nameAnimal) {
        super(nameAnimal);
    }

    @Override
    public void jumpOutWater() {
        System.out.println("Выпрыгивает из воды!");
    }

    @Override
    public void finStrike() {
        System.out.println("Бьёт плавниками по воде!");
    }

    @Override
    public void rideVisitor() {
        System.out.println("Катает посетителя!");
    }
}
