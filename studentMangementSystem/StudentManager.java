package studentMangementSystem;


	import java.io.*;
	import java.util.*;

	public class StudentManager {
	    private HashMap<Integer, Student> studentMap;
	    private TreeSet<Student> studentSet;

	    public StudentManager() {
	        studentMap = new HashMap<>();
	        studentSet = new TreeSet<>();
	    }

	    public void addStudent(Student student) {
	        if (studentMap.containsKey(student.getId())) {
	            System.out.println("Student with this ID already exists.");
	        } else {
	            studentMap.put(student.getId(), student);
	            studentSet.add(student);
	        }
	    }

	    public void removeStudent(int id) {
	        Student student = studentMap.remove(id);
	        if (student != null) {
	            studentSet.remove(student);
	        } else {
	            System.out.println("Student not found.");
	        }
	    }

	    public void updateStudent(int id, String name, int age, String grade, String address) {
	        Student student = studentMap.get(id);
	        if (student != null) {
	            studentSet.remove(student);
	            student.setName(name);
	            student.setAge(age);
	            student.setGrade(grade);
	            student.setAddress(address);
	            studentSet.add(student);
	        } else {
	            System.out.println("Student not found.");
	        }
	    }

	    public Student searchStudent(int id) {
	        return studentMap.get(id);
	    }

	    public void displayAllStudents() {
	        for (Student student : studentSet) {
	            System.out.println(student);
	        }
	    }

	    public void loadFromFile(String filename) {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
	            studentMap = (HashMap<Integer, Student>) ois.readObject();
	            studentSet = new TreeSet<>(studentMap.values());
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Error loading from file: " + e.getMessage());
	        }
	    }

	    public void saveToFile(String filename) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
	            oos.writeObject(studentMap);
	        } catch (IOException e) {
	            System.out.println("Error saving to file: " + e.getMessage());
	        }
	    }
	}

