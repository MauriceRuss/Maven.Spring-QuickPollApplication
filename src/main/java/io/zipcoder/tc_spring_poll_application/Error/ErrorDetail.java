package io.zipcoder.tc_spring_poll_application.Error;

public class ErrorDetail {
    String title;
    int status;
    String detail;
    long timeStamp;
    String developerMessage;

    public ErrorDetail(String title, int status, String detail, long timeStamp, String developerMessage) {
        this.title = title;
        this.status = status;
        this.detail = detail;
        this.timeStamp = timeStamp;
        this.developerMessage = developerMessage;
    }
}
