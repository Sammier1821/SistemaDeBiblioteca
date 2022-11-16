package data;

import static java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
  private String name;
  private String surname;
  private String id;
  private Date birthDate;
  
  public Person(String name, String surname, String id, Date birthDate) {
    this.name = name;
    this.surname = surname;
    this.id = id;
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getId() {
    return id;
  }

  public Date getBirthDate() {
    return birthDate;
  }
  
  private void test() {
    GregorianCalendar todayDate = new GregorianCalendar();
    todayDate.get();
  }

  
  
  
}
