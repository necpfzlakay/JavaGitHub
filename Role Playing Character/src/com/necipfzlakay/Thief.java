package com.necipfzlakay;

public class Thief {

    private String name = "Zaunite";
    private String gender = "Male";
    private String clas = "Thief";
    private String race = "dwarf";
    private int str = 9;
    private int dex = 16;
    private int con = 12;
    private int Int = 18;
    private int wis = 14;
    private int cha = 5;
    private int total;

    public Thief (String userName,int str,int dex, int con, int Int, int wis, int cha) {
        setName(userName);
        setStr(str);
        setDex(dex);
        setCon(con);
        setInt(Int);
        setWis(wis);
        setCha(cha);
        setTotal(str + dex + con + Int + wis + cha);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getInt() {
        return Int;
    }

    public void setInt(int anInt) {
        Int = anInt;
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
