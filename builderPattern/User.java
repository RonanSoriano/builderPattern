package builderPattern;

public class User {
        protected final String firstName;
        protected final String lastName;
        protected final String email;
        protected final String address;
        protected final String phone;
        protected final Integer age;

        private User(UserBuilder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.email = builder.email;
            this.address = builder.address;
            this.phone = builder.phone;
            this.age = builder.age;
        }

        protected static class UserBuilder {
            private final String firstName;
            private final String lastName;
            private String email;
            private String address;
            private final String phone;
            private final Integer age;


            /* for required question. */
            public UserBuilder(String firstName, String lastName, String phone, Integer age) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.phone = phone;
                this.age = age;
            }

            /* for optional question. */
            public UserBuilder email(String email) {
                this.email = email;
                return this;
            }

            /* for optional question. */
            public UserBuilder address(String address) {
                this.address = address;
                return this;
            }

            public User build() {
                return new User(this);
            }
        }
    }