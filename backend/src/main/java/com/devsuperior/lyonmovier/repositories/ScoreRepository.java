package com.devsuperior.lyonmovier.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.lyonmovier.entities.Score;
import com.devsuperior.lyonmovier.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
