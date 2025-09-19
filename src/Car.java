// Factory pattern
public class Car {
    
    // field
    //private Speaker speaker = new JBLSpeaker(); // 타 스피커로 변경이 필요 시 코드를 변경해야함. -> 결합도 높음

    private Speaker speaker;
    private Tire tire;

    public Car(Speaker speaker, Tire tire) {
        this.speaker = speaker;
        this.tire = tire;
    }

    public void start() {
        speaker.playMusic();
        tire.inflate();
    }
    
}
