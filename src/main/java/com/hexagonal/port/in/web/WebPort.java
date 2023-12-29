package com.hexagonal.port.in.web;

import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hexagonal.application.dto.TennisMatchDTO;

public interface WebPort {

  @PostMapping("/match")
  TennisMatchDTO start(@RequestBody Map<String, String> players);

  @PostMapping("/match/{matchId}/point/{player}")
  TennisMatchDTO addPoint(@PathVariable String matchId, @PathVariable String player);

  @PostMapping("/match/{matchId}/warn/{player}")
  void warn(@PathVariable String matchId, @PathVariable String player);
}
