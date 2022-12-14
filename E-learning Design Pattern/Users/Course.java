package Users;

import java.util.ArrayList;

import Gateways.EmailGateway;
import Messages.TaskAddedEmailMessage;

import Users.*;

public class Course {
	
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;
	/*
	ArrayList<Professor> professorsForEmailNotification;
	ArrayList<Professor> professorsForSMSNotification;
	
	ArrayList<TA> TAsForEmailNotification;
	ArrayList<TA> TAsForSMSNotification;
	
	ArrayList<Student> studentsForEmailNotification;
	ArrayList<Student> studentsForSMSNotification;
	*/
	//***************** there will be two lists of observers *********************//
	ArrayList<CourseObserver> observerEmailList;
	ArrayList<CourseObserver> observerSMSList;

	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<String>();
		exams = new ArrayList<String>();
		grades = new ArrayList<String>();
		/*
		professorsForEmailNotification = new ArrayList<Professor>();
		professorsForSMSNotification = new ArrayList<Professor>();
		
		TAsForEmailNotification = new ArrayList<TA>();
		TAsForSMSNotification = new ArrayList<TA>();
		
		studentsForEmailNotification = new ArrayList<Student>();
		studentsForSMSNotification = new ArrayList<Student>();
		 */
		//****************** two lists of observers *************************//
		observerEmailList = new ArrayList<CourseObserver>();
		observerSMSList = new ArrayList<CourseObserver>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	/*
	public void subscribeProfessorForEmailNotification(Professor professor) {
		professorsForEmailNotification.add(professor);
	}
	
	public void subscribeProfessorForSMSNotification(Professor professor) {
		professorsForSMSNotification.add(professor);
	}
	
	public void subscribeTAForEmailNotification(TA ta) {
		TAsForEmailNotification.add(ta);
	}
	
	public void subscribeTAForSMSNotification(TA ta) {
		TAsForSMSNotification.add(ta);
	}
	
	public void subscribeStudentForEmailNotification(Student student) {
		studentsForEmailNotification.add(student);
	}
	
	public void subscribeStudentForSMSNotification(Student student) {
		studentsForSMSNotification.add(student);
	}
	*/
	//***************** there will be two functions of subscribe *****************//
	public void subscribeForEmailNotification(CourseObserver observer){
		observerEmailList.add(observer);
	}
	public void subscribeForSMSNotification(CourseObserver observer){
		observerSMSList.add(observer);
	}
	
	public void AddAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] placeholders = new String[] {assignName, assignBody};
		// do some logic here 
		
		notifyAllUsers(placeholders);
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	public void notifyAllUsers(String[] placeholders) {
		// notify users by email
		TaskAddedEmailMessage msg = new TaskAddedEmailMessage();
		String notification = msg.prepareMessage(placeholders);

		// open connection for Email gateway and do some configurations to the object

		//************ notifyAllUsers will be public and will call Notify function *************//
		for (CourseObserver observer: observerEmailList){
			observer.Notify(notification);
		}
		for (CourseObserver observer: observerSMSList){
			observer.Notify(notification);
		}

		/*
		EmailGateway emailGateway = new EmailGateway();
		
		
		for (Professor professor : professorsForEmailNotification) {
			professor.notifyProfessor(notification);
			emailGateway.sendMessage(notification, professor.getEmail());
		}
		
		for (TA ta : TAsForEmailNotification) {
			ta.notifyTA(notification);
			emailGateway.sendMessage(notification, ta.getEmail());
		}
		
		for (Student student : studentsForSMSNotification) {
			student.notifyStudent(notification);
			emailGateway.sendMessage(notification, student.getEmail());
		}
		*/
	}

}
//************ interface CourseObserver is an observer pattern **************//
/*
public interface CourseObserver{
	protected  Users.Course cource;
	public abstract void Notify(String notifications);
}*/