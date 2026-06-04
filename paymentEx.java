interface payment{
    void phonepay();
    void googlepay();
    void paytm();
}
class pay implements payment{
    @Override
    public void phonepay(){
        System.out.println("payment done by phonepay");
    }
    @Override
    public void googlepay(){
        System.out.println("payment done by googlepay");
    }
    @Override
    public void paytm(){
        System.out.println("payment made by paytm");
    }
}

public class paymentEx {
    public static void main(String args[]){
        pay p = new pay();
        p.phonepay();
        p.googlepay();
        p.paytm();
    }
}
