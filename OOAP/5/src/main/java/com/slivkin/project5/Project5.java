package com.slivkin.project5;
import java.util.Map;
import java.util.HashMap;

public class Project5 {
    public static Map<String, String> contries = new HashMap<String, String>();
    
    
    public static void main(String[] args) {
        contries.put("RU", "Russia");
        contries.put("BY", "Belarus");
        contries.put("UA", "Ukraine");
        contries.put("KZ", "Kazakhstan");
        
        IncomeData data1 = new IncomeDataImp("RU", 
                                             "RELEX",
                                             "Ivan", 
                                             "Ivanov",
                                              7,
                                              9518743228L);
        
        Contact cont = new IncomeDataAdapter(data1, contries);
        System.out.println(cont.getName());
        System.out.println(cont.getPhoneNumber());
        
        Customer cust = new IncomeDataAdapter(data1, contries);
        System.out.println(cust.getCompanyName());
        System.out.println(cust.getCountryName());
        
        IncomeData data2 = new IncomeDataImp("RU", 
                                             "RELEX",
                                             "Mark", 
                                             "Ivanov",
                                              7,
                                              9743228L);
         
        cont = new IncomeDataAdapter(data2, contries);
        System.out.println(cont.getName());
        System.out.println(cont.getPhoneNumber());
        
    }
    
    
}
