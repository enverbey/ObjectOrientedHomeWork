package tr.edu.maltepe.oop;

public class Student extends Person{
    public Student(String name, int age)
    {
        super(name, age);
    }
    public void listen(Professor professor, String topic){
        System.out.println("Student " + this.getName() + " is listening to Prof. "
                + professor.getName() + " and topic id " + topic);
    }
    public void takeNotes(String topic)
    {
        System.out.println("Student takes note, the topic is " + topic);
    }
}
