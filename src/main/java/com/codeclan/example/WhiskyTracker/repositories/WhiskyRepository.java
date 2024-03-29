package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long> {
    List<Whisky> findByYear(int year);

    List<Whisky> findByDistilleryIdAndAge(long distilleryId, int age);

    List<Whisky> findByDistilleryRegion(String region);
}
