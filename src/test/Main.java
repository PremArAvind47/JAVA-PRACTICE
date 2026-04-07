package test;

import java.util.*;

// Comparable (default sorting by id)
class User implements Comparable<User> {
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Default sorting (by id)
    public int compareTo(User u) {
        return this.id - u.id;
    }
}

// Comparator for sorting by name
class UserNameComparator implements Comparator<User> {
    public int compare(User a, User b) {
        return a.name.compareTo(b.name);
    }
}

// Comparator for sorting by id (custom)
class UserIdComparator implements Comparator<User> {
    public int compare(User a, User b) {
        return a.id - b.id;
    }
}

public class Main {
    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        list.add(new User(2, "B"));
        list.add(new User(1, "A"));
        list.add(new User(3, "C"));

        // 🔹 1. Default sorting using Comparable (by id)
        Collections.sort(list);
        System.out.println("Sort by id (Comparable):");
        for (User u : list) {
            System.out.println(u.id + " " + u.name);
        }

        System.out.println("------");

        // 🔹 2. Custom sorting using Comparator (by name)
        Collections.sort(list, new UserNameComparator());
        System.out.println("Sort by name (Comparator):");
        for (User u : list) {
            System.out.println(u.id + " " + u.name);
        }

        System.out.println("------");

        // 🔹 3. Another custom sorting (by id again using Comparator)
        Collections.sort(list, new UserIdComparator());
        System.out.println("Sort by id (Comparator):");
        for (User u : list) {
            System.out.println(u.id + " " + u.name);
        }
    }
}