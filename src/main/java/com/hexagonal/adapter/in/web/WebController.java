package com.hexagonal.adapter.in.web;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.hexagonal.application.TennisService;
import com.hexagonal.application.dto.TennisMatchDTO;
import com.hexagonal.port.in.web.WebPort;

@RestController
public class WebController implements WebPort {

  @Autowired
  private TennisService tennisService;

  @Override
  public TennisMatchDTO start(Map<String, String> players) {
    String player1 = players.get("player1");
    String player2 = players.get("player2");
    if (player1 == null || player2 == null) {
      throw new ResponseStatusException(
        HttpStatus.BAD_REQUEST);
    }

    return tennisService.startMatch(player1, player2);
  }

  @Override
  public TennisMatchDTO addPoint(String matchId, String player) {
    return tennisService.addPoint(matchId, player);
  }

  @Override
  public void warn(String matchId, String player) {
    // Warn player
  }
}
