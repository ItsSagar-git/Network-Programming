import java.net.*;
public class EqualIPEx {
    public static void main(String[] args) {
        try
        {
            InetAddress ads1=InetAddress.getByName("www.google.com");
            InetAddress ads2=InetAddress.getByName("www.google.com");
            if(ads1.equals(ads2))
            System.out.println("Equal");
            else
            System.out.println("Not Else");
        }
        catch(UnknownHostException ex)
    {
        System.out.println("Error:"+ex);
    }
}
}
