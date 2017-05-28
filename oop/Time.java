public class Time {
  //variables
  private int second;
  private int minute;
  private int hour;

  //constructors
  public Time(int second, int minute, int hour) {
    this.second = second;
    this.minute = minute;
    this.hour = hour;
  }
  public Time() {
    this.second = 0;
    this.minute = 0;
    this.hour = 0;
  }

  //getters
  public int getSecond() {
    return this.second;
  }
  public int getMinute() {
    return this.minute;
  }
  public int getHour() {
    return this.hour;
  }

  //setters
  public void setSecond(int second) {
    if (second >= 0 && second <= 59) {
      this.second = second;
    } else {
      System.out.println("Invalid second.");
    }
  }
  public void setMinute(int minute) {
    if (minute >= 0 && minute <= 59) {
      this.minute = minute;
    } else {
      System.out.println("Invalid minute.");
    }
  }
  public void setHour(int hour) {
    if (hour >= 0 && hour <= 23) {
      this.hour = hour;
    } else {
      System.out.println("Invalid hour.");
    }
  }

  //cascading operations method
  public Time nextSecond() {
    if (this.second < 59) {
      this.second += 1;
    } else {
      this.second = 0;
      if (this.minute < 59) {
        this.minute += 1;
      } else {
        this.minute = 0;
        if (this.hour < 23) {
          this.hour += 1;
        } else {
          this.hour = 0;
        }
      }
    }
    return this;
  }

  public void setTime(int second, int minute, int hour) {
    boolean timeIsValid = true;
    String errorMessage = "The following are invalid:\n";
    if (second >= 0 && second <= 59) {
      this.second = second;
    } else {
      errorMessage += "second\n";
      timeIsValid = false;
    }
    if (minute >= 0 && minute <= 59) {
      this.minute = minute;
    } else {
      errorMessage += "minute\n";
      timeIsValid = false;
    }
    if (hour >= 0 && hour <= 23) {
      this.hour = hour;
    } else {
      errorMessage += "hour\n";
      timeIsValid = false;
    }

    if(timeIsValid == false) {
      System.out.println(errorMessage);
    } else {
      System.out.println(this);
    }

  }

  //toString() desc
  public String toString() {
    return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
  }

}
