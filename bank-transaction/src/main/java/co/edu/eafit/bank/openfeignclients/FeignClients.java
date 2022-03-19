package co.edu.eafit.bank.openfeignclients;


import co.edu.eafit.bank.dto.OTPValidationRequest;
import co.edu.eafit.bank.dto.OTPValidationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient(
        //url = "${otp.service.url}",
        value = "api-gateway" // Debe coincidir con el nombre application.name en Eureka
)

// Vamos a remplazar
public interface FeignClients {


    @PostMapping("/bank-otp/api/v1/otp/validate")
    public OTPValidationResponse validateOTP(
            @Valid @RequestBody
                    OTPValidationRequest otpValidationRequest);
}
