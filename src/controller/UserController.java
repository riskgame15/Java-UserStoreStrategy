
package controller;

import model.User;
import strategy.UserStorage;

public class UserController {
    UserStorage userStorage;

    public UserController(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public void setStorageMethod(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public void store(User user) {
        userStorage.store(user);
    }
}
