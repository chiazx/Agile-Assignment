/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author boonk
 */
public class ConsumerE {
    private static int nextNumber = 1000;
    private int num;
    private String custID;
    private String custName;
    private String custPhone;
    private String custAddress;
    
    public ConsumerE(String custID, String custName, String custPhone, String custAddress) {
        this.custID = custID;
        this.custName = custName;
        this.custPhone = custPhone;
        this.custAddress = custAddress;
        this.num=nextNumber++;
    }
    

    public ConsumerE() {
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

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
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
    ConsumerE.nextNumber = nextNumber;
  }
  public String toString() {
    return String.format("ID :%s  Name:%s  Contact Number:%s  Adress:%s",custID, custName,custPhone,custAddress) ;
  }
    
}
