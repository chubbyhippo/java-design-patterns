package cache;

import java.util.HashMap;
import java.util.Map;

public class UserCache implements UserRepository{
    private final Map<String, User> cache = new HashMap<>();
    private final UserRepository repository;

    public UserCache(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User findUserById(String userId) {
        if (cache.containsKey(userId)) {
            return cache.get(userId);
        }

        User user = repository.findUserById(userId);
        cache.put(userId, user);
        return user;
    }
}
