public class Fruit extends Food {

  //TODO:

    @Override
    public String eaten(Animal animal) {return "animal eats fruit";}

    //overloading
    public String eaten(Dog dog) {
        return "dog eats fruit";
    }

    //overloading
    public String eaten(Cat cat) {
        return "cat eats fruit";
    }
}
