package com.shakhawat.runnerz.run;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record Run(
    Integer id,
    @NotNull
    String title,
    LocalDateTime startOn,
    LocalDateTime completedOn,
    @Positive
    Integer miles,
    Location location 
) {

}
