import java.util.Random;

/**
 * Holiday ASCII Art Generator
 * 
 * Your task: Create a festive Christmas tree using ASCII characters!
 * 
 * Basic tree structure:
 * * <- Star on top
 * *** <- Tree branches (odd numbers of *)
 * *****
 * *******
 * ||| <- Trunk
 */
public class HolidayArt {

    public static void main(String[] args) {
        // TODO: Parse command-line argument for tree height (default: 5)
        int height = 5;

        if (args.length > 0) {
            height = Integer.parseInt(args[0]);
        }

        // TODO: Print the tree
        printTree(height);
    }

    /**
     * Prints a Christmas tree with the given height.
     * 
     * @param height Number of branch levels (not including star and trunk)
     */
    public static void printTree(int height) {
        Random random = new Random();
        
        // TODO: Implement this method
        //
        // Steps:
        // 1. Print the star on top (centered)
        // 2. Loop through each level of branches
        // - Calculate spaces needed for centering
        // - Calculate stars needed (1, 3, 5, 7, ...)
        // 3. Print the trunk (centered)

        // Print branches
        for (int i = 0; i < height; i++) {

        // Spaces
        for (int j = 0; j < height - i - 1; j++) {
            System.out.print(" ");
        }

        // Stars / ornaments
        for (int k = 0; k < (2 * i + 1); k++) {
            if (random.nextInt(4) == 0) {
                System.out.print(random.nextBoolean() ? "o" : "O");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    // Trunk
    for (int i = 0; i < height - 2; i++) {
        System.out.print(" ");
    }
    System.out.println("|||");

    System.out.println();
    System.out.println("Happy Holidays!");

    }
}
