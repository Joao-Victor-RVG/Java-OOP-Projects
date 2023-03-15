public class CurrencyConverter {


    public double dollarPrice;

    public double boughtDollar;

    public void setDollarPrice (double dollarPrice){
        this.dollarPrice = dollarPrice;
    }
    public void setBoughtDollar (double boughtDollar){
        this.boughtDollar = boughtDollar;
    }


    public double calculator(){
        double cal = (dollarPrice * boughtDollar);
        return cal * 0.06 + cal;
    }





}
