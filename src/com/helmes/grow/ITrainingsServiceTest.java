package com.helmes.grow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ITrainingsServiceTest {
	private ITrainingsService service;

	@Before
	public void setUp() throws Exception {
		this.service = new TrainingsService();
	}

	@Test
	public void shouldFindOneRelevantTraining() {
		List<Training> allTrainings = new ArrayList<>();
		String position = "Analyst";
		final Training firstTraining = createTraining(1L, "Training for teamleads and analysts", "Teamlead", "Analyst");
		final Training secondTraining = createTraining(2L, "Training for testers and developers", "Tester", "Developer");
		allTrainings.add(firstTraining);
		allTrainings.add(secondTraining);
		final List<Training> actual = this.service.findRelevant(position, allTrainings);

		assertTrue("Should have found one training", actual.size() > 0);
		assertEquals("Should have found one training", firstTraining, actual.get(0));
	}
	@Test
	public void shouldntCarePositionCase () {
		List<Training> allTrainings = new ArrayList<>();
		String position = "ANAlYST";
		final Training firstTraining = createTraining(1L, "Training for teamleads and analysts", "Teamlead", "Analyst");
		final Training secondTraining = createTraining(2L, "Training for testers and developers", "Tester", "Developer");
		allTrainings.add(firstTraining);
		allTrainings.add(secondTraining);
		final List<Training> actual = this.service.findRelevant(position, allTrainings);

		assertTrue("Should have found one training", actual.size() > 0);
		assertEquals("Should have found one training", firstTraining, actual.get(0));
	}


	@Test
	public void shouldConvertListToUpperCase() {
		List<String> list = new ArrayList<>();
		list.add("a");
		List<String> actual = service.convertListToUpperCase(list);
		String expected = "A";
		assertEquals(expected, actual);
	}

	private Training createTraining(Long id, String name, String... p) {
		List<String> positions = new ArrayList(Arrays.asList(p));
		return new Training(id, name, "...", new Date(), positions);
	}
}