/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_2_1;
import java.io.Serializable;
/**
 *
 * @author ad
 */
public class PhanSo implements Serializable {
    int tu;
    int mau;
    public PhanSo()
    {
        tu = 0; mau= 1;
    }
    public PhanSo(int t, int m)
    {
        tu = t; mau= m;
    }
    public PhanSo sum(PhanSo b)
    {
        PhanSo c= new PhanSo();
        c.setTu(tu*b.getMau()+ b.getTu()*mau);
        c.setMau(mau*b.getMau());
        return c;
    }
    
    public void setTu(int t)
    {
        tu = t;
    }
    public void setMau(int m)
    {
        mau = m;
    }
    public int getTu()
    {
        return tu;
    }
    public int getMau()
    {
        return mau;
    }
}
