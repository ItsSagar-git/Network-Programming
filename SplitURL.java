import java.net.MalformedURLException;
import java.net.URL;

public class SplitURL {
    public static void main(String[] args) throws MalformedURLException {
        URL u=new URL("http://www.google.com");
        System.out.println("Protocol="+u.getProtocol());
        System.out.println("Host="+u.getHost());
        System.out.println("Port="+u.getPort());
        System.out.println("Query="+u.getQuery());
    }
}
