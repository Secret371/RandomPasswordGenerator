public class Project2 {
    public static String generateRandomPassword(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        StringBuilder password = new StringBuilder();
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }
        return password.toString();
    }

    public static void main(String[] args) {
        int passwordLength = 6; // You can change the length as needed
        String password = generateRandomPassword(passwordLength);
        System.out.println("Generated Password: " + password);
    }
}
