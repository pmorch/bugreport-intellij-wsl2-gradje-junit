public class MyApp {
    public static int countToTwo() {
        int counter = 0;
        counter++;
        counter = counter + 1;
        return counter;
    }
    public static void main(String[] args) {
        System.out.println("Hello World: " + countToTwo());
    }
}
