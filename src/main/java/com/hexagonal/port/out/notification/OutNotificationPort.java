package com.hexagonal.port.out.notification;

import com.hexagonal.application.dto.TennisMatchDTO;

public interface OutNotificationPort {

  void notifyMatchResult(TennisMatchDTO result);
}
