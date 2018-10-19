package com.helmes.grow;

import java.util.List;

public interface ITrainingsService {
	List<Training> findAll();
	List<Training> findRelevant(String jobTitle, List<Training> trainings);
	List<Training> findIrrelevant(String jobTitle, List<Training> trainings);
}
