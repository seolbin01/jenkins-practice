package com.benny.jenkins.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class CalculatorDTO {

    @NonNull
    private Integer num1;
    @NonNull
    private Integer num2;
    private Integer sum;
}
