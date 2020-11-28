package com.employee.employeedata.exception;

import java.io.Serializable;

public class CustomizedException extends RuntimeException {
    public CustomizedException(String message)
    {
        super(message);
    }
}
