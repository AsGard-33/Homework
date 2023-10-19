package de.ait.homework.homework37;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InventoryManagement {
    private List<MobilePhone> mobilePhoneList;

    public InventoryManagement() {
        this.mobilePhoneList = new ArrayList<>();
    }

    public boolean addMobilePhone(MobilePhone phone) {
        return mobilePhoneList.add(phone);
    }

    public MobilePhone getMobilePhone(UUID id) {
        for (MobilePhone phone : mobilePhoneList) {
            if (phone.getId().equals(id)) {
                return phone;
            }
        }
        return null;
    }

    public void updateMobilePhone(UUID id, MobilePhone phone) {
        for (int i = 0; i < mobilePhoneList.size(); i++) {
            if (mobilePhoneList.get(i).getId().equals(id)) {
                mobilePhoneList.set(i, phone);
                break;
            }
        }
    }

    public boolean deleteMobilePhone(UUID id) {
        for (MobilePhone phone : mobilePhoneList) {
            if (phone.getId().equals(id)) {
                return mobilePhoneList.remove(phone);
            }
        }
        return false;
    }

    public List<MobilePhone> listMobilePhones() {
        return mobilePhoneList;
    }
}