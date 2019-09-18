package pub;

import model.User;

import java.util.List;

/**
 * @ClassName OrderService
 * @Description
 * @Author ZJC
 * @Date 2019/9/16 13:22
 */
public interface OrderService {
    List<User> initOrder(String userName);
}
