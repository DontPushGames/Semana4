package com.example.dontp.pets;


public class Pets {

    private int mascotaId;
    private String mascotaNombre;
    private int mascotaLike;

    public Pets(int mascotaId, String mascotaNombre, int mascotaLike) {
        this.mascotaId = mascotaId;
        this.mascotaNombre = mascotaNombre;
        this.mascotaLike = mascotaLike;
    }

    public int getMascotaId() {
        return mascotaId;
    }

    public void setMascotaId(int mascotaId) {
        this.mascotaId = mascotaId;
    }

    public String getMascotaNombre() {
        return mascotaNombre;
    }

    public void setMascotaNombre(String mascotaNombre) {
        this.mascotaNombre = mascotaNombre;
    }

    public int getMascotaLike() {
        return mascotaLike;
    }

    public void setMascotaLike(int mascotaLike) {
        this.mascotaLike = mascotaLike;
    }
}
