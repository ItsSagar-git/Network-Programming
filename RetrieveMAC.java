import java.net.*;
import java.util.Enumeration;

public class IPfrmMAC {
    public static void main(String[] args) {
        String ipAddress = "192.168.1.1"; // Example IP address

        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            NetworkInterface networkInterface = null;

            // Iterate over all network interfaces and check each for the IP address
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = ni.getInetAddress();

                while (inetAddresses.hasMoreElements()) {
                    InetAddress addr = inetAddresses.nextElement();
                    if (addr.equals(inetAddress)) {
                        networkInterface = ni;
                        break;
                    }
                }
                if (networkInterface != null) {
                    break;
                }
            }

            if (networkInterface != null) {
                byte[] mac = networkInterface.getHardwareAddress();

                if (mac != null) {
                    System.out.print("MAC Address: ");
                    for (int i = 0; i < mac.length; i++) {
                        System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                    }
                    System.out.println();
                } else {
                    System.out.println("MAC address not found.");
                }
            } else {
                System.out.println("Network Interface for the given IP address is not found.");
            }
        } catch (UnknownHostException e) {
            System.err.println("UnknownHostException: " + e.getMessage());
        } catch (SocketException e) {
            System.err.println("SocketException: " + e.getMessage());
        }
    }
}
