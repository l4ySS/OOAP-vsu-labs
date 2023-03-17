package com.slivkin.project5;

import java.util.Map;
import java.util.HashMap;


public class IncomeDataAdapter implements Customer, Contact {
    private IncomeData data;
    private Map<String, String> contries = new HashMap<String, String>();

    public IncomeDataAdapter(IncomeData data, Map map){
        this.data = data;
        this.contries = map;
    }
    @Override
    public String getCompanyName() {
        return data.getCompany();
    }

    @Override
    public String getCountryName() {
       return contries.get(data.getCountryCode());
    }

    @Override
    public String getName() {
        return data.getContactLastName() + ", " + data.getContactFirtsName();
    }

    @Override
    public String getPhoneNumber() {
        String str = "+";
        str += data.getCountryPhoneCode();
        str += "(";
        String number = Long.toString(data.getPhoneNumber());
        
        while (number.length() < 10)
            number = "0" + number;
        
        str += number.substring(0, 3);
        str += ")";
        str += number.substring(3, 6);
        str += "-";
        str += number.substring(6, 8);
        str += "-";
        str += number.substring(8, 10);
        return str;
    }
    
    
    
}
