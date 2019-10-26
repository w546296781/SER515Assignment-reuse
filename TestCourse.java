package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCourse {
	Course theCourse;
	
	@Test
	void testCourse() {
		theCourse = new Course("CSE870", 0);
		assertEquals("CSE870", theCourse.CourseName);
	}

	@Test
	void testAddAssignment() {
		theCourse = new Course("CSE870", 0);
		Assignment newAssign = new Assignment();
		theCourse.AddAssignment(newAssign);
		assertNotNull(theCourse.assignmentList);
	}

	@Test
	void testToString() {
		theCourse = new Course("CSE870", 0);
		assertEquals("CSE870", theCourse.toString());
	}

	@Test
	void testAccept() {
	}

}
