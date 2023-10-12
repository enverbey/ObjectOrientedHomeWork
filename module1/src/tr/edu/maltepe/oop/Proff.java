package tr.edu.maltepe.oop;

public class Proff
{
    //These are variables of Proff
    private String name;

    //These are getters.
    public String getName()
    {
        return name;
    }

    //These are settings.
    public  void setName(String name){
        this.name = name;
    }

    //
    public void teaches(String teach_message, Student student)
    {
        student.learns(teach_message);
        System.out.println("I teached something to " + student.getName());
    }
    public void teaches(String teach_message, Student student, int notification_message_on_off)
    {
        if (notification_message_on_off == 1)
            System.out.println("I teached something to " + student.getName());
        student.learns(teach_message);

    }
}
