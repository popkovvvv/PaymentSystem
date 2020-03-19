package com.fairpay.payments.advcash.service.interf;

import com.fairpay.payments.advcash.model.dto.BillAdvCashDTO;
import org.springframework.http.ResponseEntity;

public interface IBillAdvCashProcessingService {
    String createPay(BillAdvCashDTO billAdvCashDTO);
}
