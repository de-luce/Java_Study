package StaticProxy.demo01;

public class Client {
    public static void main(String[] args) {
        //房东出租房子
        LandLord landLord = new LandLord();
        //代理，中介帮出租
        IntermediaryProxy proxy = new IntermediaryProxy(landLord);
        proxy.rentHouse();
    }
}
