//WAP to find IP address of local machine.
import java.net.*;
public class IPaddEx {
    public static void main(String[] args) {
        try{
            InetAddress ads=InetAddress.getLocalHost();
            String ipads=ads.getHostAddress();
            System.out.println("IP address:"+ipads);
        }
        catch(UnknownHostException ex)
        {
            System.out.println("Error:"+ex);
        }
    }
    
}
