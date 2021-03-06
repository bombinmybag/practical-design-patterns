package in.ashwanik.pdp.structural.bridge;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
class BaseEntity {
    private long id;
    private LocalDateTime createdTime;
    private LocalDateTime modifiedTime;
}
