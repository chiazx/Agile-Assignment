/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author zxchia
 */
public class CooperateE {
    private static int nextNumber = 1000;
    private int num;
    private String custID;
    private String custName;
    private String custPhone;
    private double custLimit;
    private String custAddress;
    
    public CooperateE(String custID, String custName, String custPhone,double custLimit ,String custAddress) {
        this.custID = custID;
        this.custName = custName;
        this.custPhone = custPhone;
        this.custLimit= custLimit;
        this.custAddress = custAddress;
        this.num=nextNumber++;
    }

    public CooperateE() {
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
    public double getCustLimit(){
        return custLimit;
    }

    public void setCustLimit(double CustLimit) {
        this.custLimit = custLimit;
    }

  
     public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }
        public int getNumber() {
    return num;
  }

  public void setNumber(int number) {
    this.num = number;
  }

  public static int getNextNumber() {
    return nextNumber;
  }

  public static void setNextNumber(int nextNumber) {
    CooperateE.nextNumber = nextNumber;
  }
  public String toString() {
    return String.format("ID :%s  Name:%s  Contact Number:%s Monthly Credit Limit:RM%.2f  Adress:%s",custID, custName,custPhone,custLimit,custAddress) ;
  }
}
