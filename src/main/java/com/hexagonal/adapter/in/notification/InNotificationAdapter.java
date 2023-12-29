package com.hexagonal.adapter.in.notification;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexagonal.application.TennisService;
import com.hexagonal.application.dto.HumidityDTO;
import com.hexagonal.port.in.notification.InNotificationPort;

public class InNotificationAdapter implements InNotificationPort {

  @Autowired
  private TennisService tennisService;

  @Override
  public void handleHumidityNotification(HumidityDTO humidity) {
    tennisService.humidityChanged(humidity);
  }
}
