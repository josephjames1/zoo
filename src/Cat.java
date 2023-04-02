public class Cat extends Animal {

  //TODO:

    //because cat extends
    @Override
    public String eat(Food food) {return food.eaten(this);}
}
