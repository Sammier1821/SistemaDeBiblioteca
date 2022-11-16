package data;

public class Date {
  private int year;
  private int month;
  private int day;
  
  public Date() {
    year = 1000;
    month = 1;
    day = 1;
  }

  public Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public void setYear(int year) {
    if (year > 999)
      this.year = year;
    else
      System.out.println("Year not set");
  }

  public void setMonth(int month) {
    if (month >= 1 && month <= 12)
      this.month = month;
    else
      System.out.println("Month not set");
  }

  public void setDay(int day) {
    switch (month) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        if (day >= 1 && day <= 31)
          this.day = day;
        else
          System.out.println("Day not set");
        break;
      case 2:
        if (isLeapYear())
          if (day >= 1 && day <= 29)
            this.day = day;
          else
            System.out.println("Day not set");
        else
          if (day >= 1 && day <= 28)
            this.day = day;
          else
            System.out.println("Day not set");
        break;
      case 4: case 6: case 9: case 11:
        if (day >= 1 && day <= 30)
          this.day = day;
        else
          System.out.println("Day not set");
        break;
    }
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }
  
  public int getDay() {
    return day;
  }
  
  public boolean isLeapYear() {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
  }

  @Override
  public String toString() {
    return (getDay()>9?getDay():"0"+getDay()) + "/" + (getMonth()>9?getMonth():"0"+getMonth()) + "/" + getYear();
  }
}
