package DynamicProxy.demo01;

public class Client {
    public static void main(String[] args) {
        //真实角色
        LandLord landLord = new LandLord();

        //代理角色，无
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用程序处理角色来处理接口对象
        pih.setRentHouse(landLord);

        RentHouse proxy = (RentHouse) pih.getProxy();
        proxy.rentHouse();
    }
}
