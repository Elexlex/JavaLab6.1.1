package Lab611;

public abstract class Person {

    //fields
    private String name;
    private String surname;
    private int age;

    //getters/setters
    public int getAge() {return age;}

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public void setAge(int age) {this.age = age;}

    public void setName(String name) {this.name = name;}

    public void setSurname(String surname) {this.surname = surname;}

    //an abstract method
    public abstract void printInfo();
}
class Student extends Person{

    //fields
    private int group;
    private int studentID;

    //setters
    public void setGroup(int group) {this.group = group;}

    public void setStudentID(int studentID) {this.studentID = studentID;}

    //a method that overrides the superclass method and outputs a line
    public void printInfo() {
        System.out.println("\n\nGroup " + group + " student " + getSurname() + " " + getName() + ", age " + getAge() + ".\nStudent ID " + studentID);
    }
}
class Lecturer extends Person{

    //fields
    private int salary;
    private String department;

    //setters
    public void setDepartment(String department) {this.department = department;}

    public void setSalary(int salary) {this.salary = salary;}

    //another method that overrides the superclass method and outputs a line
    public void printInfo() {
        System.out.println("\n\nDepartment of " + department + " teacher " + getSurname() + " " + getName() + ", age " + getAge() + ".\nSalary:" + salary);
    }
}
