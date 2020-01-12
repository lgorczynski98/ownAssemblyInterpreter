package com.jfk.assembler;

public class RegisterSet {

    private Integer eax;
    private Integer ebx;
    private Integer ecx;
    private Integer edx;

    public RegisterSet() {
        eax = null;
        ebx = null;
        ecx = null;
        edx = null;
    }

    public Integer getEax() {
        return eax;
    }

    public void setEax(Integer eax) {
        this.eax = eax;
    }

    public Integer getEbx() {
        return ebx;
    }

    public void setEbx(Integer ebx) {
        this.ebx = ebx;
    }

    public Integer getEcx() {
        return ecx;
    }

    public void setEcx(Integer ecx) {
        this.ecx = ecx;
    }

    public Integer getEdx() {
        return edx;
    }

    public void setEdx(Integer edx) {
        this.edx = edx;
    }
}
