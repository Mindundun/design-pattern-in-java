// Builder pattern
public class App1 {
    public static void main(String[] args) {
        // 매개변수를 전달하여 매개변수 있는 생성자 생성 시 해당 매개변수의 순서 실수가 존재할 수 있는데,
        // 이 실수를 줄이기 위해 Builder 패턴 사용
        // User user1 = new User(); 

        // .으로 메소드 체이닝 : 메소드를 계속 연결해서 사용하는 것
        User user1 = User.Builder()         // new 없이 사용할 수 있는 이유 : User.java - public static Builder Builder()
                        .id("java")
                        .name("박민둔")
                        .email("getJava@naver.com")
                        .age(20)
                        .phone("01012345678")
                        .build(); // build() 시 User 객체 반환

        System.out.println(user1);
        // User [id=java, name=박민둔, email=getJava@naver.com, phone=01012345678, age=20]
    }
}
