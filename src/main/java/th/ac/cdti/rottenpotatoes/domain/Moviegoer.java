package th.ac.cdti.rottenpotatoes.domain;

public record Moviegoer(String name, String email) {
    public Moviegoer {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("email must contain @");
        }
    }
}