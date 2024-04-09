package com.kebronis.spring6restmvc.model;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class CustomerDTO {
    private UUID id;
    private String customerName;
    private Integer version;
    private LocalDateTime createDate;
    private LocalDateTime lastModifiedDate;

}
