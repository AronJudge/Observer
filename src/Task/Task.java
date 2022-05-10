package Task;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Task {

    public static void main(String[] args) {
        String msg = "ABCDEFG";

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(msg.getBytes());
            byte[] digest = md.digest();
            System.out.println(digest.length);
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < digest.length; i++) {
                buffer.append(Integer.toHexString(0xff & digest[i]));
            }
            System.out.println(buffer.toString());
            System.out.println(buffer.length());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
