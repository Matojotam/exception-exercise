package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class NameManager {
    private List<String> names;

    public NameManager() {
        this.names = new ArrayList<>();
    }

    // Method to find a name in the list
    public void findName(String name) throws NameNotFoundException {
        if (!names.contains(name)) {
            throw new NameNotFoundException("Name not found: " + name);
        }
        System.out.println("Name found: " + name);
    }

    // Method to add a name to the list
    public void addName(String name) throws DuplicateNameException {
        if (names.contains(name)) {
            throw new DuplicateNameException("Duplicate name: " + name);
        }
        names.add(name);
        System.out.println("Name added: " + name);
    }

    // Method to set the list of names for testing
    public void setNames(List<String> names) {
        this.names = new ArrayList<>(names); // Wrap in ArrayList for modifiability
    }

    // Method to print all names in the list
    public void printNames() {
        System.out.println("Current names in the list: " + names);
    }

    // Optional: Get the list of names
    public List<String> getNames() {
        return names;
    }
}