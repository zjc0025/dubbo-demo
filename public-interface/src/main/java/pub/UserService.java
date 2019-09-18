package pub;

import model.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description
 * @Author ZJC
 * @Date 2019/9/16 13:22
 */
public interface UserService {
    List<User> getUserInfo(String userName);

    void sayHello();
}
