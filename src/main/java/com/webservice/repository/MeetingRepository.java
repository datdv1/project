package com.webservice.repository;

import com.webservice.entity.MeettingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepository extends JpaRepository<MeettingEntity , Long> {
}
