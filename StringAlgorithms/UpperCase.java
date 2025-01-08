public class UpperCase {
    public static void main(String[] args) {

        System.out.println(reverseEachWord("Hello world"));

    }
    

    public static boolean isUpperCase(String s) {
        // chars is use to create character stream and to check if all characters
        // matches the condition of case
        // this returns boolean value
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String s) {
        return s.chars().allMatch(Character::isLowerCase);
    }

    // returns true if no value is upper case
    public static boolean noneMatch(String s) {
        return s.chars().noneMatch(Character::isUpperCase);
    }

    // checks if the password is valid if password contains atleast 1 upper case, 1
    // lower case and one digit
    public static boolean isPasswordValid(String s) {
        // any match checks if there is any character which is needed for validation
        return s.chars().anyMatch(Character::isUpperCase) && s.chars().anyMatch(Character::isLowerCase)
                && s.chars().anyMatch(Character::isDigit);
    }

    // this returns the normal string that first converts strin
    public static String normalizedString(String s) {
        return s.toLowerCase().trim().replace(",", " ");
    }

    // using for loops
    public static void parseContents(String s) {
        System.out.println("Using foreach loop");
        for (char c : s.toCharArray()) {
            System.out.print(c);
        }

        System.out.println();
        System.out.println("Using for loop");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
        }
    }

    // checks if the item is in even index or not.
    public static boolean isAtEvenIndex(String s, char item) {
        // we check if the string is null or empty
        // we first check null because if the isEmpty is called first and the string is
        // null it will throw an error
        if (s == null || s.isEmpty()) {
            return false;
        }

        // by incrementing i by 2 we improve the time complexity
        for (int i = 0; i < s.length() / 2 + 1; i += 2) {
            if (s.charAt(i) == item) {
                return true;
            }
        }
        return false;
    }

    public static String reverse(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        // use string builder to store characters
        StringBuilder reversed = new StringBuilder();
        // itrarte through last index
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverse2(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static String reverseEachWord(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(reverse(word));
            result.append(" ");
        }
        result.trimToSize();
        return result.toString();
    }

}
