public class Main {
    public static void main(String[] args) {
        // Экземпляр класса
        // Animal yosya = new Animal("Йося", "Юля", "ожирение", false);
        // System.out.println(yosya.isVaccinated());
        // yosya.setVaccinated(true);
        // System.out.println(yosya.isVaccinated());
        // System.out.println(yosya.getType());

        // Animal monya = new Cat(); // Полиморфизм

        // System.out.println(monya.getType("С arg "));
        // cat.hunt();
        // Catfish nemo = new Catfish();
        // animals.add(nemo);
        // System.out.println(animals);
        // Parrot kesha = new Parrot();
        // System.out.println(kesha);
        // System.out.print("Кеша: ");
        // kesha.eat();
        // System.out.print("Немо: ");
        // nemo.eat();
        // System.out.print("Макс: ");
        // max.eat();
        // System.out.print("Шарик: ");
        // sharik.eat();
        // System.out.print("Немо: ");
        // nemo.swim();
        // System.out.print("Кеша: ");
        // kesha.fly();
        // System.out.print("Йося: ");
        // max.toGo();
        // System.out.print("Шарик: ");
        // sharik.toGo();

        VetClinica clinica = new VetClinica();
        clinica.addNewAnimal(new Dog("Рекс", "Марина", "простуда", true))
                .addNewAnimal(new Cat("Васька", "Светлана", null, false));
        clinica.addNewAnimal(new Parrot("Кеша", "Василий", null, false));
        clinica.addNewAnimal(new Fish("Немо", "Сергей", null, false));
        clinica.addNewAnimal(new Crow("Каркуша", "Александр", "сломано крыло", false));
        clinica.addNewAnimal(new Turtle("Рафаэль", null, null, false));

        for (Animal animal : clinica.getAnimals()) {
            animal.ill();
        }

        System.out.println(clinica.getFlyingAnimals());
        System.out.println(clinica.getRunningAnimals());
        System.out.println(clinica.getSwimingAnimals());
        System.out.println(clinica.getSoundAnimal());
    }
}
