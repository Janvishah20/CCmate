package com.khushi.win10.cottageclaiment.Model;

/**
 * Created by SONY on 18-03-2017.
 */

public class ChangePasswordModel {

    /**
     * status : 1
     * message : Your password has been changed Successfully
     */

    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
