public class EmploymentAuthorizationCard {

    private static final int WIDTH = 70;

    public static void main(String[] args) {

        final String TITLE_USA = "UNITED STATES OF AMERICA";
        final String TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";
        final String ASCII_CREDIT = "ascii art by: jgs";
        final String REENTRY = "   NOT VALID FOR REENTRY TO U.S."; // added spaces

        final String[] ART = {
            "    .----.    .----.     ",
            "   (  --  \\  /  --  )    ",
            "          |  |           ",
            "         _/  \\_          ",
            "        (_    _)         ",
            "     ,    `--`    ,      ",
            "     \\'-.______.-'/      ",
            "      \\          /       ",
            "       '.--..--.'        ",
            "         `\"\"\"\"\"`         "
        };

        String surname = "CHAPETON-LAMAS";
        String givenName = "NERY";
        String category = "C09";
        String cardNum = "SRC9876543210";
        String birthCountry = "Guatemala";
        String terms = "None";
        char sex = 'M';
        String month = "JAN";

        int u1 = 12, u2 = 4, u3 = 789;
        int bDay = 1, bYear = 1970;
        int vDay = 2, vMonth = 2, vYear = 2020;
        int eDay = 2, eMonth = 2, eYear = 2022;

        String uscis = String.format("%03d-%03d-%03d", u1, u2, u3);
        String dob = String.format("%02d %s %d", bDay, month, bYear);
        String valid = String.format("%02d/%02d/%d", vDay, vMonth, vYear);
        String expire = String.format("%02d/%02d/%d", eDay, eMonth, eYear);

        System.out.println("╔══════════════════════════════════════════════════════════════════════╗");

        // Titles positioned to match sample
        printCustomIndent(TITLE_USA, 11);
        printCustomIndent(TITLE_EAC, 31);

        printCustomIndent("Surname", 25);
        printCustomIndent(surname, 25);

        printArt(ART[0], "Given Name");
        printArt(ART[1], givenName);

        printArt(ART[2], String.format("%-14s %-13s %-13s",
                "USCIS#", "Category", "Card#"));

        printArt(ART[3], String.format("%-14s %-13s %-13s",
                uscis, category, cardNum));

        printArt(ART[4], "Country of Birth");
        printArt(ART[5], birthCountry);

        printArt(ART[6], "Terms and Conditions");
        printArt(ART[7], terms);

        printArt(ART[8], String.format("%-16s %-5s",
                "Date of Birth", "Sex"));

        printArt(ART[9], String.format("%-16s %-5c",
                dob, sex));

        // Valid / Expire aligned like sample
        printCustomIndent(String.format("Valid From:    %s", valid), 25);
        printCustomIndent(String.format("Card Expires:  %s", expire), 25);

        // Bottom line with adjusted spacing for REENTRY
        printLineLeft(String.format("%-22s%s", ASCII_CREDIT, REENTRY));

        System.out.println("╚══════════════════════════════════════════════════════════════════════╝");
    }

    private static void printArt(String art, String text) {
        System.out.printf("║%-" + WIDTH + "s║%n", art + text);
    }

    private static void printCustomIndent(String text, int indent) {
        String line = " ".repeat(indent) + text;
        System.out.printf("║%-" + WIDTH + "s║%n", line);
    }

    private static void printLineLeft(String text) {
        System.out.printf("║%-" + WIDTH + "s║%n", text);
    }
}
