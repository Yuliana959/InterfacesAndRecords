public record UserForm(String email, String password, int age) {
    public UserForm {
        if (email == null || email.isBlank())
            throw new IllegalArgumentException("Email must not be empty.");
        if (password == null || password.isBlank())
            throw new IllegalArgumentException("Password must not be empty.");
    }
}