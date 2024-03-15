// HelloWorldTest.java
public class HelloWorldTest {
    public static void main(String[] args) {
        // Test method to demonstrate testing
        testHelloWorld();
    }

    public static void testHelloWorld() {
        HelloWorld hello = new HelloWorld();
        String message = "Hello, world!";
        if (hello.getClass().getSimpleName().equals("HelloWorld")) {
            if (hello.toString().equals(message)) {
                System.out.println("Test passed!");
            } else {
                System.out.println("Test failed!");
            }
        } else {
            System.out.println("Test failed!");
        }
    }
}
