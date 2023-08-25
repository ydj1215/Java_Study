package 코코아톡;

public class CocoaTalk {
    private String to; // 상대방 이름
    private String massage; // 전달할 메시지

    public CocoaTalk(String name){
        to = name;
    }

    public void writeMassage(String massage){
        this.massage = to + " : " + massage;
    }

    public void send(NetAdapter na){
        na.send(massage);
    }
}
