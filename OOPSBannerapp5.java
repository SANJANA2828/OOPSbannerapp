public class OOPSBannerapp5 {

   

    // Method to build pattern for 'O'
    public static String[] getOPattern() {
        return new String[]{
                String.join("", " *****   "),
                String.join("", "**   **  "),
                String.join("", "**   **  "),
                String.join("", "**   ** "),
                String.join("", "**   **  "),
                String.join("", "**   **  "),
                String.join("", " *****   ")
        };
    }

    // Method to build pattern for 'P'
    public static String[] getPPattern() {
        return new String[]{
                String.join("", "******  "),
                String.join("", "**    **  "),
                String.join("", "**    ** "),
                String.join("", " ******  "),
                String.join("", "**       "),
                String.join("", "**       "),
                String.join("", "**       ")
        };
    }

    // Method to build pattern for 'S'
    public static String[] getSPattern() {
        return new String[]{
                String.join("", " ******  "),
                String.join("", "**        "),
                String.join("", "**       "),
                String.join("", " *****   "),
                String.join("", "      **  "),
                String.join("", "      **  "),
                String.join("", " ******  ")
        };
    }

    public static void main(String[] args) {

        // Initialize patterns using methods
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();  // Reusing method (DRY)
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Assemble banner (7 lines)
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i];
        }

        // Enhanced for loop for rendering
        for (String line : banner) {
            System.out.println(line);
        }
    }
}