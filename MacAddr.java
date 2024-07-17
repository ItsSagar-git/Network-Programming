import java.net.*;
import java.util.*;
public class MacAddr {
    public static void main(String[] args) throws UnknownHostException, SocketException {
        InetAddress ads=InetAddress.getLocalHost();
        NetworkInterface ni=NetworkInterface.getByInetAddress(ads);
        byte[]mac=ni.getHardwareAddress();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<mac.length;i++)
        {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
        }
        System.out.println("MAC Address="+sb.toString());
        
        
    }
    
}
