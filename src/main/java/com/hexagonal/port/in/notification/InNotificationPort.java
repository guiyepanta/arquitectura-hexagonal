package com.hexagonal.port.in.notification;

import com.hexagonal.application.dto.HumidityDTO;

public interface InNotificationPort {

  void handleHumidityNotification(HumidityDTO humidity);
}
