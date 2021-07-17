public class Main {
    public static SecondMain secondMain;

    /**
     * Welcome to the code, this is the main.
     *
     * @param args The arguments specified when running
     */
    public static void main(String[] args) {
        secondMain = new SecondMain();
        System.out.println(secondMain.getMessage());
        System.out.println(getOtherMessage());
        secondMain.doTheThing();
    }

    /**
     * Gets the other message
     *
     * @return the message as a string
     */
    public static String getOtherMessage() {
        return "Other Message!";
    }
}