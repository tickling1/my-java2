package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(920);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.volumeUp();
        speaker.showVolume();


        // 필드에 직접 접근해서 수정
        System.out.println("volume 필드 접근 수정");
        //speaker.volume = 200;
        speaker.showVolume();
    }
}
