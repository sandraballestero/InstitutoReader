package org.iesfm.institutoscanner;

import java.util.Scanner;

public class StudentReader {
    private Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Student readStudent() {

        return new Student("3243", "Pepa", "Pig");
    }
}
