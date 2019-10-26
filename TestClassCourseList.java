package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassCourseList {
	ClassCourseList ccl;
	@Test
	void testClassCourseList() {
	}

	@Test
	void testInitializeFromFile() {
		ccl = new ClassCourseList();
		ccl.InitializeFromFile("CourseInfo.txt");
		assertNotNull(ccl);
	}

	@Test
	void testFindCourseByCourseName() {
		ccl = new ClassCourseList();
		ccl.InitializeFromFile("CourseInfo.txt");
		Course theCourse = new Course("CSE870", 0);
		assertEquals(theCourse.CourseName, ccl.FindCourseByCourseName("CSE870").CourseName);
		
	}

}
