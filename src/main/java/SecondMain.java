public class SecondMain {
    /**
     * The initializing class, prints when it runs
     */
    public SecondMain() {
        System.out.println("I have been initialized.");
    }

    /**
     * Does some {@link #doTheThingTwo() math} and then prints
     */
    public void doTheThing() {
        System.out.println(doTheThingTwo());
        System.out.println("I did the thing.");
    }

    /**
     * Gets the message in the code
     *
     * @return a string of the message
     */
    public String getMessage() {
        return "Hello World!";
    }

    /**
     * Does some multiplication
     *
     * @return 5 * 2 as a string
     */
    private String doTheThingTwo() {
        //return Integer.toString(doMultiplication(5, 2));
        return Integer.toString(5 * 2);
    }

    /*
    private int doMultiplication(int valueOne, int valueTwo) {
        return valueOne * valueTwo;
    }
     */
}