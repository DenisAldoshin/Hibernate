package jm.task.core.jdbc;



import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.dropUsersTable();
        userService.saveUser("Pavel", "Pavlovich", (byte) 56);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
    }
}
