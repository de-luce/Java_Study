package StaticProxy.demo02;

import lombok.Data;

@Data
public class UserServiceProxy implements UserService {
    private UserService userService;

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void select() {
        log("select");
        userService.select();
    }

    //日志方法
    public void log(String msg) {
        System.out.println("log: " + msg);
    }
}