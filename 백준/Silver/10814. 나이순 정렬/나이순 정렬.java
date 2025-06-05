import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator; 

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {

            String[] datas = br.readLine().split(" ");

            persons[i] = new Person(Integer.parseInt(datas[0]), datas[1]);
        }

        Arrays.sort(persons, Comparator.comparingInt(Person::getAge));

        StringBuilder result = new StringBuilder();

        for (Person person : persons) {
            result.append(person.toString()).append("\n");
        }

        System.out.println(result);

    }

    public static class Person {

        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return age + " " + name;
        }
    }
}