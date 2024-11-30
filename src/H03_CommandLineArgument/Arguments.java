package H03_CommandLineArgument;

public class Arguments {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("No arguments provided.");
        } else {
            System.out.println("Command-line arguments:");
            // Iterate over and print each argument
            for (String argument : args) {
                System.out.println(argument);
            }
        }
    }
}
