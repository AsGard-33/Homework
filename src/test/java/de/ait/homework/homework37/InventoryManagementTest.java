package de.ait.homework.homework37;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class InventoryManagementTest {
    private InventoryManagement inventory;
    private MobilePhone phone1;
    private MobilePhone phone2;

    @BeforeEach
    void setUp() {
        inventory = new InventoryManagement();
        phone1 = new MobilePhone("Samsung", "Galaxy S20", "Android", 999.99);
        phone2 = new MobilePhone("Apple", "iPhone 12", "iOS", 1099.99);
    }

    @Test
    void testAddMobilePhone() {
        assertTrue(inventory.addMobilePhone(phone1));
        assertEquals(1, inventory.listMobilePhones().size());
    }

    @Test
    void testGetMobilePhone() {
        inventory.addMobilePhone(phone1);
        UUID idSearchMobilephone = phone1.getId();
        Assertions.assertEquals(phone1, inventory.getMobilePhone(idSearchMobilephone));
    }

    @Test
    void testUpdateMobilePhone() {
        inventory.addMobilePhone(phone1);
        phone1.setPrice(1000);
        UUID id = phone1.getId();
        inventory.updateMobilePhone(phone1.getId(), phone1);
        MobilePhone result = inventory.getMobilePhone(id);
        Assertions.assertEquals(1000, result.getPrice());
    }

    @Test
    void testDeleteMobilePhone() {
        inventory.addMobilePhone(phone1);
        inventory.addMobilePhone(phone2);
        UUID idSearchPhone = phone1.getId();
        Assertions.assertTrue(inventory.deleteMobilePhone(idSearchPhone));
        assertNull(inventory.getMobilePhone(idSearchPhone));
    }

    @Test
    void testListMobilePhones() {
        inventory.addMobilePhone(phone1);
        inventory.addMobilePhone(phone2);
        assertEquals(2, inventory.listMobilePhones().size());
        assertTrue(inventory.listMobilePhones().contains(phone1));
        assertTrue(inventory.listMobilePhones().contains(phone2));
    }
}