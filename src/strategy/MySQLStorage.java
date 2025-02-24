
package strategy;

import model.User;

public class MySQLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println("User is stored to MySQL database.");
    }
}
