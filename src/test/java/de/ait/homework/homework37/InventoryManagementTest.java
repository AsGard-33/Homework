package de.ait.homework.homework37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryManagementTest {
    private InventoryManagement inventory;
    private MobilePhone phone1;
    private MobilePhone phone2;

    @BeforeEach
    void setUp() {
        inventory = new InventoryManagement();

    }

    @Test
    void testAddMobilePhone() {
        phone1 = new MobilePhone(1, "Samsung", "Galaxy S20", "Android", 999.99);
        phone2 = new MobilePhone(2, "Apple", "iPhone 12", "iOS", 1099.99);
        inventory.addMobilePhone(phone1);
        assertEquals(1, inventory.mobilePhoneList1().size());
    }

    @Test
    void testGetMobilePhone() {

    }

    @Test
    void testUpdateMobilePhone() {



        @Test
    void testDeleteMobilePhone () {

        }

    @Test
    void testListMobilePhones() {

    }
}