package hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class TestAssignment {

	private Assignment assign;
	@Test
	void testAssignment() {
		
	}

	@Test
	void testSetDueDate() {
		assign = new Assignment();
		Date d = new Date();
		assign.SetDueDate(d);
		assertEquals(d, assign.DueDate);
	}

	@Test
	void testSetAssSpec() {
		assign = new Assignment();
		String str = "abc";
		assign.SetAssSpec(str);
		assertEquals(str, assign.AssSpec);
	}

	@Test
	void testIsOverDue() {
		assign = new Assignment();
		Date d = new Date();
		assign.SetDueDate(d);
		assertEquals(false, assign.IsOverDue());
	}

	@Test
	void testAddSolution() {
		assign = new Assignment();
		assertNotNull(assign.AddSolution());
	}

	@Test
	void testAddSolutionSolution() {
		assign = new Assignment();
		Solution sol = new Solution();
		assign.AddSolution(sol);
		assertNotNull(assign.theSolutionList);
	}

	@Test
	void testSubmitSolution() {
	}

	@Test
	void testGetSolutionList() {
	}

	@Test
	void testGetSolution() {
	}

	@Test
	void testGetSugSolution() {
		assign = new Assignment();
		assertEquals(assign.SuggestSolution, assign.getSugSolution());
	}

	@Test
	void testGetSolutionIterator() {
		assign = new Assignment();
		assertNotNull(assign.GetSolutionIterator());
	}

	@Test
	void testToString() {
		assign = new Assignment();
		assertEquals(assign.AssName, assign.toString());
	}

	@Test
	void testGetDueDateString() {
		assign = new Assignment();
		assertNotNull(assign.getDueDateString());
	}

	@Test
	void testAccept() {
	}

}
