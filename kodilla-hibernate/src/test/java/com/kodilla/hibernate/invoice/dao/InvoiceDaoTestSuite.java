package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Jacket");
        Product product2 = new Product("T-shirt");
        Product product3 = new Product("Pants");
        Product product4 = new Product("Shoes");
        Product product5 = new Product("Cap");

        Item item1 = new Item(product1, new BigDecimal(299), 1, new BigDecimal(299));
        Item item2 = new Item(product2, new BigDecimal(59), 3, new BigDecimal(177));
        Item item3 = new Item(product2, new BigDecimal(59), 2, new BigDecimal(118));
        Item item4 = new Item(product3, new BigDecimal(120), 1, new BigDecimal(120));
        Item item5 = new Item(product4, new BigDecimal(250), 1, new BigDecimal(250));
        Item item6 = new Item(product5, new BigDecimal(49), 3, new BigDecimal(147));
        Item item7 = new Item(product1, new BigDecimal(299), 2, new BigDecimal(598));
        Item item8 = new Item(product2, new BigDecimal(59), 1, new BigDecimal(59));
        Item item9 = new Item(product4, new BigDecimal(250), 2, new BigDecimal(500));

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product2);
        item4.setProduct(product3);
        item5.setProduct(product4);
        item6.setProduct(product5);
        item7.setProduct(product1);
        item8.setProduct(product2);
        item9.setProduct(product4);

        product1.getItems().add(item1);
        product1.getItems().add(item7);
        product2.getItems().add(item2);
        product2.getItems().add(item3);
        product2.getItems().add(item8);
        product3.getItems().add(item4);
        product4.getItems().add(item5);
        product4.getItems().add(item9);
        product5.getItems().add(item6);

        Invoice invoice1 = new Invoice("1");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

        Invoice invoice2 = new Invoice("2");
        invoice2.getItems().add(item3);
        invoice2.getItems().add(item4);
        invoice2.getItems().add(item5);

        Invoice invoice3 = new Invoice("3");
        invoice3.getItems().add(item6);
        invoice3.getItems().add(item7);

        Invoice invoice4 = new Invoice("4");
        invoice4.getItems().add(item8);
        invoice4.getItems().add(item9);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice2);
        item4.setInvoice(invoice2);
        item5.setInvoice(invoice2);
        item6.setInvoice(invoice3);
        item7.setInvoice(invoice3);
        item8.setInvoice(invoice4);
        item9.setInvoice(invoice4);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();
        invoiceDao.save(invoice3);
        int invoice3Id = invoice3.getId();
        invoiceDao.save(invoice4);
        int invoice4Id = invoice4.getId();

        //Then
        assertNotEquals(0, invoice1Id);
        assertNotEquals(0, invoice2Id);
        assertNotEquals(0, invoice3Id);
        assertNotEquals(0, invoice4Id);

        //CleanUp
        invoiceDao.deleteById(invoice1Id);
        invoiceDao.deleteById(invoice2Id);
        invoiceDao.deleteById(invoice3Id);
        invoiceDao.deleteById(invoice4Id);
    }
}
