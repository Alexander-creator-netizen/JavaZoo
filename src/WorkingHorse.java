public class WorkingHorse extends AnimalHorse implements WorkhorseNeeds {

    public WorkingHorse(String nameAnimal) {
        super(nameAnimal);
    }

    @Override
    public void drinkWater() {
        System.out.println("Пьёт воду.");
    }

    @Override
    public void eatSugar() {
        System.out.println("Съедает кусочек сахара.");
    }

    @Override
    public void horseTired() {
        System.out.println("Вздыхает, но продолжает путь. Движется медленнее.");
    }
}
