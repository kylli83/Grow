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
			List<String> jobTitles = t.getRelatedJobTitles();
			if (convertListToUpperCase(jobTitles).contains(jobTitle.toUpperCase())) {
				result.add(t);
			}
		}
		return result;
	}

	@Override
		public List<String> convertListToUpperCase(List<String> stringList) {
		List<String> result = new ArrayList<>();
		for (String s: stringList) {
			result.add(s.toUpperCase());
		}
		return result;
	}
    @Override
    public List<Training> findIrrelevant(String jobTitle, List<Training> trainings) {
        List<Training> irrelevantresult = new ArrayList<>();
        for (Training t : trainings) {
            List<String> jobTitles = t.getRelatedJobTitles();
            if (!convertListToUpperCase(jobTitles).contains(jobTitle.toUpperCase())){
                continue;
            }
            irrelevantresult.add(t);
        }
        return irrelevantresult;
}
}