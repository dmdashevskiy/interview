import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) throws IOException {

    Class clazz = Main.class;
    InputStream inputStream = clazz.getResourceAsStream("/users");
    readAndSort(inputStream)
        .forEach(System.out::println);
  }

  private static Set<User> readAndSort(InputStream inputStream)
      throws IOException {
    StringBuilder resultStringBuilder = new StringBuilder();
    try (BufferedReader br
        = new BufferedReader(new InputStreamReader(inputStream))) {

      Set<User> users = new TreeSet<User>(Comparator.comparing(User::getAge));

      String surname = br.readLine();
      do {
        final User user = new User(surname, br.readLine(), br.readLine(), getAge(br), br.readLine());
        users.add(user);
      } while ((surname = br.readLine()) != null);

      return users;
    }
  }

  private static Integer getAge(BufferedReader br) throws IOException {
    final String age = br.readLine();
    return age.equals("")? 0: Integer.parseInt(age);
  }
}
