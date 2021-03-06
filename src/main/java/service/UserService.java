package service;

import dao.UserDao;
import entity.User;

public class UserService {
    private UserDao usersDao = new UserDao();

    public UserService() {
    }
    public User findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }
}
