package tr.edu.maltepe.oop;
public  class Simple_main {

 public static void main(String []args)
    {
        String topic = "Java is released in 1995.";

        Professor EnsarGul = new Professor("EnsarGul", 34, topic);
        Student enver = new Student("Enver", 20);

        EnsarGul.teach(topic);
        enver.listen(EnsarGul, topic);
        enver.takeNotes(topic);
    }
}

