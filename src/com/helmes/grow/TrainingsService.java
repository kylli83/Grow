package com.helmes.grow;

import java.util.ArrayList;
import java.util.List;

public class TrainingsService implements ITrainingsService {
	@Override
	public List<Training> findAll() {
		return null;
	}

	@Override
	public List<Training> findRelevant(String jobTitle, List<Training> trainings) {
		List<Training> result = new ArrayList<>();
		for (Training t : trainings) {
			if (t.getRelatedJobTitles().contains(jobTitle)) {
				result.add(t);
			}
		}
		return result;
	}

	@Override
	public List<Training> findIrrelevant(String jobTitle, List<Training> trainings) {
		return null;
	}

	public List<String> convertListToUpperCase(List<String> trainings) {
		return null;
	}

}
