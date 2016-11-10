package NSC;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


/**
 * Created by Natasha on 11/11/2016.
 */
public class HashFunction {


    public static void main(String[] args) {

        System.out.println("Enter the String to be encrypted ! : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = null;
        try {
            output = HashFunction.getStringFromSHA256(input);
        } catch (NoSuchAlgorithmException e)
        {
            System.out.println("Sorry For Delay");
        }
        System.out.println(output);
    }

    private static final char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

    public static String byteArray2Hex(byte[] bytes) {
        StringBuffer sb = new StringBuffer(bytes.length * 2);
        for(final byte b : bytes) {
            sb.append(hex[(b & 0xF0) >> 4]);
            sb.append(hex[b & 0x0F]);
        }
        return sb.toString();
    }

    public static String getStringFromSHA256(String stringToEncrypt) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(stringToEncrypt.getBytes());
        return byteArray2Hex(messageDigest.digest());
    }



}
