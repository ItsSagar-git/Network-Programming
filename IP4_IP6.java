//Check whether IP is V4 or V6
import java.net.*;
public class IP4_IP6 {
    public static void main(String[] args) {
        try
        {
            InetAddress add=InetAddress.getByName("192.168.1.1");
            byte [] address=add.getAddress();
            if(address.length==4)
            System.out.println("IPV4");
            else
            System.out.println("IPV6");
        }
        catch (UnknownHostException ex)
        {
            System.out.println("Error:"+ex);
        }
    }
    
}
