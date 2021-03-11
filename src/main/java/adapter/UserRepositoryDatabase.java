package adapter;

public class UserRepositoryDatabase implements UserRepository {
    private final Database db;

    public UserRepositoryDatabase(Database db) {
        this.db = db;
    }

    @Override
    public User findUserById(String userId) {
        SqlQuery userQuery =
                new SqlQuery("SELECT * FROM Users WHERE id=" + userId);

        Rows rows = db.executeQuery(userQuery);
        User user = new User(userId, rows.getColumn("dateOfBirth"));

        return user;
    }
}
