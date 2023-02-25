package Network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkEx1 {
    public static void main(String[] args){
        InetAddress ip =null;

//try catch 형태로 사용 가능
        try{
            ip = InetAddress.getByName("www.naver.com");
            System.out.println("get Host Name : "+ip.getHostName()); // 223.130.200.104
            System.out.println("get Host Address : "+ ip.getHostAddress());

            byte[] ipAddr = ip.getAddress();
            System.out.println("getAddress() : "+ Arrays.toString(ipAddr));

        }catch (UnknownHostException e){
            e.printStackTrace();
        }

        try{
            ip = InetAddress.getLocalHost();
            System.out.println("getHostName() : "+ip.getHostName());
            System.out.println("getHostAddress() : "+ip.getHostAddress());
        }catch (UnknownHostException e){
            e.printStackTrace();
        }

    }
}
