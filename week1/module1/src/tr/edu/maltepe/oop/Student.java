package tr.edu.maltepe.oop;

public class
    Student
{
    //These are variables of student.
    private String name;
    private int school_number;
    private String learned_from_proff;

    //These are getters.
    public String getName() {return name;}
    public int getSchool_number() {return school_number;}
    public String getLearned_from_proff() {return learned_from_proff;}

    //These function are setters.
    public void setName(String name) {
        this.name = name;
    }
    public void setSchool_number(int number){this.school_number = number; }
    public void learns(String mess)
    {
        if(this.learned_from_proff == null)
            this.learned_from_proff = mess;
        else
            this.learned_from_proff = this.learned_from_proff + "\n" + mess;
    }
    public void delete_learns()
    {
        this.learned_from_proff = "";
    }

    //Get all information about this student.
    private String get_all_information()
    {
        String information = "My name is " + name + "\n" + "My school number is " + school_number
                + "\n" + "I learned my these : " + "\"" + learned_from_proff + "\"";
        return (information);
    }

    //Print all information about this student.
    public void write_all_information()
    {
        String message;

        message = get_all_information();
        System.out.println(message);
    }
}
