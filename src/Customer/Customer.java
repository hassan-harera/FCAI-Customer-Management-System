package Customer;

import java.util.Vector;

public class Customer implements Comparable<Customer> {

    public int id, currenBillAmount, accumulatedBill, phone;
    public String name, nationality;

    public Customer(int id, int currenBillAmount, int accumulatedBill, int phone, String name, String nationality) {
        this.id = id;
        this.currenBillAmount = currenBillAmount;
        this.accumulatedBill = accumulatedBill;
        this.phone = phone;
        this.name = name;
        this.nationality = nationality;
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Customer o) {
        return id = o.id;
    }

    public Vector<Object> getCustomerInfo() {
        if(name == null){
            return null;
        }
        
        Vector<Object> ret = new Vector();
        
        ret.add(id);
        ret.add(name);
        ret.add(nationality);
        ret.add("0"+phone);
        ret.add(currenBillAmount);
        ret.add(accumulatedBill);
        
        return ret;
    }
}
