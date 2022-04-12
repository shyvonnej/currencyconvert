/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public interface Currency {
    
    public void setFromCurrency(String c);
    public void setToCurrency(String c);
    public void setConversionValue(double d);
    public abstract double setConvertedRate();
    public abstract double setConvertRate();
    
    public String getFromCurrency();
    public String getToCurrency();
    public double getConversionValue();
    public double getConvertedValue();
    
    @Override
    public abstract String toString();
    
}
