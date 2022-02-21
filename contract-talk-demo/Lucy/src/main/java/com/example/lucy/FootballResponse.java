package com.example.lucy;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class FootballResponse {
    private String message;
    private String status;
}
