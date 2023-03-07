# EMI-Calculator App Automated Testing
This project automates the emi calculator application and performs various tests to calculate the time period it will take to complete a loan based on the loan amount, interest rate, monthly EMI, and processing fee.

## Requirements:
To run the automated tests, you will need the following software installed:
- IDE
- Appium Inspector
- Android SDK
- Java Development Kit (JDK)
- Gradle

## Steps to run the tests:

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE.
3. Update the DEVICE_NAME and PLATFORM_VERSION in the Setup.java file to match your emulator or device configuration.
4. Run the tests using the test runner in the IDE or by running the command gradle clean test in the terminal.

## Test scenarios:
The following scenarios are tested in this automation:

1. User borrows a certain amount from a bank with a given interest rate and a processing fee.
2. User wants to pay back the loan with a fixed amount of monthly EMI.
3. Calculate the time period required to complete the loan.
4. Assert the monthly EMI, total interest, processing fee amount, and total payment from the result view with the values given in the dataset.

## Dataset:
   
Amount | Interest | EMI | Processing Fee | Monthly EMI | Total Interest | Processing Fee | Total Payment | Period (Year) | Period (Month)
     
     100000 | 6 | 2000 | 2% | 2000 | 15361.08 | 2000 | 115361.08 | 4 | 10
     200000 | 8 | 5000 | 2% | 5000 | 33391.61 | 4000 | 233391.61 | 3 | 11
     250000 | 7 | 8000 | 1.5% | 8000 | 26804.51 | 3750 | 276804.51 | 2 | 11
     50000 | 10 | 1000 | 5% | 1000 | 14949.12 | 2500 | 64949.12 | 5 | 5
   
## Test Reports:
### HTML Report:
The HTML report provides a summary of the test results and includes a list of passed and failed test cases.

For generating HTML report hit this commmand: ```gradle clean test```

![Html](https://user-images.githubusercontent.com/52671754/223355516-70ea7790-8f09-473a-86d7-2bd81a59e6a5.png)


### Allure Report: 
The Allure report provides detailed information about each test case and includes screenshots and logs for each step. 

For generating Allure report hit the command:
 ```
allure generate allure-results --clean -o allure-report
allure serve allure-results
```

![allu1](https://user-images.githubusercontent.com/52671754/223355654-2b2b983d-78d9-446c-9b6d-c489d59764d3.png)
![allu2](https://user-images.githubusercontent.com/52671754/223355668-f5066c6d-b686-423e-b917-82f4d2cf7add.png)

## Conclusion:
This project aimed to automate the Loan Calculator app using Appium, Android Studio, and IDE. The test cases are executed on the given dataset, and the test results are captured in the Allure and HTML reports. The reports provide detailed test execution results, including the test case status, steps, and screenshots.






