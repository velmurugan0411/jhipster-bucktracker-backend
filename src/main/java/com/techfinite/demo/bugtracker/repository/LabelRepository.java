package com.techfinite.demo.bugtracker.repository;

import com.techfinite.demo.bugtracker.domain.Label;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Label entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LabelRepository extends JpaRepository<Label, Long> {}
