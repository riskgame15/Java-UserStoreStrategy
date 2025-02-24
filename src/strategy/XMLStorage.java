
package strategy;

import model.User;

public class XMLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println("User is stored to XML file");
    }
}
