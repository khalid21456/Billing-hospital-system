package com.pack.billingsystem.Row;

public class BillRowData {

    private String idBill;
    private String prenom;
    private String nom;
    private String date;

    public BillRowData(String idBill, String prenom, String nom, String date) {
        this.idBill = idBill;
        this.prenom = prenom;
        this.nom = nom;
        this.date = date;
    }


    public String getBillId() {
        return idBill;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getDate() {
        return date;
    }
}
