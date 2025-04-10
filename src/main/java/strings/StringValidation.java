package strings;

public class StringValidation {

    public static boolean isAlphabetic(String str) {
        return str.matches(str);
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.)$+";
        return email.matches(emailRegex);
    }

    public static boolean isPhoneNumber(String phoneNumber) {
        String phoneRegux = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        return phoneNumber.matches(phoneRegux);
    }

    public static void main(String[] args) {

        String testString = "diliptalari";
        String email = "dilip.talari@example.com";
        String phoneNumber = "(123) 456-789";

        System.out.println("Is\"" + testString + "\" Alphabetic? " + isAlphabetic(testString));

        System.out.println("Is\"" + email + "\" a valid email? " + isValidEmail(email));

        System.out.println("Is\"" + phoneNumber + "\" a valid phoneNumber? " + isPhoneNumber(phoneNumber));


    }

}


