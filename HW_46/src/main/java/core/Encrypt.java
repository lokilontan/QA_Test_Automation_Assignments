package core;

import java.util.Arrays;
import java.util.Base64;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.Scanner;

public class Encrypt {
       static Cipher cipher;
       public static String encrypt(String plainText, SecretKey secretKey) throws Exception {
              cipher.init(Cipher.ENCRYPT_MODE, secretKey);
              String encryptedText = Base64.getEncoder().encodeToString(cipher.doFinal(plainText.getBytes()));
              return encryptedText;}

       public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
              cipher = Cipher.getInstance("AES");
              cipher.init(Cipher.DECRYPT_MODE, secretKey);
              String decryptedText = new String(cipher.doFinal(Base64.getDecoder().decode(encryptedText)));
              return decryptedText;}
       
       public static String getPass() {
    	   
    	   System.out.print("Enter the password from FB: ");
    	   Scanner s = new Scanner(System.in);
    	   String pass = s.nextLine();
    	   return pass;
    	   
           
       }

       public static void main(String[] args) throws Exception {
              cipher = Cipher.getInstance("AES");
           String password = getPass();
            //  String key = "d0:53:49:17:3a:34";
          //    key = key.replaceAll("-", ":");  // 00-0c-29-3e-07-e6  =>  00:0c:29:3e:07:e6
              SecretKeySpec sk = new SecretKeySpec(Arrays.copyOf(MyMacAddress.getMac().getBytes("UTF-8"), 16), "AES");
              System.out.println("Password: \t" + password);
              System.out.println("MAC Address: \t" + MyMacAddress.getMac());
              String encryptedpassword = encrypt(password, sk);
              System.out.println("Encrypted: \t" + encryptedpassword);
              String decryptedpassword = decrypt(encryptedpassword, sk);
              System.out.println("Test: \t\t" + decryptedpassword);
       }
}
