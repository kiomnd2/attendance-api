package kiomnd2.studyattendance.studyattendance.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ApiResponse <T>{

    private String code;

    private boolean isError;

    private T messageBody;

    public static <T> ApiResponse<T> success(T body) {
        return new ApiResponse<>("0000", false, body);
    }

    public static <T> ApiResponse<T> failed(T body, String code) {
        return new ApiResponse<>(code, true, body);
    }

}
