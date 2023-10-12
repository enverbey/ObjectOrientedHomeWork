package tr.edu.maltepe.oop;

public class Simple_main {
    public static void main(String[] args) {
        //We have one proff and two students.
        Proff Ensar_gul;
        Student enver;
        Student harun;

        //I allocated memory from heap for my variables
        Ensar_gul = new Proff();
        enver = new Student();
        harun = new Student();

        //I setted some information.
        Ensar_gul.setName("Ensar Gül");
        enver.setName("Enver");
        enver.setSchool_number(21);
        harun.setName("Harun Yahya");
        harun.setSchool_number(22);

        //Prof. Ensar Gül is teaching.
        Ensar_gul.teaching("I am the greatest professor and teacher in the world", enver, 0);
        Ensar_gul.teaching("Java is a programming language released in 1995", harun, 0);

        //Let's printf and
        System.out.println("I am a professor and my name is " + Ensar_gul.getName());
        System.out.println("Student " + enver.getName() + " learned : " + enver.getLearned_from_proff());
        System.out.println("Student " + harun.getName() + " learned : " + harun.getLearned_from_proff());
    }
}
