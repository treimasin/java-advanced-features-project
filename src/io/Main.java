package io;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\treim\\IdeaProjects\\java-advanced-features-project\\src\\io\\input.txt");

        readFromFile(myFile);

        writeToFile(myFile);

        Person person = new Person("John", "Smith", 23);

        writeObjectToFile(person);

        File objFile = new File("C:\\Users\\treim\\IdeaProjects\\java-advanced-features-project\\src\\io\\person");
        readObjectFromFile(objFile);
    }

    private static void readObjectFromFile(File objFile) {
        try {
            FileInputStream fileInputStream = new FileInputStream(objFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object receivedObject = objectInputStream.readObject();
            Person receivedPerson = (Person) receivedObject;
            System.out.println(receivedPerson.getFirstName());
            System.out.println(receivedPerson.getLastName());
            System.out.println(receivedPerson.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

        private static void writeObjectToFile (Person person){
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/treim/IdeaProjects/java-advanced-features-project/src/io/person");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(person);
                objectOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        private static void readFromFile (File myFile){

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }

                bufferedReader.close();

            } catch (Exception e) {
                System.out.println("File is not found: " + e);
            }

        }

        private static void writeToFile (File myFile){

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myFile, true));) {
                bufferedWriter.write("\nnew string");
                bufferedWriter.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
