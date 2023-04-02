public class Chocolate extends Food {

  //TODO:

    @Override
    public String eaten(Animal animal) {
        return "animal eats chocolate";
    }


    //overloading
    public String eaten(Dog dog) {return "dog eats chocolate";}

    //overloading
    public String eaten(Cat cat) {return "cat eats chocolate";}
}
