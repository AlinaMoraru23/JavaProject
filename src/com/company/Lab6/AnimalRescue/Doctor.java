package com.company.Lab6.AnimalRescue;

class Doctor extends Human {
//atributele clasei

    private String domain = "Consultations";


    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomain() {
        return domain;
    }

    public void intention(){
        System.out.println("Treat sick animals");
    }
}
