package com.kloia.sample.dto.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zeldalozdemir on 31/01/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcessOrderPaymentCommandDto {

    private String orderId;

}
