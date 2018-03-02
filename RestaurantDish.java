public class RestaurantDish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public RestaurantDish(){};

    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public String eat(){
        return "nom nom nom nom nom";
    }

}



//
//    Create a class called "RestaurantDish" (you should not include quotes)
//        Include an integer property called "costInCents"
//        Include a string property called "nameOfDish"
//        Include a boolean property called "wouldRecommend"
//        Include a method called "eat"
//        this method will print out "Nom nom nom!"



//    SHORT ASSIGNMENT #2 (part 2) --
//        Refactor your RestaurantDish and RestaurantTest classes...
//        1) Change your public properties in your RestaurantDish class to private
//    2) Add getters and setters for these properties (use IntelliJ to do this quickly)
//            3) Refactor code used in RestaurantTest to set and print these property values...
//            ...to use your getters and setters
//            4) Add a constructor method to RestaurantDish that will assign property...
//            ...values based on arguments passed into the constructor




