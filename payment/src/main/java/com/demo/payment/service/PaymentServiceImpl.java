package com.demo.payment.service;

import com.demo.payment.entity.Payment;
import com.demo.payment.model.CardDto;
import com.demo.payment.model.PayloadDto;
import com.demo.payment.model.PaymentResponseDto;
import com.demo.payment.model.ResponseCardDto;
import com.demo.payment.repository.PaymentRepository;
import com.demo.payment.utility.AuthorizationCodeGenerator;
import com.demo.payment.utility.CacheConstants;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentResponseDto paymentResponseDto;
    @Autowired
    ResponseCardDto cardDto;
    @Autowired
    PaymentRepository repository;

    @Override
    public PaymentResponseDto paymentHandled(PayloadDto payloadDto) {
        //Implementation of Payment request

        if (CacheConstants.IS_PAYMENT_SUCCESS) {

//            Add order and response log with status in DB
            Payment payment = new Payment();
            JSONObject obj = new JSONObject();
            obj.put(CacheConstants.NUMBER, payloadDto.getCard().getNumber());
            obj.put(CacheConstants.EXPIRATION_MONTH, payloadDto.getCard().getExpirationMonth());
            obj.put(CacheConstants.EXPIRATION_YEAR, payloadDto.getCard().getExpirationYear());
            payment.setAmount(payloadDto.getAmount());
            payment.setStatus(CacheConstants.SUCCESS);
            payment.setCurrency(payloadDto.getCurrency());
            payment.setType(payloadDto.getType());
            payment.setAuthorizationCode(AuthorizationCodeGenerator.generateCode());
            JSONArray jsonArray = new JSONArray();
            jsonArray.add(obj);
            payment.setCard(jsonArray.toJSONString());
            repository.save(payment);

//            Set data to response Dto

            paymentResponseDto.setAmount(payloadDto.getAmount());
            paymentResponseDto.setCurrency(payloadDto.getCurrency());
            paymentResponseDto.setType(payloadDto.getType());
            String date = String.valueOf(LocalDate.now());
            String time = String.valueOf(LocalTime.now());
            paymentResponseDto.setTime(date+" "+time);
            paymentResponseDto.setAuthorization_code(AuthorizationCodeGenerator.generateCode());
            cardDto.setNumber(payloadDto.getCard().getNumber());
            paymentResponseDto.setCard(cardDto);
            paymentResponseDto.setStatus(CacheConstants.SUCCESS);

            return paymentResponseDto;
        }
        return null;
    }
}
