package poly.ex;

public class SendMain {

    public static void main(String[] args) {

        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("사랑합니다!");
        }
    }
}
