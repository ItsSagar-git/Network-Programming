import java.net.*;
public class NetEx
{
    public static void main(String[] args) {
        try
        {
            InetAddress add=InetAddress.getByName("www.google.com");
            System.out.println("Get Host Name:"+add.getHostName());
            System.out.println("Get Canonical Host Name:"+add.getCanonicalHostName());
            System.out.println("Get Address:"+add.getAddress());
            System.out.println("Get Host Address:"+add.getHostAddress());
        }
        catch(UnknownHostException ex)
        {
        System.out.println("Error:"+ex);
        }
    }
}