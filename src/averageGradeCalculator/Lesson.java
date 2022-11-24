package averageGradeCalculator;

public class Lesson {

    private float grade;

    private Enums_Lesson nameOfLesson;

    public Lesson(Enums_Lesson nameOfLesson, float grade) {
        this.grade = grade;
        this.nameOfLesson = nameOfLesson;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public Enums_Lesson getNameOfLesson() {
        return nameOfLesson;
    }

    public void setNameOfLesson(Enums_Lesson nameOfLesson) {
        this.nameOfLesson = nameOfLesson;
    }
}
