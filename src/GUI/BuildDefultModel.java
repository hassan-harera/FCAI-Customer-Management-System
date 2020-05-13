package GUI;

import Collections.ArrayList;
import Customer.Customer;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class BuildDefultModel {

    public static DefaultTableModel buildTableModel(ArrayList<Customer> customerList, List<String> co) {
        Vector<String> v = new Vector<>(co);
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();

        if (customerList != null) {
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i) != null) {
                    Vector cur = customerList.get(i).getCustomerInfo();
                    if (cur != null) {
                        data.add(cur);
                    }
                }else {
                    break;
                }
            }
        }

        return new DefaultTableModel(data, v);
    }
}
