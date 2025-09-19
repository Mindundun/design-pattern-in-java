// Proxy pattern
interface Image {
    void display();    
}

// 실제 객체
class RealImage implements Image {
    private String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    public void loadFromDisk(String filename) {
        this.filename = filename;
        System.out.println("Loading " + filename + " from disk");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }    
}

// Proxy 객체
class ProxyImage implements Image {
    // field
    private RealImage realImage;
    private String filename;

    // constructor method
    public ProxyImage(String filename) {
        this.filename = filename;
    }


    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();        
    }    
}

public class ProxyDemo {
    public static void main(String[] args) {
        Image obj1 = new ProxyImage("photo1.jpg");
        obj1.display();
        // Loading photo1.jpg from disk
        // Displaying photo1.jpg

        obj1.display();
        // Displaying photo1.jpg
    }
}
