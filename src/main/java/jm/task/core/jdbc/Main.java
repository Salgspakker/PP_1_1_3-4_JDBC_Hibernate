package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;


public class Main {

    public static void main(String[] args) {
        Session session = Util.getSessionFactory().getCurrentSession();
        User u2 = new User("name1", "surname1", (byte) 22);
        session.beginTransaction();
        session.save(u2);
        session.getTransaction().commit();

//        UserServiceImpl userService = new UserServiceImpl();
//       userService.createUsersTable();
//        User userIn1 = new User("Anton", "Avdeev", (byte) 20);
//        User userIn2 = new User("Boris", "Beloguy", (byte) 21);
//        User userIn3 = new User("Clark", "Coral", (byte) 22);
//        User userIn4 = new User("Denis", "Denim", (byte) 23);
//
//        userService.saveUser(userIn1.getName(), userIn1.getLastName(), userIn1.getAge());
//        userService.saveUser(userIn2.getName(), userIn2.getLastName(), userIn2.getAge());
//        userService.saveUser(userIn3.getName(), userIn3.getLastName(), userIn3.getAge());
//        userService.saveUser(userIn4.getName(), userIn4.getLastName(), userIn4.getAge());
//
//        List<User> listUsers = userService.getAllUsers();
//        listUsers.forEach(System.out::println);
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
    }
}
