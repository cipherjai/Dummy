package NSC;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Natasha on 11/11/2016.
 */
public class DeffieHelman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // ----
        System.out.println("Enter the new Number (prime) : ");
        BigInteger p  = scanner.nextBigInteger();
        //--
        System.out.println("Enter the primitive root of "+p+"  : ");
        BigInteger primitiveRoot = scanner.nextBigInteger();

        //

        System.out.println("Enter the value of x less than p : ");
        BigInteger x = scanner.nextBigInteger();

        //

        BigInteger r1 = primitiveRoot.modPow(x,p);

        System.out.println("R1 = "+ r1);

        System.out.println("Enter the value for y less than p :");
        BigInteger y = scanner.nextBigInteger();

        BigInteger r2 = primitiveRoot.modPow(y,p);

        System.out.println("R2  = "+r2);

        BigInteger k1 = r2.modPow(x,p);
        BigInteger k2 = r1.modPow(y,p);

        System.out.println("Key calculated at Alice's Side : "+ k1 );
        System.out.println("Key calculated at Bob's Side : "+ k2 );
    }
}
