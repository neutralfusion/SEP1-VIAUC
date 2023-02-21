package Model;

public class Email
{
  private String  emailAdress;
  public Email(String emailAdress){
    if (emailAdress.contains("@" )){
      this.emailAdress = emailAdress;
    }
   this.emailAdress = null;//Tell user its invalid
  }

  public void setEmailAdress(String emailAdress)
  {
    this.emailAdress = emailAdress;
  }

  public String getEmailAdress(){
    return emailAdress;
  }
}
