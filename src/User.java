import java.util.Objects;

public class User {

  private final String surname;
  private final String name;
  private final String patronymic;
  private final Integer age;
  private final String passport;

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public Integer getAge() {
    return age;
  }

  public String getPassport() {
    return passport;
  }

  public User(String name, String surname, String patronymic, Integer age, String passport) {
    this.name = name;
    this.surname = surname;
    this.patronymic = patronymic;
    this.age = age;
    this.passport = passport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects
        .equals(patronymic, user.patronymic) && Objects.equals(passport, user.passport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname, patronymic, age, passport);
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", patronymic='" + patronymic + '\'' +
        ", age=" + age +
        ", passport='" + passport + '\'' +
        '}';
  }
}
