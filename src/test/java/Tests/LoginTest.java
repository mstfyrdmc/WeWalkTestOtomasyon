package Tests;

import Model.BaseModel;
import Model.LoginModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;


public class LoginTest {
    LoginModel loginModel;

    public LoginTest() {
        this.loginModel = new LoginModel();
    }

    @Step("Login Ekraninda Logo,Giris butonu ve Kayit ol butonu oldugu gorulur")
    public void DisplayLogo() {
        Assert.assertTrue("Ekranda Logo bulunamadi.", loginModel.isImageDisplayed());
        Assert.assertTrue("Ekranda Giris butonu bulunamadi.", loginModel.isLoginButtonDisplayed());
        Assert.assertTrue("Ekranda Kayit ol bulunamadi.", loginModel.isRegisterButtonDisplayed());
    }

    @Step("Login Butonuna tiklanir")
    public void ClickLoginButton(){
        loginModel.ClickLoginButton();
    }

    @Step("login Sayfasinin acildigi gorulur")
    public void IsLoginPageOpen(){
        Assert.assertTrue("Oturum acma sayfasi acilmadi",loginModel.isEmailTextBoxDisplayed());
    }

    @Step("Register Butonuna tiklanir")
    public void ClickRegisterButton(){
        loginModel.ClickRegisterButton();
    }

    @Step("Register Sayfasinin acildigi gorulur")
    public void IsRegisterPageOpen(){
        Assert.assertTrue("Kayit ol sayfasi acilmadi",loginModel.isUserNameTextBoxDisplayed());
    }

    @Step("Register sayfasinde Usurname,Email,Password alanlari ve RegisterNow butonun yer aldigi gorulur")
    public void IsRegisterPageElementExist(){
        Assert.assertTrue("Register ekranında sifre alani yer almiyor",loginModel.isRegisterPagePasswordAreaExist());
        Assert.assertTrue("Register ekranında kullanici adi alani yer almiyor",loginModel.isRegisterPageUserNameAreaExist());
        Assert.assertTrue("Register ekranında email alani yer almiyor",loginModel.isRegisterPageEmailAreaExist());
        Assert.assertTrue("Register ekranında kayit ol butonu yer almiyor",loginModel.isRegisterNowButtonExist());
    }

    @Step("Oturum Acma Sayfasinde Logo-Email-Password-Login Butonu - Login FB ve Sifremi Unuttum Alanlari Gorulur")
    public void IsLoginPageElementsPresent(){
        Assert.assertTrue("Ekranda Logo bulunamadi.", loginModel.isImageDisplayed());
        Assert.assertTrue("Ekranda Giris butonu bulunamadi.", loginModel.isLoginButtonDisplayed());
        Assert.assertTrue("Ekranda Email Alani bulunamadi",loginModel.isEmailTextBoxDisplayed());
        Assert.assertTrue("Ekranda Password Alani bulunamadi",loginModel.isPasswordTextBoxDisplayed());
        Assert.assertTrue("Ekranda Login butonu bulunamadi.", loginModel.isLoginButtonDisplayed());
        Assert.assertTrue("Ekranda Forgot Password butonu bulunamadi.", loginModel.isForgotPasswordDisplayed());
        Assert.assertTrue("Ekranda Login With Facebook butonu bulunamadi.", loginModel.isLoginWFaceBookButtonDisplayed());
    }

    @Step("Kullanıcı adı alanına <key> yazılır")
    public void setUserNameRegister(String userName){
        loginModel.SetUserNameForRegisterPage(userName);
    }

    @Step("Email alanına <key> yazılır")
    public void setEmailRegister(String email){
        loginModel.SetUserEmailForRegisterPage(email);
    }

    @Step("Password alanına <key> yazılır")
    public void SetPasswordRegister(String userName){
        loginModel.SetUserPasswordForRegisterPage(userName);
    }

    @Step("Passwordun 5 karakterden uzun oldugu kontrol edilir")
    public void CheckPasswordLenght(){
        Assert.assertTrue("Sifre 5 karakterden kisadir",loginModel.IsPasswordLengthBiggerThanFive());
    }

    @Step("Kayit ol sayfasinda Register Now butonuna tiklanir")
    public void ClickRegisterNowButtonFromRegisterPage(){
        loginModel.ClickRegisterNowButton();
    }

    @Step("Kayit sonrasi çikan OK butonuna tiklanir")
    public void ClickOkButtonRegisterPage(){
        loginModel.ClickOKRegisterPage();
    }

    @Step("Basarili register mesajı gorulur")
    public void CheckSuccessfulRegisterMessage(){
        Assert.assertEquals("Register basarisiz oldu","You have successfuly signup",loginModel.GetTextSuccessfulRegister());
    }

    @Step("Kullanici adi ve sifrenin farkli oldugu gorulur")
    public void CheckUserNameAndPasswordShouldBeDiffrent(){
        Assert.assertTrue("Kullanici adi ve sifre ayni",loginModel.IsUserNameAndPasswordDiffrent());
    }

    @Step("Kullanici adi ve sifrenin ayni olmasi durumunda hata mesaji verdigi gorulur")
    public void CheckUserNameAndPasswordAreSame(){
        Assert.assertFalse(loginModel.isErrorMessageExistForSameUserNameAndPassword());
    }


    @Step("Forgot Password e tiklanir")
    public void ClickForgotPassword(){
        loginModel.ClickForgotPasswordButton();
    }

    @Step("Sifreniz Email adresinize gonderilmistir mesaji geldigi gorulur")
    public void CheckForgotPasswordMessage(){
        Assert.assertEquals("Sifreniz email adresinize gonderilmistir mesaji gelmedi","Your password has been sent to your phone number.",loginModel.GetTextByForgotPasswordMessage());
    }

    @Step("Passwordun 5 karakterden az girildiginde hata mesajı verdigi gorulur")
    public void CheckInccoretPasswordLength(){
        Assert.assertTrue(loginModel.isErrorMessageExist());
    }
}
