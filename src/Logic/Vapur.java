/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Cengizhan
 */
public class Vapur extends Bakiye {
     private double ücret;

    public Vapur( double bakiye,double ücret) {
        super(bakiye);
        this.ücret = ücret;
    }

   
    public double getHesaplama()
    {
        bakiye = bakiye - ücret;
        return bakiye ;
    }
}
