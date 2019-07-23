package com.lambdaschool.school.model;

import com.lambdaschool.school.exceptions.ValidationError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorDetail
{
    private String title;
    private int status;
    private String detail;
    private String timestamp;
    private String developerMessage;
    private Map<String, List<ValidationError>> errors = new HashMap<String, List<ValidationError>>();
}
