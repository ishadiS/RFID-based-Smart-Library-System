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
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `BOOK_ID` int NOT NULL,
  `BOOK_NAME` varchar(50) NOT NULL,
  `AUTHOR` varchar(50) NOT NULL,
  `CATEGORY` varchar(50) NOT NULL,
  PRIMARY KEY (`BOOK_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (7654,'jaajka','hshjahsa','ajsaa'),(13456,'jdsjksk','akjdkj','akdakdjk'),(6182765,'The Hunger Games','Suzanne Collins','novel'),(5910532,'Twilight','Stephenie Meyer','novel'),(9785329,'The Great Gatsby','F. Scott Fitzgerald','novel'),(9689862,'The Hobbit or There and Back Again','J.R.R. Tolkien','novel'),(994469,'The Catcher in the Rye','J.D. Salinger','novel'),(6158372,'Angels & Demons ','Dan Brown','novel'),(5158630,'Pride and Prejudice','Jane Austen','novel'),(3393107,'The Kite Runner ','Khaled Hosseini','novel'),(958869,'Divergent','Veronica Roth','novel'),(9861076,'Animal Farm: A Fairy Story','George Orwell','novel'),(6120610,'Catching Fire','Suzanne Collins','novel'),(6803235,' The Fellowship of the Ring','J.R.R. Tolkien','novel'),(9905789,'Mockingjay','Suzanne Collins','novel'),(3700604,'The Lovely Bones','Alice Sebold','novel'),(5024718,'The Da Vinci Code','Dan Brown','novel'),(3071774,'Lord of the Flies ','William Golding','novel'),(8036007,'Gone Girl','Gillian Flynn','novel'),(7963160,'The Help','Kathryn Stockett','novel'),(3689561,'Of Mice and Men ','John Steinbeck','novel'),(3723072,'Memoirs of a Geisha','Arthur Golden','novel'),(5804789,'Fifty Shades of Grey','E.L. James','novel'),(6643031,'The Giver','Lois Lowry','novel'),(4010348,'The Hunger Games','Suzanne Collins','novel'),(3933991,'Twilight','Stephenie Meyer','novel'),(3857635,'The Great Gatsby','F. Scott Fitzgerald','novel'),(3781278,'The Hobbit or There and Back Again','J.R.R. Tolkien','novel'),(3704922,'The Catcher in the Rye','J.D. Salinger','novel'),(3628566,'Angels & Demons ','Dan Brown','novel'),(3552209,'Pride and Prejudice','Jane Austen','novel'),(3475853,'The Kite Runner ','Khaled Hosseini','novel'),(3399496,'Divergent','Veronica Roth','novel'),(3246784,'Animal Farm: A Fairy Story','George Orwell','novel'),(3094071,'Catching Fire','Suzanne Collins','novel'),(2941358,' The Fellowship of the Ring','J.R.R. Tolkien','novel'),(2865001,'Mockingjay','Suzanne Collins','novel'),(2712289,'The Lovely Bones','Alice Sebold','novel'),(2406863,'The Da Vinci Code','Dan Brown','novel'),(2254150,'Lord of the Flies ','William Golding','novel'),(2177794,'Gone Girl','Gillian Flynn','novel'),(2101437,'The Help','Kathryn Stockett','novel'),(2025081,'Of Mice and Men ','John Steinbeck','novel'),(1948724,'Memoirs of a Geisha','Arthur Golden','novel'),(1872368,'Fifty Shades of Grey','E.L. James','novel'),(1719655,'The Giver','Lois Lowry','novel'),(1566942,'The Hunger Games','Suzanne Collins','novel'),(1490586,'Twilight','Stephenie Meyer','novel'),(1414230,'The Great Gatsby','F. Scott Fitzgerald','novel'),(1337873,'The Hobbit or There and Back Again','J.R.R. Tolkien','novel'),(1261517,'The Catcher in the Rye','J.D. Salinger','novel'),(1185160,'Angels & Demons ','Dan Brown','novel'),(1108804,'Pride and Prejudice','Jane Austen','novel'),(1032447,'The Kite Runner ','Khaled Hosseini','novel'),(956091,'Divergent','Veronica Roth','novel'),(803378,'Animal Farm: A Fairy Story','George Orwell','novel'),(650665,'Catching Fire','Suzanne Collins','novel'),(497953,' The Fellowship of the Ring','J.R.R. Tolkien','novel'),(421596,'Mockingjay','Suzanne Collins','novel'),(268883,'The Lovely Bones','Alice Sebold','novel'),(98933,'Madolduwa','Martin Wickramasinghe','Novel');
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-10 23:08:04
