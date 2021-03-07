package repository;

import java.util.List;

public interface UserRepository {

    User findById(Long id);
    List<User> findUsersWhoseNameStartWith(String startOfName);
    List<User> listAllUsers();

}
