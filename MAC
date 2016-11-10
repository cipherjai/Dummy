package NSC;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by Natasha on 11/11/2016.
 */
public class MAC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InetAddress ip =  null;

        try
        {
            ip = InetAddress.getLocalHost();
            System.out.println("The IP Address is : " + ip.getHostAddress());

            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(ip);
            byte [] mac = networkInterface.getHardwareAddress();

            System.out.print("Current mac address is : ");

            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<mac.length;i++)
            {
                sb.append(String.format("%02X%s",mac[i],(i < mac.length-1) ? "-" : " "));

            }
            System.out.print(" "+sb.toString());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
