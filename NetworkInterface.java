import java.net.*;

public class NetworkInterface {
    public static void main(String[] args) throws SocketException {
        NetworkInterface n1 = NetworkInterface.getByName("eth0");
        if (n1 != null)
            System.out.println("eth0 interface exists");
        else
            System.out.println("eth0 doesn't exist.");
    }
}
