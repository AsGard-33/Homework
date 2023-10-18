package de.ait.homework.homework37;

import java.util.List;

public class InventoryManagement {
   private List<MobilePhone> mobilePhoneList;

    public InventoryManagement() {
        this.mobilePhoneList = mobilePhoneList;
    }
     void addMobilePhone(MobilePhone phone){
        mobilePhoneList.add(phone);

     }
    public MobilePhone mobilePhoneListList(int id){
        for (MobilePhone phone : mobilePhoneList) {
            if (phone.getId() == id) {
                return phone;
            }
        }
        return null;
    }
    void updateMobilePhone(MobilePhone phone){
        for (int i = 0; i < mobilePhoneList.size(); i++) {
            if (mobilePhoneList.get(i).getId() == phone.getId()) {
                mobilePhoneList.set(i, phone);
                break;
            }
        }

    }
    void deleteMobilePhone(int id){
        MobilePhone toRemove = null;
        for (MobilePhone phone : mobilePhoneList) {
            if (phone.getId() == id) {
                toRemove = phone;
                break;
            }
        }
        if (toRemove != null) {
            mobilePhoneList.remove(toRemove);
        }

    }
    public List<MobilePhone> mobilePhoneList1(){
        return mobilePhoneList;

    }
}
