public class MVCPatternTest {
    public static void main(String[] args) {
        Student model = new Student();
        model.setName("Abdul farith");
        model.setId("1234");
        model.setGrade("A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Farith");
        controller.updateView();
    }
}
