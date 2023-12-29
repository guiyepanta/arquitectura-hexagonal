package com.hexagonal.adapter.out.notification;

import org.springframework.stereotype.Service;

import com.hexagonal.application.dto.TennisMatchDTO;
import com.hexagonal.port.out.notification.OutNotificationPort;

@Service
public class OutNotificationAdapter implements OutNotificationPort {

  @Override
  public void notifyMatchResult(TennisMatchDTO result) {
    // Send Message to AWS to notify that a match has ended
  }
}
