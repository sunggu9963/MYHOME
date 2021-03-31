package com.ATV.MYHOME.repository;

import com.ATV.MYHOME.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
