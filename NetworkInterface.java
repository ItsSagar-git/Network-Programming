import java.net.*;
import java.util.Enumeration;

public class NetworkInterface {
    public static void main(String[] args) throws SocketException {
        NetworkInterface n1 = NetworkInterface.getByName("eth0");
        if (n1 != null)
            System.out.println("eth0 interface exists");
        else
            System.out.println("eth0 doesn't exist.");
    }

    static Enumeration<NetworkInterface> getNetworkInterfaces() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
