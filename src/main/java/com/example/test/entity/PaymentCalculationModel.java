package com.example.test.entity;

import java.io.Serializable;

/**
 * Created by bilga on 31-05-2021
 */
public class PaymentCalculationModel implements Serializable {

    private String paymentDate;
    private double annuity;
    private double principal;
    private double interest;
    private double initialOutstandingPrincipal;
    private double remainingOutstandingPrincipal;

    public PaymentCalculationModel() {
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAnnuity() {
        return annuity;
    }

    public void setAnnuity(double annuity) {
        this.annuity = annuity;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInitialOutstandingPrincipal() {
        return initialOutstandingPrincipal;
    }

    public void setInitialOutstandingPrincipal(double initialOutstandingPrincipal) {
        this.initialOutstandingPrincipal = initialOutstandingPrincipal;
    }

    public double getRemainingOutstandingPrincipal() {
        return remainingOutstandingPrincipal;
    }

    public void setRemainingOutstandingPrincipal(double remainingOutstandingPrincipal) {
        this.remainingOutstandingPrincipal = remainingOutstandingPrincipal;
    }
}
