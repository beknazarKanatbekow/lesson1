public class Main {
    public static void main(String[] args) {
        String[] commands = {"сидеть","лежать"};
        Shelter romashka = new Shelter("ромашка",
                "чуй1");
        Dog dog = new Dog("чарли","алабай", commands,
                ColorEnum.WHITE, romashka);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("гув гув");

        Shelter animal = new Shelter("животные", "чуй");
        Dog dog1 = new Dog("боб", "питбуль", ColorEnum.BLACK, animal);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();
        dog1.makeVoice("ав ав");

        Shelter animals = new Shelter("animals","chuy2");
        Dog dog2 = new Dog("chopa","avcharka",ColorEnum.GRAY,animals);
        System.out.println(dog2.getInfo());
        dog2.makeVoice();
        dog2.makeVoice("gav gav");
    }
}
