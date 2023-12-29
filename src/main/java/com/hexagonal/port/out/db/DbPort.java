package com.hexagonal.port.out.db;

import com.hexagonal.application.dto.TennisMatchDTO;

public interface DbPort {

  void upsertMatch(TennisMatchDTO match);

  void updateStatus(String matchId, String status);

}
