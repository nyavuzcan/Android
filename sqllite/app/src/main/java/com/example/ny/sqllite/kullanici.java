package com.example.ny.sqllite;

/**
 * Created by NY on 7.03.2018.
 */

public class kullanici {


        String isim;
        int id;

    public String getIsim() {
        return isim;
    }

    public kullanici(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString(){
        return ""+id+"-"+isim;
    }
}
