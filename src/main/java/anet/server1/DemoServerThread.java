package anet.server1;

import java.net.Socket;

public class DemoServerThread extends Thread {
    DemoServer ds = null;
    //서버스레드에서도 24시간 무중단 서비스를 제공함
    private volatile boolean isRun = true;
    Socket client = null;

    public DemoServerThread(DemoServer ds) {
        this.ds = ds;
    }
    @Override
    public void run(){

    }
    public void closeThread(){
        isRun = false;
        interrupt();//대기중인 스레드를 깨우는 메서드
        try {
            if(client != null &&  !client.isClosed()){
                client.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}