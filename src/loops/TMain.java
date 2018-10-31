package loops;

public class TMain {
    public static void main(String[] args) {
        TProcess myExams = new TProcess();
        myExams.addActivity
                (new TActivity("Java Programming", 5));
        myExams.addActivity
                (new TActivity("Statistical Methods", 4));
        myExams.addActivity
                (new TActivity("Business Intelligence", 5));
        myExams.addActivity
                (new TActivity("Big Data", 5));

        myExams.showProcessState();
        //TProcess yourExams = new TProces(); compare + inform bout better results
    }
}