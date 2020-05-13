package Collections;

import Customer.Customer;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList<Type extends Customer> {

    private Type[] arrayList;
    private int curr;

    public ArrayList(Class<Customer> c) {
        arrayList = (Type[]) Array.newInstance(c, 1);
        curr = 0;
    }

    public ArrayList(Class<Customer> c, int n) {
        arrayList = (Type[]) Array.newInstance(c, n);
        curr = 0;
    }

    public void add(Type value) {
        if (isFull()) {
            AddSize();
        }

        arrayList[curr] = value;
        curr++;
    }

    private Boolean isEmpty() {
        return curr <= 0;
    }

    private Boolean isFull() {
        return curr >= arrayList.length;
    }

    private void AddSize() {
        Type[] newArrayList = Arrays.copyOf(arrayList, arrayList.length * 2);
        arrayList = newArrayList;
    }

    public Boolean delete(int index) {
        if (index < 0 || index >= arrayList.length) {
            return false;
        }

        if (isEmpty()) {
            return false;
        }
        int i;
        for (i = index; i < arrayList.length - 1; i++) {
            if (arrayList[i] == null) {
                break;
            }
            arrayList[i] = arrayList[i + 1];
        }
        arrayList[i - 1] = null;
        --curr;
        return true;
    }

    public Boolean delete(Customer t) {
        if (isEmpty()) {
            return false;
        }

        Boolean flag = false;
        for (int i = 0; i < arrayList.length; i++) {
            if (get(i).id == t.id) {
                delete(i);
                return true;
            }
        }

        return true;
    }

    public Customer get(int index) {
        if (arrayList[index] == null) {
            return null;
        }

        return arrayList[index];
    }

    public void printArrayList() {
        for (Customer type : arrayList) {
            if (type == null) {
                break;
            }
            System.out.println(type.id);
        }
    }

    public int size() {
        return arrayList.length;
    }

//    public void heapSortId() {
//        int n = arrayList.length;
//        for (int i = (n / 2) - 1; i >= 0; i--) {
//            sort(arrayList, n, i);
//        }
//        for (int i = n - 1; i > 0; i--) {
//            Type temp = arrayList[0];
//            arrayList[0] = arrayList[i];
//            arrayList[i] = temp;
//
//            sort(arrayList, i, 0);
//        }
//    }
//
//    private Customer[] sort(Customer[] arrayList, int n, int i) {
//        int large = i;
//        int left = large * 2 + 1;
//        int right = large * 2 + 2;
//
//        if (left < n) {
//            if (arrayList[left] == null) {
//                large = left;
//            } else if (arrayList[large] != null && arrayList[left].id > arrayList[large].id) {
//                large = left;
//            }
//        }
//
//        if (right < n) {
//            if (arrayList[right] == null) {
//                large = right;
//            } else if (arrayList[large] != null && arrayList[right].id > arrayList[large].id) {
//                large = right;
//            }
//        }
//
//        if (large != i) {
//            Customer temp = arrayList[i];
//            arrayList[i] = arrayList[large];
//            arrayList[large] = temp;
//            sort(arrayList, n, large);
//        }
//        return arrayList;
//    }
    public void heapSortName() {
        int n = arrayList.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            sortName(arrayList, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            Type temp = arrayList[0];
            arrayList[0] = arrayList[i];
            arrayList[i] = temp;

            sortName(arrayList, i, 0);
        }
    }

    private void sortName(Customer[] arrayList, int n, int i) {
        int large = i;
        int left = large * 2 + 1;
        int right = large * 2 + 2;

        if (left < n) {
            if (arrayList[left] == null) {
                large = left;
            } else if (arrayList[large] != null && arrayList[left] != null) {
                for (int j = 0, k = 0; j < arrayList[left].name.length() && k < arrayList[large].name.length(); j++, k++) {
                    if (arrayList[left].name.charAt(j) > arrayList[large].name.charAt(k)) {
                        large = left;
                        break;
                    } else if (arrayList[left].name.charAt(j) < arrayList[large].name.charAt(k)) {
                        break;
                    }
                }
            }
        }

        if (right < n) {
            if (arrayList[right] == null) {
                large = right;
            } else if (arrayList[large] != null && arrayList[right] != null) {
                for (int j = 0, k = 0; j < arrayList[right].name.length() && k < arrayList[large].name.length(); j++, k++) {
                    if (arrayList[right].name.charAt(j) > arrayList[large].name.charAt(k)) {
                        large = right;
                        break;
                    } else if (arrayList[right].name.charAt(j) < arrayList[large].name.charAt(k)) {
                        break;
                    }
                }
            }
        }

        if (large != i) {
            Customer temp = arrayList[i];
            arrayList[i] = arrayList[large];
            arrayList[large] = temp;
            sortName(arrayList, n, large);
        }
    }

    public ArrayList<Type> searchId(int val) {
        return binarySearchId(val, 0, arrayList.length - 1, new ArrayList(Customer.class));
    }

    public ArrayList<Type> binarySearchId(int val, int start, int end, ArrayList<Type> list) {
        if (start == end && (arrayList[start] == null || arrayList[start].id != val)) {
            return null;
        }

        int mid = (start + end) / 2;

        if (arrayList[mid] != null && val > arrayList[mid].id) {
            return binarySearchId(val, mid + 1, end, list);
        } else if (arrayList[mid] != null && val < arrayList[mid].id) {
            return binarySearchId(val, start, mid, list);
        } else if (arrayList[mid] != null && val == arrayList[mid].id) {
            list.add(arrayList[mid]);
            return list;
        }

        return null;
    }

    public ArrayList<Type> searchPhone(int val) {

        return binarySearchPhone(val, 0, arrayList.length - 1, new ArrayList(Customer.class));

    }

    public ArrayList<Type> binarySearchPhone(int val, int start, int end, ArrayList<Type> list) {
        if (start == end && arrayList[start].phone != val) {
            return null;
        }

        int mid = (start + end) / 2;

        if (arrayList[mid] != null && val > arrayList[mid].phone) {
            return binarySearchId(val, mid + 1, end, list);
        } else if (arrayList[mid] != null && val < arrayList[mid].phone) {
            return binarySearchId(val, start, mid, list);
        } else if (arrayList[mid] != null && val == arrayList[mid].phone) {
            list.add(arrayList[mid]);
            return list;
        }
        return null;
    }
}
