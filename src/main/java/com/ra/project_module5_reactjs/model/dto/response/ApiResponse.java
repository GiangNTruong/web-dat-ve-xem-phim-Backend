package com.ra.project_module5_reactjs.model.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApiResponse<T>
{
    @Builder.Default
    int code = 1000;
    String message;

    T result;

}
