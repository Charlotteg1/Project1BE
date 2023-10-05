package com.travelPlanner.TravelPlannerProject.repositories;

import com.travelPlanner.TravelPlannerProject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
