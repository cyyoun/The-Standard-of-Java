package Network;


import java.net.URL;
import java.net.URLConnection;

public class NetworkEx2 {
    public static void main(String[] args) throws Exception {

        URL url = null;
        String address = "http://www.codechobo.com:80/sample/hello.html?referer=codechobo#index1";

        try{
            url = new URL(address);
            URLConnection conn = url.openConnection();

            System.out.println("conn : "+conn);
            System.out.println("getAllowUserInteraction() : "+conn.getAllowUserInteraction());
            System.out.println("getConnectTimeout() : "+conn.getConnectTimeout());
            System.out.println("getContent() : "+conn.getContent());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
