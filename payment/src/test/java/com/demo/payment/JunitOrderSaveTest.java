package com.demo.payment;

import com.demo.payment.entity.Payment;
import com.demo.payment.repository.PaymentRepository;
import com.demo.payment.service.PaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitOrderSaveTest {
    @Autowired
    private PaymentService paymentService;

    @MockBean
    private PaymentRepository repository;

    @Test
    public void saveOrderAndResponseTest() {
        Payment payment = new Payment(1, "100", "debitcard", "USD", "1111111", "success", "DS7865HJjkhg");
        when(repository.save(payment)).thenReturn(payment);
        assertEquals(payment, repository.save(payment));
    }

}
