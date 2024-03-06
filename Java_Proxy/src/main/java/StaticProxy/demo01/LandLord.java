package StaticProxy.demo01;

//房东
public class LandLord implements RentHouse{
    @Override
    public void rentHouse() {
        System.out.println("房东出租房子");
    }
}
