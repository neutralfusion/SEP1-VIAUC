package Model;

public class Date
{
  private int day;
  private int month;
  private int year;
  public Date()
  {
  }

  public void SetDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;

    if (year < 0)
    {
      this.year = year *-1;
    }
    if (month < 1)
    {
      this.month = 1;

    }
    if (month > 12)
    {
      this.month = 12;
    }
    if (day < 1)
    {
      this.day = 1;
    }
  }

  public Date(int day, int month, int year)
  {
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public String getMonthName()
  {
    switch (month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "Octomber";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Write a month between 1-12";

    }
  }

  public Boolean isLeapYear()
  {
    if (year % 4 == 0 && (year % 100 != 0) || (year % 400 == 0))
    {
      return true;
    }
    else
    {
      return false;
    }
  }



  public int numberOfDaysInMonth()
  {
    if (month == 4 || month == 6 || month == 9 || month == 11)
    {
      return 30;
    }

    else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        || month == 10 || month == 12)
    {
      return 31;
    }
    else if (isLeapYear() == true && (month == 2))
    {
      return 29;
    }
    else if (isLeapYear() == false && (month == 2))
    {
      return 28;
    }
    else
      return -1;
  }
  public int yearsBetween(Date date2){
    if(this.year > date2.year && (this.month > date2.month)){
      System.out.println(" " + (this.year - date2.year));
    } if (this.year > date2.year && (this.month == date2.month && (this.day > date2.day))){
      System.out.println(" " +(this.year - date2.year));
    }
    if (this.year > date2.year && (this.month == date2.month && (this.day == date2.day))){
      System.out.println(" " + (this.year - date2.year));
    }
    if (this.year > date2.year && (this.month == date2.month && (this.day < date2.day))){
      System.out.println(" "+((this.year-date2.year)-1));
    }
    if (this.year > date2.year && (this.month < date2.month)){
      System.out.println(" "+(this.year - date2.year));
    }
    return 0;
    //this.day , this.month , this.year, =date1
    //date2.day , day2.month , day2.year = date2
  }

  public String toString()
  {
    return getDay() + "/" + getMonth() + "/" + getYear();
  }
}

