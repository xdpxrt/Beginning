package Students;

import java.util.ArrayList;

public class Utilities {
    static void splitTo3(ArrayList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

    static int getNumberOfSimilarStudents(ArrayList<Person> list, Person student) {
        int numberOfSimilar = 0;
        for (Person p : list) {
            if (student.equals(p)) {
                numberOfSimilar++;
            }
        }
        return ++numberOfSimilar;
    }

    static void getFirstElementAgeSplitTo3(ArrayList<Person> list) {
        int year = 2008;
        for (Person p : list) {
            if ((year - p.getYearOfBirth()) % 3 == 0) {
                System.out.println(p);
                break;
            }
        }
    }

    static void getConscriptedMens(ArrayList<Person> list) {
        for (Person p : list) {
            int year = 2008;
            if (18 <= (2008 - p.getYearOfBirth()) && (2008 - p.getYearOfBirth()) <= 27 && p.getName().startsWith("B")) {
                System.out.print(p);
            }
        }
    }
}