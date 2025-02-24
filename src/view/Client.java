
package view;

import controller.UserController;
import model.User;
import strategy.MySQLStorage;
import strategy.XMLStorage;

public class Client {
    public static void main(String[] args) {
        User user = new User("MCK", "123");
        MySQLStorage sqlStorage = new MySQLStorage();
        XMLStorage xmlStorage = new XMLStorage();

        UserController controller = new UserController(sqlStorage);
        controller.store(user);

        controller.setStorageMethod(xmlStorage);
        controller.store(user);

        controller.setStorageMethod(sqlStorage);
        controller.store(user);
    }
}
