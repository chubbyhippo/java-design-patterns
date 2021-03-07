package decorator;

public class UserCache implements UserRepository {
    private final UserRepository repository;

    public UserCache(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User findUserById(String userId) {

        // extra functionality goes here
        User user = repository.findUserById(userId);
        // extra functionality goes here

        return user;
    }
}
