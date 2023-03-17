
package com.slivkin.project5;

public class IncomeDataImp implements IncomeData{

    private final String CountryCode;
    private final String Company;
    private final String ContactFirstName;
    private final String ContactLastName;
    private final int PhoneCode;
    private final long PhoneNumber;
    public IncomeDataImp(String CountryCode, 
                        String Company,
                        String ContactFirstName, 
                        String ContactLastName,
                        int PhoneCode,
                        long PhoneNumber){
        
    this.CountryCode = CountryCode;
    this.Company = Company;
    this.ContactFirstName = ContactFirstName;
    this.ContactLastName = ContactLastName; 
    this.PhoneCode = PhoneCode;
    this.PhoneNumber = PhoneNumber;
    }
    
    @Override
    public String getCountryCode() {
        return CountryCode;
      }

    @Override
    public String getCompany() {
        return Company;
        }

    @Override
    public String getContactFirtsName() {
        return ContactFirstName;
        
        }

    @Override
    public String getContactLastName() {
      return ContactLastName;
    }

    @Override
    public int getCountryPhoneCode() {
        return PhoneCode;
      }

    @Override
    public long getPhoneNumber() {
        return PhoneNumber;
       }
    
}
