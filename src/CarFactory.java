// Factory pattern
public class CarFactory {
    public static Car createCar() {
        Tire tire = new HanKookTire();
        
        //Speaker speaker = new JBLSpeaker(); 
        Speaker speaker = new BossSpeaker(); 

        return new Car(speaker, tire);
    }
}
