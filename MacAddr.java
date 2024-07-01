import java.net.*;
import java.util.*;
public class MacAddr {
    public static void main(String[] args) throws UnknownHostException, SocketException {
        InetAddress ads=InetAddress.getLocalHost();
        NetworkInterface ni=NetworkInterface.getByInetAddress(ads);
        byte[]mac=ni.getHardwareAddress();
        
        
    }
    
}
