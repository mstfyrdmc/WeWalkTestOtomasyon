package Model;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import static driver.DriverFactory.getDriver;

public class LoginModel extends Model.BaseModel {
    public By imgLogo = By.xpath("//android.view.View[@content-desc=\'WeWALK Test Case\']");
    public By btnLogin = By.xpath("//android.view.View[@content-desc=\'Login\']");
    public By btnRegister = By.xpath("//android.view.View[@content-desc=\'This is an incorrect Accessibility Test\']");
    public By txtEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    public By txtUserName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    public By txtPassword = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    public By txtForgotPassword = By.xpath("//android.widget.Button[@content-desc=\'Forgot Password ?\']");
    public By btnLoginFaceBook = By.xpath("//android.view.View[@content-desc=\'Log in with Facebook\']");
    public By txtEmailRegister = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    public By txtPasswordRegister=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");
    public By txtUserNameRegister=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    public By btnRegisterNowButton=By.xpath("//android.view.View[@content-desc=\'Register Now\']");
    public By btnOkeyRegisterPage =By.xpath("//android.widget.Button[@content-desc=\'OK\']");
    public By txtSuccessfulRegisterMessage =By.xpath("//android.view.View[@content-desc=\'You have successfully signup\']");
    public By txtForgotPasswordMessage=By.xpath("//android.view.View[@content-desc=\'Your password has been sent to your phone number.\']");
    public By lblErrorMessage = By.xpath("//android.view.View[@content-desc=\'Error #9\']");


    public boolean  isImageDisplayed(){
        return isElementDisplayed(imgLogo);
    }

    public boolean  isLoginButtonDisplayed(){
        return isElementDisplayed(btnLogin);
    }

    public boolean  isRegisterButtonDisplayed(){
        return isElementDisplayed(btnRegister);
    }

    public boolean isEmailTextBoxDisplayed(){ return isElementDisplayed(txtEmail);}
    public boolean isUserNameTextBoxDisplayed(){ return isElementDisplayed(txtUserName);}
    public boolean isPasswordTextBoxDisplayed(){ return isElementDisplayed(txtPassword);}
    public boolean isForgotPasswordDisplayed(){ return isElementDisplayed(txtForgotPassword);}
    public boolean isLoginWFaceBookButtonDisplayed(){ return isElementDisplayed(btnLoginFaceBook);}

    public  void ClickLoginButton(){
        clickElement(btnLogin);
    }

    public  void ClickRegisterButton(){
        clickElement(btnRegister);
    }

    public void ClickRegisterNowButton(){
        clickElement(btnRegisterNowButton);
    }

    public void ClickOKRegisterPage(){
        clickElement(btnOkeyRegisterPage);
    }

    public String GetTextSuccessfulRegister(){
        return getElementValue(txtSuccessfulRegisterMessage,"content-desc");
    }

    public boolean IsPasswordLengthBiggerThanFive(){
        return  txtPasswordRegister.toString().length()>4;
    }
    public void ClickForgotPasswordButton(){
        clickElement(txtForgotPassword);
    }

    public String GetTextByForgotPasswordMessage(){
        return getElementValue(txtForgotPasswordMessage,"content-desc");
    }
    public void SetUserNameForRegisterPage(String userName){

        SendKeys(txtUserNameRegister,userName);

    }
    public void SetUserEmailForRegisterPage(String email){

        SendKeys(txtEmailRegister,email);

    }

    public void SetUserPasswordForRegisterPage(String password){

        SendKeys(txtPasswordRegister,password);
    }

    public boolean IsUserNameAndPasswordDiffrent(){
        if (txtUserNameRegister.equals(txtPasswordRegister)){
            return false;
        }
        return true;
    }

    public boolean isRegisterPageUserNameAreaExist(){
        return isElementDisplayed(txtUserNameRegister);
    }

    public boolean isRegisterPageEmailAreaExist(){
        return isElementDisplayed(txtEmailRegister);
    }

    public boolean isRegisterPagePasswordAreaExist(){
        return isElementDisplayed(txtPasswordRegister);
    }

    public boolean isRegisterNowButtonExist(){
        return isElementDisplayed(btnRegisterNowButton);
    }

    public boolean isErrorMessageExist(){
        if(IsPasswordLengthBiggerThanFive()){
            return true ;
        }
        else{
            return false;
        }
    }

    public boolean isErrorMessageExistForSameUserNameAndPassword(){
        if((IsUserNameAndPasswordDiffrent())){
            return false ;
        }
        else{
            return true;
        }
    }
}
