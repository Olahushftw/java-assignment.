public class Main {
    public static void main(String[] args) {
        // Stars and stripes dimensions
        int rowsStars = 9;    // Number of rows for the stas section
        int starsPerRow = 9;   //Number of stars per row (simplified)
        int totalStripes = 18; // Number of stripes

        //Print the stars section
        for (int i = 0; i < rowsStars; i++) { // Rows of stars
            for (int j = 0; j < starsPerRow; j++) { //Print stars
                if (j % 2 == i % 2) { // Alternate stars and spaces
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // After the stars in each row,add some "=" to represent the continuation of the stripes
            System.out.print("= = = = = = = = = = = = =");
            System.out.println(); // Move to the next line
        }

        // Print the remaining stripes
        for (int i = 0; i < totalStripes - rowsStars; i++) { // Rremaining rows for stripes
            System.out.println("= = = = = = = = = = = = = = = = = =");
        }
    }
}