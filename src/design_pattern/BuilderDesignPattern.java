package design_pattern;

public class BuilderDesignPattern {

    String name;
    String email;
    int age;

    private BuilderDesignPattern(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public static class Builder {
        String name;
        String email;
        int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public BuilderDesignPattern build() {
            return new BuilderDesignPattern(this);
        }
    }

    @Override
    public String toString() {
        return "[name: " + name + "! email:" + email + "! age:" + age + "]";
    }

    public static void main(String[] args) {

        BuilderDesignPattern builderDesignPattern = new Builder()
                .setName("Deepak")
                .setAge(25)
                .setEmail("test@gmail.com")
                .build();
        System.out.println(builderDesignPattern);
    }

}
