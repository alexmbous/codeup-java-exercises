public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDish resDish = new RestaurantDish();
        RestaurantDish resDish2 = new RestaurantDish(25, "cheapDish", false);

        resDish.setCostInCents(375);
        resDish.setNameOfDish("taco");
        resDish.setWouldRecommend(true);
        resDish.eat();

        System.out.println("the dish name is:" + resDish.getNameOfDish());
        System.out.println("the dish cost is:" + resDish.getCostInCents());
        System.out.println("My recomendation is i would eat." + resDish.isWouldRecommend());
        System.out.println(resDish.eat());
}

}







//        Create another class called RestaurantTest
//        Add a main method to...
//        1) instantiate a RestaurantDish object called "dish"
//        2) assign values creative to each of the properties
//        3) print out each of the property values
//        4) test the eat() method by calling it