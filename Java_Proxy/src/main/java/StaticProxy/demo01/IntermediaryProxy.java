package StaticProxy.demo01;

public class IntermediaryProxy implements RentHouse{
    private LandLord landLord;

    public IntermediaryProxy() {
    }

    public IntermediaryProxy(LandLord landLord) {
        this.landLord = landLord;
    }

    @Override
    public void rentHouse() {
        visitHouse();
        landLord.rentHouse();
        signContract();
        collectIntermediaryFee();
    }

    //看房
    public void visitHouse(){
        System.out.println("visitHouse");
    }

    //收中介费
    public void collectIntermediaryFee(){
        System.out.println("collectIntermediaryFee");
    }

    //签租房合同
    public void signContract(){
        System.out.println("signContract");
    }
}
