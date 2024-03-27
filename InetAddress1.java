import java.net.*;

public class InetAddress1 {
    public static void main(String[] args) throws Exception {
        InetAddress[] inetAddresses = InetAddress.getAllByName("ncit.com");
        for (InetAddress inetAddress : inetAddresses) {
            System.out.println(inetAddress.getHostAddress());
        }
    }
}
