package Users;

public abstract class CourseObserver{
    protected  Course course;
    public abstract void Notify(String notifications);
}