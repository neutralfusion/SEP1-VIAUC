package Model;
/**
 * A class containing a list of Student objects. * @author Allan Henriksen
 * @version 1.0
 */
public class Customer
{
  private long phoneNumber;
  private int birthday;
  private String address;
  private String name;
  private Email email;

  public Customer(String name, int birthday, long phoneNumber, String adress, Email email)
  {
    this.name = name;
    this.birthday = birthday;
    this.phoneNumber = phoneNumber;
    this.address = adress;
    this.email = email;
  }

/**
        * A class containing a list of Student objects. * @author Allan Henriksen
 * @version 1.0
        */
  public long getPhoneNumber()
  {
    return phoneNumber;
  }

  public void setPhoneNumber(long phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  public int getBirthday()
  {
    return birthday;
  }

  public void setBirthday(int birthday)
  {
    this.birthday = birthday;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setEmail(String emailAdress)
  {
    Email Email = new Email(emailAdress);
    email = Email;
  }

  public Email getEmail()
  {
    return email;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

}
