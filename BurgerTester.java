
public class BurgerTester {
        private static double halfMin = .5;
    public static void main(String[] arg) {
        Burgertools BT = new Burgertools();


        BT.mostPopularTopping = "cheese";
        BT.averageDaysBeforeExpiration = 3;
        BT.temperatureWhenCooked = 155;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("the most popular topping is: " +  BT.mostPopularTopping);
        System.out.println("the average amount of days before expirations is: " +BT.averageDaysBeforeExpiration + " days");
        System.out.println("Cook burger to "+ BT.temperatureWhenCooked + " degrees.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        BT.cookingInstructions();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        BT.grill();
        System.out.println();
        System.out.println("~~~~~~~~~~~~Burger Timer~~~~~~~~~~~~~");
        BT.setTimeout(() -> BT.halfMinuteCounter(halfMin), 30000);
        BT.setTimeout(() -> BT.halfMinuteCounter(halfMin += .5), 60000);
        BT.setTimeout(() -> BT.halfMinuteCounter(halfMin += .5), 90000);
        BT.setTimeout(() -> BT.halfMinuteCounter(halfMin += .5), 120000);
        BT.setTimeout(() -> BT.halfMinuteCounter(halfMin += .5), 150000);
        BT.setTimeout(() -> BT.halfMinuteCounter(halfMin += .5), 180000);
        BT.setTimeout(() ->System.out.println("~~~~~~~~~~FLIP BURGER~~~~~~~~~~"), 180001);
        BT.setTimeout(() -> BT.halfMinuteCounter(halfMin += .5), 210000);
        BT.setTimeout(() -> BT.halfMinuteCounter(halfMin += .5), 240000);
        BT.setTimeout(() -> BT.halfMinuteCounter(halfMin += .5), 270000);
        BT.setTimeout(() -> BT.halfMinuteCounter(halfMin += .5), 300000);
        BT.setTimeout(() -> BT.halfMinuteCounter(halfMin += .5), 330000);
        BT.setTimeout(() -> BT.halfMinuteCounter(halfMin += .5), 360000);
        BT.setTimeout(() ->System.out.println("~~~~~~~~~~BURGER DONE~~~~~~~~~~"), 360001);
        BT.setTimeout(() ->System.out.println("3. Remove burger from grill and build sandwich."),360002);



    }
}
