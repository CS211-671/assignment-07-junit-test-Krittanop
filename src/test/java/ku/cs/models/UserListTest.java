package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user1", "Helloworld123");
        userList.addUser("user2", "passwordsoeasy");
        userList.addUser("user3", "idkthepassword11");
        // TODO: find one of them
        User user = userList.findUserByUsername("user2");
        // TODO: assert that UserList found User
         String expected = "user2";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user1", "Helloworld123");
        userList.addUser("user2", "passwordsoeasy");
        userList.addUser("user3", "idkthepassword11");
        // TODO: change password of one user
        boolean actual = userList.changePassword("user1", "Helloworld123", "Hello111222333");
        // TODO: assert that user can change password
         assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user1", "Helloworld123");
        userList.addUser("user2", "passwordsoeasy");
        userList.addUser("user3", "idkthepassword11");
        // TODO: call login() with correct username and password
        User actual = userList.login("user3", "idkthepassword11");
        User expected = userList.findUserByUsername("user3");
        // TODO: assert that User object is found
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user1", "Helloworld123");
        userList.addUser("user2", "passwordsoeasy");
        userList.addUser("user3", "idkthepassword11");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("user3", "thisisnotthepassword");
        // TODO: assert that the method return null
         assertNull(actual);
    }

}