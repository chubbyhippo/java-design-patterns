package cache;

public interface UserRepository {
    User findUserById(String userId);
}
