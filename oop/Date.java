public class Date {
  //Private variables
  private int year, month, day;

  //Constructor
  public Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  //Getters
  public int getYear() {
    return this.year;
  }

  public int getMonth() {
    return this.month;
  }

  public int getDay() {
    return this.day;
  }

  //Setters
  public void setYear(int year) {
    this.year = year;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public void setDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  //String desc.
  public String toString() {
    return String.format("%02d/%02d/%04d", month, day, year);
  }
}
