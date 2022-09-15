/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2_bai3;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class PhanSo implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(PhanSo.class.getName());

    private int tuso;
    private int mauso;

    public PhanSo() {
        tuso = (int) (Math.random() * 100);
        do {
            mauso = (int) (Math.random() * 90 + 1);
        } while (mauso == 0);
    }

    public PhanSo(int tuso, int mauso) {
        this.tuso = tuso;
        if (mauso == 0) {
            mauso = 1;
        } else {
            this.mauso = mauso;
        }
    }

    public String toString() {
         if (this.mauso == 1) {
            return String.valueOf(this.tuso);
        } else {
            return this.tuso + "/" + this.mauso;
        }
    }

    public int getTuso() {
        return tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public boolean ktNguyenTo() {
        if (mauso < 1) {
            return false;
        }
        int t = (int) (Math.sqrt(mauso));
        for (int i = 0; i <= t; i++) {
            if (mauso % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public PhanSo toPhanSo(String strPS) {
        String x = "";
        for (int index = 0; index < strPS.length(); index++) {
            if (strPS.charAt(index) != '/') {
                x += strPS.charAt(index);
            } else {
                this.tuso = Integer.parseInt(x);
                x = "";
            }
        }
        try {
            this.mauso = Integer.parseInt(x);
        } catch (NumberFormatException e) {
             this.mauso = 1;
        }
        return this;
    }
    
}
