public class OOPSBannerapp6 {

    // Pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "   ***  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***  "
        };
    }

    // Pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "   *****  ",
            " **    ** ",
            " **    ** ",
            " ******  ",
            " **      ",
            " **      ",
            "   **      "
        };
    }

    // Pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "    ***** ",
            " **     ",
            " **     ",
            "  ***** ",
            "      **",
            "      **",
            "  ******  "
        };
    }

    public static void main(String[] args) {

        // Get patterns
        String[] oPattern1 = getOPattern();   // First O
        String[] oPattern2 = getOPattern();   // Second O
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print OOPS
        for (int i = 0; i < oPattern1.length; i++) {
            System.out.println(
                oPattern1[i] + "  " +
                oPattern2[i] + "  " +
                pPattern[i]  + "  " +
                sPattern[i]
            );
        }
    }
}