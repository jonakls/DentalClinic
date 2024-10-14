package top.jonakls.dentalclinic.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Formatter;

public final class PasswordUtil {

    private PasswordUtil() {
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }

    private static String encode64(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    private static String decode64(String input) {
        return new String(Base64.getDecoder().decode(input));
    }

    public static String hash(String inputPassword) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] hashBytes = md.digest(inputPassword.getBytes(StandardCharsets.UTF_8));
            return encode64(bytesToHex(hashBytes));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String bytesToHex(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

    public static boolean comparePassword(String inputPassword, String storedPassword) {
        String inputHash = hash(inputPassword);
        return decode64(inputHash).equals(decode64(storedPassword));
    }
}
