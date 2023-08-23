package 아이패드만들기;

public class IpadMain {
    public static void main(String[] args) {
        while (true) {
            IpadPro ipadPro = new IpadPro("iPand Pro");
            if(!ipadPro.continueOrder()) break;
            ipadPro.setScreen();
            ipadPro.setColor();
            ipadPro.setMemory();
            ipadPro.setNetwork();
            ipadPro.setName();
            ipadPro.setSerialNum();
            ipadPro.progressPad();
            ipadPro.prductPad();
        }
    }
}
