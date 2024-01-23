package statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroups { //Student Group HAS A student

    public String groupName ;
    public int groupId ;
    public ArrayList<Student> students;

    public StudentsGroups(String groupName, int groupId) {// creates the StudentsGroup object by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>(); // size : 0
    }
    public void addStudent(Student student){ // takes one student object and adds it to the arraylist of students
        students.add(student);
    }
    public void addStudent(String name , int age , char gender , String id){ // takes , name, age, gender, id of student info , creates the student object by using the given info. then adds the student object to arraylist of students
        students.add( new Student(name,age,gender,id));
    }
    public void addStudent(Student[] students){// takes one array of students, and adds the array of students to the arraylist of students
        this.students.addAll(Arrays.asList(students));
    }
    public void removeStudent(String id){// takes the id and then removes the student object with the specified id from arraylist of students
        students.removeIf(p-> p.id.equals(id));
    }

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students="+ students.size() +
                '}';
    }
}
/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement

 */