package TV기본예제;

public class TVSample {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.getInfoTV();

        TV tv1 = new TV(false, 44, 10);
        //tv1.getInfoTV();
        tv1.setOn(true);
        //tv1.getInfoTV();
        tv1.setChannel(56);
        //tv1.getInfoTV();
        tv1.setVolume(99);
        tv1.getInfoTV();
    }
}
