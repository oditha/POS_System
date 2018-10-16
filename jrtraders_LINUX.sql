/*
Navicat MySQL Data Transfer

Source Server         : mydb
Source Server Version : 100121
Source Host           : localhost:3306
Source Database       : jrtraders

Target Server Type    : MYSQL
Target Server Version : 100121
File Encoding         : 65001

Date: 2018-04-04 15:53:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for Brands
-- ----------------------------
DROP TABLE IF EXISTS `Brands`;
CREATE TABLE `Brands` (
  `idBrands` int(11) NOT NULL AUTO_INCREMENT,
  `BrandName` varchar(45) DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idBrands`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for CashBook
-- ----------------------------
DROP TABLE IF EXISTS `CashBook`;
CREATE TABLE `CashBook` (
  `idCashBook` int(11) NOT NULL AUTO_INCREMENT,
  `Credit` double DEFAULT NULL,
  `Debit` double DEFAULT NULL,
  `CBDate` varchar(10) DEFAULT NULL,
  `Descriotion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCashBook`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Catogory
-- ----------------------------
DROP TABLE IF EXISTS `Catogory`;
CREATE TABLE `Catogory` (
  `idCatogory` int(11) NOT NULL AUTO_INCREMENT,
  `CatogoryCode` varchar(45) DEFAULT NULL,
  `CatogoryName` varchar(45) DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCatogory`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Customers
-- ----------------------------
DROP TABLE IF EXISTS `Customers`;
CREATE TABLE `Customers` (
  `idCustomers` int(11) NOT NULL AUTO_INCREMENT,
  `CustomersNIC` varchar(45) DEFAULT NULL,
  `CustomerscolName` varchar(45) DEFAULT NULL,
  `CustomersAddress1` varchar(45) DEFAULT NULL,
  `CustomersAddress2` varchar(45) DEFAULT NULL,
  `CustomersCity` varchar(45) DEFAULT NULL,
  `CustomersContactNo` varchar(45) DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCustomers`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Customers_has_InvoiceReturn
-- ----------------------------
DROP TABLE IF EXISTS `Customers_has_InvoiceReturn`;
CREATE TABLE `Customers_has_InvoiceReturn` (
  `idCustomers` int(11) NOT NULL,
  `idInvoiceReturn` int(11) NOT NULL,
  `IdRecord` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdRecord`),
  KEY `fk_Customers_has_InvoiceReturn_InvoiceReturn1_idx` (`idInvoiceReturn`),
  KEY `fk_Customers_has_InvoiceReturn_Customers1_idx` (`idCustomers`),
  CONSTRAINT `fk_Customers_has_InvoiceReturn_Customers1` FOREIGN KEY (`idCustomers`) REFERENCES `Customers` (`idCustomers`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Customers_has_InvoiceReturn_InvoiceReturn1` FOREIGN KEY (`idInvoiceReturn`) REFERENCES `InvoiceReturn` (`idInvoiceReturn`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for GRN
-- ----------------------------
DROP TABLE IF EXISTS `GRN`;
CREATE TABLE `GRN` (
  `idGRN` int(11) NOT NULL AUTO_INCREMENT,
  `GRNNO` varchar(45) DEFAULT NULL,
  `GRNDate` varchar(10) DEFAULT NULL,
  `SubTotal` double DEFAULT NULL,
  `Discount` double DEFAULT NULL,
  `NettTotal` double DEFAULT NULL,
  `idSupplier` int(11) NOT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `photo` longtext,
  PRIMARY KEY (`idGRN`),
  KEY `fk_GRN_Supplier1_idx` (`idSupplier`),
  CONSTRAINT `fk_GRN_Supplier1` FOREIGN KEY (`idSupplier`) REFERENCES `Supplier` (`idSupplier`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for GRNItem
-- ----------------------------
DROP TABLE IF EXISTS `GRNItem`;
CREATE TABLE `GRNItem` (
  `idGRNItem` int(11) NOT NULL AUTO_INCREMENT,
  `idGRN` int(11) NOT NULL,
  `QTY` int(11) DEFAULT NULL,
  `GrossPrice` double DEFAULT NULL,
  `Total` double DEFAULT NULL,
  `idItem` int(11) NOT NULL,
  PRIMARY KEY (`idGRNItem`),
  KEY `fk_GRNItem_GRN1_idx` (`idGRN`),
  KEY `fk_GRNItem_Item1_idx` (`idItem`),
  CONSTRAINT `fk_GRNItem_GRN1` FOREIGN KEY (`idGRN`) REFERENCES `GRN` (`idGRN`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_GRNItem_Item1` FOREIGN KEY (`idItem`) REFERENCES `Item` (`idItem`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for GRNPayments
-- ----------------------------
DROP TABLE IF EXISTS `GRNPayments`;
CREATE TABLE `GRNPayments` (
  `idGRNPayment` int(11) NOT NULL AUTO_INCREMENT,
  `PaymentDate` varchar(10) DEFAULT NULL,
  `Amount` double DEFAULT NULL,
  `PaymentType` varchar(45) DEFAULT NULL,
  `idSupplier` int(11) NOT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `idGRN` int(11) NOT NULL,
  PRIMARY KEY (`idGRNPayment`),
  KEY `fk_GRNPayments_Supplier1_idx` (`idSupplier`),
  KEY `fk_GRNPayments_GRN1_idx` (`idGRN`),
  CONSTRAINT `fk_GRNPayments_GRN1` FOREIGN KEY (`idGRN`) REFERENCES `GRN` (`idGRN`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_GRNPayments_Supplier1` FOREIGN KEY (`idSupplier`) REFERENCES `Supplier` (`idSupplier`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Invoice
-- ----------------------------
DROP TABLE IF EXISTS `Invoice`;
CREATE TABLE `Invoice` (
  `idInvoice` int(11) NOT NULL AUTO_INCREMENT,
  `InvoiceNo` varchar(45) DEFAULT NULL,
  `InvoiceDate` varchar(10) DEFAULT NULL,
  `SubTotal` double DEFAULT NULL,
  `Discount` double DEFAULT NULL,
  `NettTotal` double DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `CreatedBy` varchar(45) DEFAULT NULL,
  `Paid` double(255,0) DEFAULT NULL,
  `Balance` double(255,0) DEFAULT NULL,
  PRIMARY KEY (`idInvoice`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Invoice_has_Customers
-- ----------------------------
DROP TABLE IF EXISTS `Invoice_has_Customers`;
CREATE TABLE `Invoice_has_Customers` (
  `Invoice_idInvoice` int(11) NOT NULL,
  `Customers_idCustomers` int(11) NOT NULL,
  `idIHC` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idIHC`),
  KEY `fk_Invoice_has_Customers_Customers1_idx` (`Customers_idCustomers`),
  KEY `fk_Invoice_has_Customers_Invoice1_idx` (`Invoice_idInvoice`),
  CONSTRAINT `fk_Invoice_has_Customers_Customers1` FOREIGN KEY (`Customers_idCustomers`) REFERENCES `Customers` (`idCustomers`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Invoice_has_Customers_Invoice1` FOREIGN KEY (`Invoice_idInvoice`) REFERENCES `Invoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for InvoiceItem
-- ----------------------------
DROP TABLE IF EXISTS `InvoiceItem`;
CREATE TABLE `InvoiceItem` (
  `idInvoiceItem` int(11) NOT NULL AUTO_INCREMENT,
  `IidInvoice` int(11) NOT NULL,
  `idItem` int(11) NOT NULL,
  `QTY` int(11) DEFAULT NULL,
  `UnitPrice` double DEFAULT NULL,
  `Discount` double DEFAULT NULL,
  `NettTotalITM` double DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `Warranry` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idInvoiceItem`),
  KEY `fk_InvoiceItem_Invoice1_idx` (`IidInvoice`),
  KEY `fk_InvoiceItem_Item1_idx` (`idItem`),
  CONSTRAINT `fk_InvoiceItem_Invoice1` FOREIGN KEY (`IidInvoice`) REFERENCES `Invoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_InvoiceItem_Item1` FOREIGN KEY (`idItem`) REFERENCES `Item` (`idItem`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for InvoicePayments
-- ----------------------------
DROP TABLE IF EXISTS `InvoicePayments`;
CREATE TABLE `InvoicePayments` (
  `idInvoicePayment` int(11) NOT NULL AUTO_INCREMENT,
  `PaymentDate` varchar(10) DEFAULT NULL,
  `Amount` double DEFAULT NULL,
  `PaymentType` varchar(45) DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `idCustomers` int(11) NOT NULL,
  `idInvoice` int(11) NOT NULL,
  PRIMARY KEY (`idInvoicePayment`),
  KEY `fk_InvoicePayments_Customers1_idx` (`idCustomers`),
  KEY `fk_InvoicePayments_Invoice1_idx` (`idInvoice`),
  CONSTRAINT `fk_InvoicePayments_Customers1` FOREIGN KEY (`idCustomers`) REFERENCES `Customers` (`idCustomers`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_InvoicePayments_Invoice1` FOREIGN KEY (`idInvoice`) REFERENCES `Invoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for InvoiceReturn
-- ----------------------------
DROP TABLE IF EXISTS `InvoiceReturn`;
CREATE TABLE `InvoiceReturn` (
  `idInvoiceReturn` int(11) NOT NULL AUTO_INCREMENT,
  `idInvoice` int(11) NOT NULL,
  `RetuenDate` varchar(45) DEFAULT NULL,
  `idInvoiceItem` int(11) NOT NULL,
  `ReturnQty` double DEFAULT NULL,
  `ItemSerial` varchar(45) DEFAULT NULL,
  `Term` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `ItemCondition` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idInvoiceReturn`),
  KEY `fk_InvoiceReturn_Invoice1_idx` (`idInvoice`),
  KEY `fk_InvoiceReturn_InvoiceItem1_idx` (`idInvoiceItem`),
  CONSTRAINT `fk_InvoiceReturn_Invoice1` FOREIGN KEY (`idInvoice`) REFERENCES `Invoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_InvoiceReturn_InvoiceItem1` FOREIGN KEY (`idInvoiceItem`) REFERENCES `InvoiceItem` (`idInvoiceItem`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Item
-- ----------------------------
DROP TABLE IF EXISTS `Item`;
CREATE TABLE `Item` (
  `idItem` int(11) NOT NULL AUTO_INCREMENT,
  `ItemCode` varchar(45) DEFAULT NULL,
  `iItemName` varchar(45) DEFAULT NULL,
  `idCatogory` int(11) NOT NULL,
  `idBrands` int(11) NOT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `Descriotion` mediumtext,
  `Unit` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idItem`),
  KEY `fk_Item_Catogory_idx` (`idCatogory`),
  KEY `fk_Item_Brands1_idx` (`idBrands`),
  CONSTRAINT `fk_Item_Brands1` FOREIGN KEY (`idBrands`) REFERENCES `Brands` (`idBrands`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Item_Catogory` FOREIGN KEY (`idCatogory`) REFERENCES `Catogory` (`idCatogory`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ItemPrices
-- ----------------------------
DROP TABLE IF EXISTS `ItemPrices`;
CREATE TABLE `ItemPrices` (
  `idItemPrices` int(11) NOT NULL AUTO_INCREMENT,
  `idItem` int(11) NOT NULL,
  `GrossPrice` double DEFAULT NULL,
  `NettPrice` double DEFAULT NULL,
  `minPrice` double DEFAULT NULL,
  `SupWarrenty` varchar(45) DEFAULT NULL,
  `SelelrWarrenty` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idItemPrices`),
  KEY `fk_ItemPrices_Item1_idx` (`idItem`),
  CONSTRAINT `fk_ItemPrices_Item1` FOREIGN KEY (`idItem`) REFERENCES `Item` (`idItem`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ItemSereal
-- ----------------------------
DROP TABLE IF EXISTS `ItemSereal`;
CREATE TABLE `ItemSereal` (
  `idItemSereal` int(11) NOT NULL AUTO_INCREMENT,
  `SerealNo` varchar(45) DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `idSupplier` int(11) NOT NULL,
  `idGRN` int(11) NOT NULL,
  `idItem` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idItemSereal`),
  KEY `fk_ItemSereal_Supplier2_idx` (`idSupplier`),
  KEY `fk_ItemSereal_GRN1_idx` (`idGRN`),
  KEY `fk_ItemSereal_Item1_idx` (`idItem`),
  CONSTRAINT `fk_ItemSereal_GRN1` FOREIGN KEY (`idGRN`) REFERENCES `GRN` (`idGRN`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ItemSereal_Item1` FOREIGN KEY (`idItem`) REFERENCES `Item` (`idItem`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ItemSereal_Supplier2` FOREIGN KEY (`idSupplier`) REFERENCES `Supplier` (`idSupplier`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ItemSereal_has_InvoiceItem
-- ----------------------------
DROP TABLE IF EXISTS `ItemSereal_has_InvoiceItem`;
CREATE TABLE `ItemSereal_has_InvoiceItem` (
  `IdRecord` int(11) NOT NULL AUTO_INCREMENT,
  `idItemSereal` int(11) NOT NULL,
  `idInvoiceItem` int(11) NOT NULL,
  PRIMARY KEY (`IdRecord`),
  KEY `fk_ItemSereal_has_InvoiceItem_InvoiceItem1_idx` (`idInvoiceItem`),
  KEY `fk_ItemSereal_has_InvoiceItem_ItemSereal1_idx` (`idItemSereal`),
  CONSTRAINT `fk_ItemSereal_has_InvoiceItem_InvoiceItem1` FOREIGN KEY (`idInvoiceItem`) REFERENCES `InvoiceItem` (`idInvoiceItem`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ItemSereal_has_InvoiceItem_ItemSereal1` FOREIGN KEY (`idItemSereal`) REFERENCES `ItemSereal` (`idItemSereal`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Stock
-- ----------------------------
DROP TABLE IF EXISTS `Stock`;
CREATE TABLE `Stock` (
  `idStock` int(11) NOT NULL AUTO_INCREMENT,
  `idItem` int(11) NOT NULL,
  `QTY` double DEFAULT NULL,
  PRIMARY KEY (`idStock`),
  KEY `fk_Stock_Item1_idx` (`idItem`),
  CONSTRAINT `fk_Stock_Item1` FOREIGN KEY (`idItem`) REFERENCES `Item` (`idItem`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Supplier
-- ----------------------------
DROP TABLE IF EXISTS `Supplier`;
CREATE TABLE `Supplier` (
  `idSupplier` int(11) NOT NULL AUTO_INCREMENT,
  `SupplierCode` varchar(45) DEFAULT NULL,
  `SupplierName` varchar(45) DEFAULT NULL,
  `SupplierAddress1` varchar(45) DEFAULT NULL,
  `SupplierAddress2` varchar(45) DEFAULT NULL,
  `SupplierCity` varchar(45) DEFAULT NULL,
  `SupplierContactNo1` varchar(45) DEFAULT NULL,
  `SupplierContactNo2` varchar(45) DEFAULT NULL,
  `supplierEmail` varchar(45) DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idSupplier`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for SupplierInvoice
-- ----------------------------
DROP TABLE IF EXISTS `SupplierInvoice`;
CREATE TABLE `SupplierInvoice` (
  `idInvoice` int(11) NOT NULL AUTO_INCREMENT,
  `InvoiceNo` varchar(45) DEFAULT NULL,
  `InvoiceDate` varchar(10) DEFAULT NULL,
  `SubTotal` double DEFAULT NULL,
  `Discount` double DEFAULT NULL,
  `NettTotal` double DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `CreatedBy` varchar(45) DEFAULT NULL,
  `idSupplier` int(11) NOT NULL,
  PRIMARY KEY (`idInvoice`),
  KEY `fk_SupplierInvoice_Supplier1_idx` (`idSupplier`),
  CONSTRAINT `fk_SupplierInvoice_Supplier1` FOREIGN KEY (`idSupplier`) REFERENCES `Supplier` (`idSupplier`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for SupplierInvoiceItem
-- ----------------------------
DROP TABLE IF EXISTS `SupplierInvoiceItem`;
CREATE TABLE `SupplierInvoiceItem` (
  `idInvoiceItem` int(11) NOT NULL AUTO_INCREMENT,
  `idItem` int(11) NOT NULL,
  `QTY` int(11) DEFAULT NULL,
  `UnitPrice` double DEFAULT NULL,
  `Discount` double DEFAULT NULL,
  `NettTotalITM` double DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `idInvoice` int(11) NOT NULL,
  `Warranry` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idInvoiceItem`),
  KEY `fk_InvoiceItem_Item1_idx` (`idItem`),
  KEY `fk_SupplierInvoiceItem_SupplierInvoice2_idx` (`idInvoice`),
  CONSTRAINT `fk_InvoiceItem_Item11` FOREIGN KEY (`idItem`) REFERENCES `Item` (`idItem`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_SupplierInvoiceItem_SupplierInvoice2` FOREIGN KEY (`idInvoice`) REFERENCES `SupplierInvoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for SupplierInvoiceItem_has_ItemSereal
-- ----------------------------
DROP TABLE IF EXISTS `SupplierInvoiceItem_has_ItemSereal`;
CREATE TABLE `SupplierInvoiceItem_has_ItemSereal` (
  `IdRecord` int(11) NOT NULL AUTO_INCREMENT,
  `idInvoiceItem` int(11) NOT NULL,
  `idItemSereal` int(11) NOT NULL,
  PRIMARY KEY (`IdRecord`),
  KEY `fk_SupplierInvoiceItem_has_ItemSereal_ItemSereal1_idx` (`idItemSereal`),
  KEY `fk_SupplierInvoiceItem_has_ItemSereal_SupplierInvoiceItem1_idx` (`idInvoiceItem`),
  CONSTRAINT `fk_SupplierInvoiceItem_has_ItemSereal_ItemSereal1` FOREIGN KEY (`idItemSereal`) REFERENCES `ItemSereal` (`idItemSereal`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_SupplierInvoiceItem_has_ItemSereal_SupplierInvoiceItem1` FOREIGN KEY (`idInvoiceItem`) REFERENCES `SupplierInvoiceItem` (`idInvoiceItem`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for SupplierInvoicePayments
-- ----------------------------
DROP TABLE IF EXISTS `SupplierInvoicePayments`;
CREATE TABLE `SupplierInvoicePayments` (
  `idInvoicePayment` int(11) NOT NULL AUTO_INCREMENT,
  `PaymentDate` varchar(10) DEFAULT NULL,
  `Amount` double DEFAULT NULL,
  `PaymentType` varchar(45) DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `idSupplier` int(11) NOT NULL,
  `idInvoice` int(11) NOT NULL,
  PRIMARY KEY (`idInvoicePayment`),
  KEY `fk_SupplierInvoicePayments_Supplier1_idx` (`idSupplier`),
  KEY `fk_SupplierInvoicePayments_SupplierInvoice1_idx` (`idInvoice`),
  CONSTRAINT `fk_SupplierInvoicePayments_Supplier1` FOREIGN KEY (`idSupplier`) REFERENCES `Supplier` (`idSupplier`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_SupplierInvoicePayments_SupplierInvoice1` FOREIGN KEY (`idInvoice`) REFERENCES `SupplierInvoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for SupplierInvoiceReturn
-- ----------------------------
DROP TABLE IF EXISTS `SupplierInvoiceReturn`;
CREATE TABLE `SupplierInvoiceReturn` (
  `idInvoiceReturn` int(11) NOT NULL AUTO_INCREMENT,
  `RetuenDate` varchar(45) DEFAULT NULL,
  `ReturnQty` double DEFAULT NULL,
  `ItemSerial` varchar(45) DEFAULT NULL,
  `Term` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `idInvoice` int(11) NOT NULL,
  `idInvoiceItem` int(11) NOT NULL,
  `ItemCondition` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idInvoiceReturn`),
  KEY `fk_SupplierInvoiceReturn_SupplierInvoice1_idx` (`idInvoice`),
  KEY `fk_SupplierInvoiceReturn_SupplierInvoiceItem1_idx` (`idInvoiceItem`),
  CONSTRAINT `fk_SupplierInvoiceReturn_SupplierInvoice1` FOREIGN KEY (`idInvoice`) REFERENCES `SupplierInvoice` (`idInvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_SupplierInvoiceReturn_SupplierInvoiceItem1` FOREIGN KEY (`idInvoiceItem`) REFERENCES `SupplierInvoiceItem` (`idInvoiceItem`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for SupplierInvoiceReturn_has_Supplier
-- ----------------------------
DROP TABLE IF EXISTS `SupplierInvoiceReturn_has_Supplier`;
CREATE TABLE `SupplierInvoiceReturn_has_Supplier` (
  `IdRecord` int(11) NOT NULL AUTO_INCREMENT,
  `idInvoiceReturn` int(11) NOT NULL,
  `idSupplier` int(11) NOT NULL,
  PRIMARY KEY (`IdRecord`),
  KEY `fk_SupplierInvoiceReturn_has_Supplier_Supplier1_idx` (`idSupplier`),
  KEY `fk_SupplierInvoiceReturn_has_Supplier_SupplierInvoiceReturn_idx` (`idInvoiceReturn`),
  CONSTRAINT `fk_SupplierInvoiceReturn_has_Supplier_Supplier1` FOREIGN KEY (`idSupplier`) REFERENCES `Supplier` (`idSupplier`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_SupplierInvoiceReturn_has_Supplier_SupplierInvoiceReturn1` FOREIGN KEY (`idInvoiceReturn`) REFERENCES `SupplierInvoiceReturn` (`idInvoiceReturn`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for SupplierReturn
-- ----------------------------
DROP TABLE IF EXISTS `SupplierReturn`;
CREATE TABLE `SupplierReturn` (
  `idSupplierReturn` int(11) NOT NULL AUTO_INCREMENT,
  `RetuenDate` varchar(10) DEFAULT NULL,
  `idSupplier` int(11) NOT NULL,
  `ReturnQty` varchar(45) DEFAULT NULL,
  `idGRNItem` int(11) NOT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `Term` varchar(45) DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idSupplierReturn`),
  KEY `fk_SupplierReturn_Supplier1_idx` (`idSupplier`),
  KEY `fk_SupplierReturn_GRNItem1_idx` (`idGRNItem`),
  CONSTRAINT `fk_SupplierReturn_GRNItem1` FOREIGN KEY (`idGRNItem`) REFERENCES `GRNItem` (`idGRNItem`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_SupplierReturn_Supplier1` FOREIGN KEY (`idSupplier`) REFERENCES `Supplier` (`idSupplier`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Users
-- ----------------------------
DROP TABLE IF EXISTS `Users`;
CREATE TABLE `Users` (
  `idtable1` int(11) NOT NULL AUTO_INCREMENT,
  `NIC` varchar(45) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `UserName` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `isActive` varchar(45) DEFAULT NULL,
  `userType` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtable1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
