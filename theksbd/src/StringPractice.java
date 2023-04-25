public class StringPractice {
    public static void main(String[] args) {
        String s = "theksbd@gmail.com";

        int indexOfAtSign = s.indexOf('@');
        String username = s.substring(0, indexOfAtSign);
        String domain = s.substring(indexOfAtSign + 1);

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

        // Check if the domain is gmail using startsWith
        boolean isGmail = domain.startsWith("gmail");
        System.out.println("Is Gmail: " + isGmail);

        // Check if the domain is gmail using Regex
        boolean isGmailRegex = s.matches(".*@gmail\\.com");
        System.out.println("Is Gmail: " + isGmailRegex);

        // Remove special characters from a string
        String str = "He!@#l$%^&*()_l+{}|:<>?/.,o";
        String strWithoutSpecialChars = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("String without special characters: " + strWithoutSpecialChars);

        // Remove extra space from a string
        String str1 = "   Hello   World   from       Viet Nam ";
        String strWithoutExtraSpace = str1.trim().replaceAll("\\s+", " ");
        System.out.println("String without extra space: " + strWithoutExtraSpace);
    }
}
