import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EMITestRunner extends Setup {
    @BeforeTest
    public void startEMICalc(){
        EMIPage emiPage = new EMIPage(driver);
        emiPage.btnStart.click();
    }
    @Test(dataProvider = "data-provider", dataProviderClass = DataSet.class)
    public void calculateEMI(int loanAmount, double interest,int EMI, double processingFee, double monthlyEMI, double totalInterest,int processingFeeTotal, double totalPayment ,int year,int month){
        EMIPage emiPage = new EMIPage(driver);
        emiPage.calculateEMI(loanAmount,interest,EMI ,processingFee);

        double monthlyEMIActual = Double.parseDouble(emiPage.txtEMIMonthlyAmountResult.getText().replace(",",""));
        double totalInterestActual = Double.parseDouble(emiPage.txtTotalInterestResult.getText().replace(",",""));
        double totalProcessingFeeActual = Double.parseDouble(emiPage.getTxtProcessingFeeResult.getText().replace(",",""));
        double totalPaymentActual = Double.parseDouble(emiPage.txtTotalPaymentResult.getText().replace(",",""));


        Assert.assertEquals(monthlyEMIActual,monthlyEMI);
        Assert.assertEquals(totalInterestActual,totalInterest);
        Assert.assertEquals(totalProcessingFeeActual,processingFeeTotal);
        Assert.assertEquals(totalPaymentActual,totalPayment);

        emiPage.btnReset.click();

    }

}
