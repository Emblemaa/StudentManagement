package Classes.Tools;

public class CurrentAccount {
    private static String username;
    private static String password;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        CurrentAccount.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        CurrentAccount.password = password;
    }
}
