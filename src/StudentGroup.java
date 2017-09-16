
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		if(students==null) {
			throw new IllegalArgumentException();
		}
		return students;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException{
		if(students==null) {
			throw new IllegalArgumentException();
		}
		
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException {
		if(students.length <=0 && students.length>=index) {
			throw new IllegalArgumentException();
		}
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		if(students==null) {
			throw new IllegalArgumentException();
		}
		add(student,index);
	
	}

	@Override
	public void addFirst(Student student) {
		if(students==null) {
			throw new IllegalArgumentException();
		}
		add(student,0);
	}

	@Override
	public void addLast(Student student) {
		if(students==null) {
			throw new IllegalArgumentException();
		}
		add(student,students.length-1);
	}

	@Override
	public void add(Student student, int index) {
		
		for( int i=0; i<=students.length; i++ ) {
			students[i] = student;
			
			System.out.println(students[i].getFullName());
		}
	
		
	}

	@Override
	public void remove(int index) {
		if(students.length <=0 && students.length>=index) {
			throw new IllegalArgumentException();
		}
		for(int i=0; i<students.length; i++)
	       {
	           if(students[i] == students[index])
	           {
	               for(int j=i; j<(students.length-1); j++)
	               {
	            	   students[j] = students[j+1];
	               }
	               break;
	           }
	       }
	}

	@Override
	public void remove(Student student) {
		if(students==null) {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void removeFromIndex(int index) {
		if(students.length <=0 && students.length>=index) {
			throw new IllegalArgumentException();
		}remove( index);
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		int indexTo=0;
		if(date==null) {
			throw new IllegalArgumentException();
		}
		for( int i=0; i<=students.length; i++ ) {
			if(students[i].getBirthDate()==date)
				indexTo=i;
		}
		return students;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		
		return null;
	}
}
