/*
Program to come up with CCFs for a loan given a particular payment schedule and beginning balance
variables for storing AMORTIZEDCOST, REMAININGTERM, PAYMENTAMOUNT, PAYMENTTYPE, NOTERATE

 */
import java.lang.String;
import java.time.Period;

public class ContractualCashFlows
{
    public static void main(String[] args)
    {
        double amortizedcost=15000,noterate=3,paymentamount=2500,begbalance=amortizedcost;
        int remterm=8, period=1;
        System.out.println("Period\tContractualPrincipal\tContractualInterest\tContractualEndingBalance");
        while(remterm>0 && begbalance>0)
        {
            System.out.println(period+"\t"+paymentamount+"\t"+(noterate*begbalance/100)+"\t"+(begbalance-paymentamount));
            remterm--;
            period++;
            begbalance-=paymentamount;
        }
    }
}
