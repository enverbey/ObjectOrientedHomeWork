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
    public void teaching(String teach_message, Student student)
    {
        student.learn(teach_message);
        System.out.println("I teached something to " + student.getName());
    }
    public void teaching(String teach_message, Student student, int notification_message_on_off)
    {
        if (notification_message_on_off == 1)
            System.out.println("I teached something to " + student.getName());
        student.learn(teach_message);

    }
}
