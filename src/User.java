// Builder pattern
public class User {
    // instance field
    private final String id;
    private final String name;
    private final String email;
    private final String phone;
    private final int age;
    
    // constructor method
    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age + "]";
    }

    // 아래 코드로 인해 App1.java에서 new 없이 사용 가능
    public static Builder Builder() {
        return new Builder();
    }

    // static inner class : Nested class
    public static class Builder {

        // instance field
        private String id;
        private String name;
        private String email;
        private String phone;
        private int age;

        public Builder() {

        }
        
        // 객체가 자기 자신을 리턴하는 메서드 -> 메서드 체이닝(method chaining)
        public Builder id(String id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
        
    }
}
