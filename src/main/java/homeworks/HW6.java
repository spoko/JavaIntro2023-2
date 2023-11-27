package homeworks;

public class HW6 {

    public static void main(String[] args) {
        System.out.println(isValidPassword("parola"));
        System.out.println(isValidPassword("ParolaRibaMe4"));
        System.out.println(isValidPassword("ParolaRibaMe4!"));
    }

    public static boolean isValidPassword(String password){
        String regex = "\\A(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&*+=!])(?=\\S+$).{8,}\\z";
        return password.matches(regex);
    }
}
