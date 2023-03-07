import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMIPage {
    @FindBy(id = Setup.PACKAGE_ID + ":id/btnStart")
    AndroidElement btnStart;

    @FindBy(id = Setup.PACKAGE_ID + ":id/etLoanAmount")
    AndroidElement txtLoanAmount;

    @FindBy(id = Setup.PACKAGE_ID + ":id/etInterest")
    AndroidElement txtInterest;

    @FindBy(id = Setup.PACKAGE_ID + "id/etYears")
    AndroidElement txtYear;

    @FindBy(id = Setup.PACKAGE_ID + ":id/etMonths")
    AndroidElement txtMonth;

    @FindBy(id = Setup.PACKAGE_ID + ":id/etEMI")
    AndroidElement txtEmi;


    @FindBy(id = Setup.PACKAGE_ID + ":id/etFee")
    AndroidElement txtProcessingFee;

    @FindBy(id = Setup.PACKAGE_ID + ":id/btnCalculate")
    AndroidElement btnCalculate;

    @FindBy(id = Setup.PACKAGE_ID + ":id/rbPeriod")
    AndroidElement btnPeriod;

    @FindBy(id = Setup.PACKAGE_ID + ":id/monthly_emi_result")
    AndroidElement txtEMIMonthlyAmountResult;

    @FindBy(id = Setup.PACKAGE_ID + ":id/total_interest_result")
    AndroidElement txtTotalInterestResult;

    @FindBy(id = Setup.PACKAGE_ID + ":id/processing_fee_result")
    AndroidElement getTxtProcessingFeeResult;

    @FindBy(id = Setup.PACKAGE_ID + ":id/total_payment_result")
    AndroidElement txtTotalPaymentResult;

    @FindBy(id = "com.continuum.emi.calculator:id/btnReset")
    AndroidElement btnReset;

    @FindBy(id = Setup.PACKAGE_ID + ":id/btnDetail")
    AndroidElement btnDetail;


    public EMIPage(AndroidDriver driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void calculateEMI(int loanAmount, double interest, int EMI, double processingFee){
        txtLoanAmount.sendKeys(""+loanAmount+"");
        txtInterest.sendKeys(""+interest+"");
        btnPeriod.click();
        txtEmi.sendKeys(""+EMI+"");
        txtProcessingFee.sendKeys(""+processingFee+"");
        btnCalculate.click();
    }
}
