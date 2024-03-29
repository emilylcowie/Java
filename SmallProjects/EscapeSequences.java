package Beginner.SmallProjects;

public class EscapeSequences {
    public static void main(String[] args) {
        // ""
        String message = "Hello \"Emily\""; // how to print smth surrounded by ""
        System.out.println(message);

        // c:\Windows\...
        String message2 = "c:\\Windows\\..."; // Use \\ to escape error with single \
        System.out.println(message2);

        // \n
        String message3 = "c:\nWindows\\..."; // Creates new line
        System.out.println(message3);

        // \t
        String message4 = "c:\tWindows\\..."; // Inputs a tab
        System.out.println(message4);
    }
}
