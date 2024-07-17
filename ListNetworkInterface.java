import java.net.*;
import java.util.*;

public class ListNetworkInterface {
    public static void main(String[] args) throws SocketException {
        // Get a list of all network interfaces
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

        // Iterate through all network interfaces
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement();
            System.out.println("Interface Name: " + ni.getName());
           
            System.out.println();
        }
    }
}
