CREATE DATABASE  IF NOT EXISTS `sltc_library` /*!40100 DEFAULT CHARACTER SET latin1 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `sltc_library`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: sltc_library
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `members` (
  `MEMBERSHIP_ID` int NOT NULL,
  `MEMBER_NAME` varchar(50) NOT NULL,
  `SLTC_INDEX` varchar(10) NOT NULL,
  `NIC_NUMBER` varchar(12) DEFAULT NULL,
  `EMAIL_ADDRESS` varchar(50) DEFAULT NULL,
  `CONTACT_NUMBER` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`MEMBERSHIP_ID`),
  UNIQUE KEY `NIC_NUMBER` (`NIC_NUMBER`),
  UNIQUE KEY `EMAIL_ADDDRESS` (`EMAIL_ADDRESS`),
  UNIQUE KEY `CONTACT_NUMBER` (`CONTACT_NUMBER`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `members`
--

LOCK TABLES `members` WRITE;
/*!40000 ALTER TABLE `members` DISABLE KEYS */;
INSERT INTO `members` VALUES (2345,'Hansika Gamage','AA1714','993456789V','hansigamage199@gmail.com ','0762345678'),(12345,'Laksisi Gunartne','AA1860','997172647V','chetangunaratnelaksisi@gmail.com','0764729594'),(3456,'Ishadi Sandeepani','AA1905','992345678V','ieshasandeepani14001@gmail.com ','0771345678'),(4567,'Somesha Hewage','AA1842','200076345V','hansigamage709@gmail.com ','0752885048'),(199984,'Anil Gunartne','AA1111','12345678','chethagunaratne@gmail.com','0769792829');
/*!40000 ALTER TABLE `members` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-10 23:08:02
