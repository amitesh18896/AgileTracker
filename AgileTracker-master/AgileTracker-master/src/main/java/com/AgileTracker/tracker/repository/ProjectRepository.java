package com.AgileTracker.tracker.repository;

import com.AgileTracker.tracker.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
