// Singleton pattern
public class App {
    public static void main(String[] args) throws Exception {
        // SingletonDemo obj = new SingletonDemo(); 에러

        SingletonDemo obj1 = SingletonDemo.getInstance();
        SingletonDemo obj2 = SingletonDemo.getInstance();

        if (obj1 == obj2) {
            System.out.println("레퍼런스가 동일합니다.");
        }

        if (obj1.equals(obj2)) {
            System.out.println("내용이 동일합니다.");
        }
    }
}
