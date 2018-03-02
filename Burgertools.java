public class Burgertools {


// TO SET A TIMER FOR BURGER COOKING>>>> \/\/\/\/\/
    public static void setTimeout(Runnable runnable, int delay){
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            }
            catch (Exception e){
                System.err.println(e);
            }
        }).start();
    }



    public String mostPopularTopping;
    public int averageDaysBeforeExpiration;
    public int temperatureWhenCooked;

    public void grill(){
        System.out.println("~~~~~~~~~~~GRILLING BURGER~~~~~~~~~~~");
    }

    public void cookingInstructions(){
        System.out.println("1. Make sure you have seasoned with Salt and Pepper on each side.");
        System.out.println("2. Cook for 3 minutes on each side.");

    }
    public double halfMinuteCounter(double num){
        System.out.println(num);
        return num;
    }


}

//    SHORT ASSIGNMENT #2 (part 1) --
//        Create a class of static properties and methods called BurgerTools
//        Include a string property of mostPopularTopping
//        Include an int property of averageDaysBeforeExpiration
//        Include an int property of temperatureWhenCooked
//        Include a void method called grill() that prints out "Grilling burger"
//        Create a class called BurgerTester to test assigning and printing property values
//        and testing methods.
//        If you have time, add additional properties and methods.
//
