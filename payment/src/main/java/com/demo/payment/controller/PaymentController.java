package com.demo.payment.controller;

import com.demo.payment.model.CardDto;
import com.demo.payment.model.PayloadDto;
import com.demo.payment.model.PaymentResponseDto;
import com.demo.payment.service.PaymentService;
import com.demo.payment.utility.CacheConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping(value = "/payment")
    public ResponseEntity<PaymentResponseDto> payment(@RequestBody PayloadDto payloadDto) {

        if (payloadDto.getType().equalsIgnoreCase(CacheConstants.CREDIT_CARD) ||
                payloadDto.getType().equalsIgnoreCase(CacheConstants.DEBIT_CARD)) {

            PaymentResponseDto responseDto = paymentService.paymentHandled(payloadDto);
            if (responseDto != null) {
                return ResponseEntity.accepted().body(responseDto);
            }
            return new ResponseEntity<>(HttpStatus.PAYMENT_REQUIRED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }
}
