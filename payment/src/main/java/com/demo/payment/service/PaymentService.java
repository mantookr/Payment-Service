package com.demo.payment.service;

import com.demo.payment.model.PayloadDto;
import com.demo.payment.model.PaymentResponseDto;

public interface PaymentService {

    PaymentResponseDto paymentHandled(PayloadDto payloadDto);
}
