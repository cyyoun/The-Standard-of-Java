package Network;

import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient {
    public static void main(String[] args){
        try{
            String serverIp = "127.0.0.1";

            System.out.println("서버에 연결중... 서버 ip : "+serverIp);
            //소켓을 생성하여 연결을 요청
            Socket socket = new Socket(serverIp, 7777);

            //소켓의 입력스트림을 얻는다
            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            System.out.println("서버로부터 받은 메시지 : " + dis.readUTF());
            System.out.println("연결을 종료합니다....");

            dis.close();
            socket.close();
            System.out.println("연결이 종료되었습니다.");

        }catch (ConnectException ce){
            ce.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
