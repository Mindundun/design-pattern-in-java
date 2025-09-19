// Singleton pattern
public class SingletonDemo {
    // singleton 패턴에 대한 예제
    // 싱글톤은 Application당 인스턴스 하나이며, Application 실행과 종료 시 라이프사이클이 동일
    // => 그래서 static으로 예제 작성

    // static은 Method Area에 할당
    // 클래스 로딩 시 instance를 null로 초기화 및 할당 함
    private static volatile SingletonDemo instance;

    // 생성자 메소드
    private SingletonDemo() {}

    public static SingletonDemo getInstance() {
        // 한번에 하나의 스레드 접근
        if (instance == null) {
            synchronized(SingletonDemo.class) { // 동기화 : 멀티스레드 환경에서 synchronized가 필요
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }

        return instance;
    }
}
