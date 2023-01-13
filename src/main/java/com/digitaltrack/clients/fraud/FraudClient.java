package com.digitaltrack.clients.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "fraud",
        url = "${fraud.url}"
)
public interface FraudClient {
    @GetMapping("/frauds/{customerId}")
    FraudCheckResponse isFraudulent(@PathVariable("customerId") Long customerId);
}
