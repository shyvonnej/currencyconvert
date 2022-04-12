/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Transaction implements Currency,Customer{
	public String name;
	public String phone;
	public String ID;
	public String address;
	
        @Override
	public void setName(String name){
		this.name=name;
	}
        @Override
	public void setPhone(String phone){
		this.phone=phone;
	}
        @Override
	public void setID(String ID){
		this.ID=ID;
	}
        @Override
	public void setAddress(String address){
		this.address=address;
	}
        @Override
	public String getName(){
		return this.name;
	}
        @Override
	public String getPhone(){
		return this.phone;
	}
        @Override
	public String getID(){
		return this.ID;
	}
        @Override
	public String getAddress(){
		return this.address;
	}
	
	public String fromCurrency;
	public String toCurrency;
	public double conversionValue;
	public double convertedValue;
	public double convertedRate;
	
        @Override
	public void setFromCurrency(String fromCurrency){
		this.fromCurrency=fromCurrency;
	}
        @Override
	public void setToCurrency(String toCurrency){
		this.toCurrency=toCurrency;
	}
        @Override
	public void setConversionValue(double conversionValue){
		this.conversionValue=conversionValue;
	}
	public double setConvertedValue(){
		double rateTemp = setConvertedRate();
		return convertedValue = conversionValue * rateTemp;
	}
        @Override
	public double setConvertedRate(){
		double rate = 1.0;
		if(fromCurrency.equals("USD") && toCurrency.equals("RM")) {
			rate =  4.12;
		} 
		else if (fromCurrency.equals("USD") && toCurrency.equals("Rupiah")) {
			rate =  14255.05;
		} 
		else if (fromCurrency.equals("RM") && toCurrency.equals("USD")) {
			rate = 0.24;
		} 
		else if (fromCurrency.equals("RM") && toCurrency.equals("Rupiah")) {
			rate =  3456.19;
		}
		else if (fromCurrency.equals("Rupiah") && toCurrency.equals("USD")) {
			rate = 0.000070;
		} 
		else if (fromCurrency.equals("Rupiah") && toCurrency.equals("RM")) {
			rate = 0.00029;
		}
		return rate;
	}
        @Override
	public String getFromCurrency(){
		return this.fromCurrency;
	}
        @Override
	public String getToCurrency(){
		return this.toCurrency;
	}
        @Override
	public double getConversionValue(){
		return this.conversionValue;
	}
        @Override
	public double getConvertedValue(){
		return this.convertedValue;
	}
	public double getConvertedRate(){
		return this.convertedRate;
	}
	public Transaction(String name,String phone,String ID,String address,String fromCurrency,String toCurrency,double conversionValue){
	this.name=name;
	this.phone=phone;
	this.ID=ID;
	this.address=address;
	
	this.fromCurrency=fromCurrency;
	this.toCurrency=toCurrency;
	this.conversionValue=conversionValue;
	}
        @Override
	public String toString(){
		return ("Name : "+name+"\n"+
			"Phone Number : "+phone+"\n"+
			"IC/Passport : "+ID+"\n"+
			"Address: "+address+"\n\n"+
			"Transaction : "+fromCurrency+conversionValue+" to "+toCurrency+String.format("%.2f",setConvertedValue())		       
		);
	}

    @Override
    public double setConvertRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

