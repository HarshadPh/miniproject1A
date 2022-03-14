-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: tourism
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
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking` (
  `idBooking` int NOT NULL AUTO_INCREMENT,
  `name` varchar(90) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `addhar_no` decimal(12,0) DEFAULT NULL,
  `sr_no` varchar(45) DEFAULT NULL,
  `safari_date` date DEFAULT NULL,
  PRIMARY KEY (`idBooking`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (1,'vedang','male',20,'mumbai',522404322213,'1','2021-11-26'),(2,'vedang mule','male',20,'pune',522404322217,'1','2021-11-25'),(3,'apurva','male',21,'nagpur',522404322213,'1','2021-11-25'),(4,'nikhil nikure','male',23,'mumbai',522404322213,'1','2021-11-25'),(5,'anup nikure','male',32,'gondia',522404322214,'2','2021-11-25'),(6,'xbx','hshs',12,'ccd',121233234444,'1','2021-11-25'),(7,'vedangdb','male',23,'san',535353535353,'1','2021-11-25'),(8,'vedang','male',20,'chandrapur',522404322213,'1','2021-11-25'),(9,'rohit kute','male',20,'mumbai',522404322276,'2','2021-11-25'),(10,'pratik','male',20,'mumbai',522404322217,'3','2021-11-25'),(11,'nikhil','male',32,'chandrapur',544678895332,'4','2021-11-25'),(12,'anup','male',34,'nagpur',522404322278,'5','2021-11-25'),(13,'himanshu','male',17,'wardha',522404327654,'6','2021-11-25'),(14,'nitin','male',32,'pune',654334568976,'1','2021-11-25'),(15,'sachin','male',58,'mumbai',653434567658,'2','2021-11-25'),(16,'chetak','male',28,'nagpur',345665477654,'3','2021-11-25'),(17,'abhinav','male',19,'bhandara',345666373765,'4','2021-11-25'),(18,'bhushan','male',20,'wardha',765456476543,'5','2021-11-25'),(19,'vrushab','male',16,'wardha',522404322278,'6','2021-11-25'),(20,'akash','male',24,'chandrapur',522404322276,'1','2021-11-25'),(21,'xyz','male',22,'abc',522409875678,'2','2021-11-25'),(22,'mandar','male',19,'nagpur',522409876789,'1','2021-11-25'),(23,'harsh','male',20,'mumbai',5655786545,'2','2021-11-25'),(24,'abc','m',23,'mumbai',125266268765,'1','2021-11-25'),(25,'ritik','male',23,'mumbai',564354654765,'1','2021-11-25'),(26,'virat','male',23,'noida',765465476543,'2','2021-11-25'),(27,'pqr','male',20,'mul',522456545678,'1','2021-11-25'),(28,'nm','male',23,'mumbai',234543454565,'1','2021-11-25'),(29,'bhc','male',23,'mumbai',654567654567,'2','2021-11-25'),(30,'cbz','male',23,'mumbai',653443546576,'1','2021-11-25'),(31,'henricks','male',23,'kerla',235654348765,'2','2021-11-25'),(32,'henry','male',21,'mumbai',765654543432,'1','2021-11-25'),(33,'nyc','male',23,'mumbai',654765435643,'2','2021-11-25'),(34,'eer','male',33,'pune',23487656554,'1','2021-11-25'),(35,'ppt','male',23,'nagpur',765567667898,'2','2021-11-25'),(36,'aaa','male',22,'jammu',765656766543,'1','2021-11-25'),(37,'ppp','male',74,'pune',777656544321,'2','2021-11-25'),(38,'ggg','male',23,'pune',765434354323,'1','2021-11-25'),(39,'jack','male',18,'mumbai',765654346543,'1','2021-11-25'),(40,'ujwal','male',23,'pune',765445676543,'2','2021-11-25'),(41,'bhim','male',43,'pune',876556765432,'1','2021-11-25'),(42,'shubham','male',19,'pune',654534543456,'1','2021-11-25'),(43,'babar','male',19,'mumbai',987665765434,'1','2021-11-25'),(44,'err','male',23,'pune',2343543456,'1','2021-11-25'),(45,'bcc','male',21,'mumbai',522404322234,'1','2021-11-25'),(46,'vedang','male',23,'pune',765445676543,'1','2021-11-25'),(47,'assa','male',24,'nagpur',654567876543,'1','2021-11-25'),(48,'defr','male',23,'pune',765445675432,'1','2021-11-25'),(49,'nhu','male',23,'pune',765498766543,'1','2021-11-25'),(50,'nse','male',12,'chandrapur',522404322213,'1','2021-11-25'),(51,'vedang','male',12,'pune',522404322213,'1','2021-11-26'),(52,'vedang mule','male',12,'pune',522404322213,'2','2021-11-26'),(53,'vedang','male',23,'pune',522404322213,'1','2021-11-27'),(54,'vedang mule','male',23,'pune',522404322213,'2','2021-11-27'),(55,'nbn','male',21,'pune',987654321345,'1','2021-11-25'),(56,'xyz','male',24,'pune',522404322213,'1','2021-11-25'),(57,'abc','male',20,'mumbai',522408766543,'2','2021-11-25'),(58,'xyz','male',23,'mumbai',522404322213,'1','2021-11-25'),(59,'abc','male',12,'pune',654345654321,'2','2021-11-25'),(60,'vedang','male',18,'mumbai',522404322213,'1','2021-11-26'),(61,'harshad','male',19,'mumbai',522404322213,'1','2021-11-27'),(62,'xyz','male',19,'mumbai',522404322213,'1','2021-11-27'),(63,'vedang mule','male',20,'Noida',765432456787,'1','2021-11-27'),(64,'govind','male',13,'nashik',987656787654,'1','2021-11-27'),(65,'mnop','male',23,'mumbai',522404322213,'1','2021-11-27'),(66,'nalini mule','female',28,'pune',522404322267,'2','2021-11-27'),(67,'home','male',34,'chandrapur',345434323456,'1','2021-11-27'),(68,'ffggh','male',34,'mumbai',223454323456,'1','2021-11-27'),(69,'mandar','male',21,'mumbai',876556787654,'1','2021-11-27'),(70,'kjsdshd','sajhsa',23,'nsjs',234567876544,'1','2021-11-27'),(71,'dchvdc','male',21,'adad',522404322213,'1','2021-11-26'),(72,'xyz','male',23,'mumbai',522404322213,'1','2021-11-26');
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `username` varchar(45) NOT NULL,
  `facilities` varchar(45) NOT NULL,
  `staff` varchar(45) NOT NULL,
  `difficulty` varchar(45) NOT NULL,
  `experience` varchar(300) DEFAULT NULL,
  `guide` int NOT NULL,
  `sanctuary` int NOT NULL,
  `transportation` int NOT NULL,
  `query` varchar(300) DEFAULT NULL,
  `problem` varchar(45) NOT NULL,
  `problemst` varchar(300) DEFAULT NULL,
  `cancelationl` varchar(45) NOT NULL,
  `cancelationst` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES ('vedang','yes','no','yes','xyz',3,4,4,'xyz','no','','no',''),('vedang208','no','yes','no','nice',2,3,5,'no','no','','no',''),('vijay','no','yes','no','abc',2,4,5,'xyz','no','','no',''),('vedang','yes','no','yes','nice',2,3,5,'good','no','','no',''),('vedang','yes','yes','no','xyz',2,5,4,'abc','no','','no','');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login2`
--

DROP TABLE IF EXISTS `login2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login2` (
  `username` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone_no` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`,`phone_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login2`
--

LOCK TABLES `login2` WRITE;
/*!40000 ALTER TABLE `login2` DISABLE KEYS */;
INSERT INTO `login2` VALUES ('nikhil2002','dawbkdak','8765456789','12345'),('pratik2002','pratikshelke20@gmail.com','9923134963','12345'),('rohit12','rohitkute28@gamil.com','9579548171','12345'),('vedang','vedangmule208@gmail.com','9049334860','12345'),('vedang208','vedangmule208@gmail.com','9158674113','12345'),('vijay','vijaymule4763@gmail.com','8208214151','12345');
/*!40000 ALTER TABLE `login2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `new_table`
--

DROP TABLE IF EXISTS `new_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `new_table` (
  `id` int NOT NULL AUTO_INCREMENT,
  `safari_date` date DEFAULT NULL,
  `slot` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `new_table`
--

LOCK TABLES `new_table` WRITE;
/*!40000 ALTER TABLE `new_table` DISABLE KEYS */;
INSERT INTO `new_table` VALUES (1,'2021-11-22',NULL),(2,'2021-11-25',NULL),(3,'2021-11-19',NULL),(4,'2021-11-22',NULL),(5,'2021-11-27',NULL),(6,'2021-11-20','morning'),(7,'2021-11-20','morning'),(8,'2021-11-30','afternoon'),(9,'2021-11-25','morning'),(10,'2021-11-25','morning'),(11,'2021-11-25','afternoon');
/*!40000 ALTER TABLE `new_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanct`
--

DROP TABLE IF EXISTS `sanct`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanct` (
  `No_` int NOT NULL,
  `Sanctury_Name` varchar(30) DEFAULT NULL,
  `Animals` varchar(1000) DEFAULT NULL,
  `District` varchar(50) DEFAULT NULL,
  `Near_Tourist_Place` varchar(1000) DEFAULT NULL,
  `A1` varchar(50) DEFAULT NULL,
  `A2` varchar(50) DEFAULT NULL,
  `A3` varchar(50) DEFAULT NULL,
  `A4` varchar(50) DEFAULT NULL,
  `A5` varchar(50) DEFAULT NULL,
  `A6` varchar(50) DEFAULT NULL,
  `A7` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`No_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanct`
--

LOCK TABLES `sanct` WRITE;
/*!40000 ALTER TABLE `sanct` DISABLE KEYS */;
INSERT INTO `sanct` VALUES (1,'Melghat Wildlife Sanctuary',' Bengal Tiger,Indian Leopard,sloth bear,Ussuri Dhole,etc.','Amravati','Bhimkund,Narnala Fort,Gwaligarh Fort,Muktagiri,etc.','Tiger','Leopard','Bear',' Sambar ','Squirrel','Deer','Melghat'),(2,'Bhimashankar Wildlife ',' Leopard Panthera pardus, Golden Jackal, Sambar, Barking Deer,etc.','Pune','Durshet,Karjat,Khandala,Shanaiwar Wada,etc.','Jackal','Leopard','Wildboar ',' Sambar ','Squirrel','Deer','Bhimashankar'),(3,'Radhanagari Wildlife sanctuary',' bear, wild boar, barking deer, deer, sambar, squirrel, wild dogs,etc','Kolhapur','Kurali Dam,Rankala Talav,Mahalakshmi Mandir,etc.','wild dogs','Leopard','Wildboar ',' Sambar ','Squirrel','Deer','Radhanagari'),(4,'Karnala Wildlife Sanctuary',' Malabar Grey Hornbill,White-cheeked Barbet,Small Sunbird,etc.','Raigad','Central Park , Karnala Fort , Kalavantin Durga,etc.','Hornbill','Barbet','Sunbird','Lark','Parakeet','pigeon','Karnala'),(5,'Sagareshwar wildlife sanctuary','Sambar Deer, Blackbucks, Muntjac, Chital, wild boar, peacocks,etc.','Sangli','Gokak Water Falls, Dandoba Hill Station, Chandoli Forests, Audumbar,etc.','fox','porcupines','Wildboar ',' Sambar ','peacocks','Deer','Sagareshwar'),(6,'Sanjay Gandhi National park','Deer,Sambhar,Barking Deer,Hare,Mouse Deer,etc.','Mumbai','Gateway of India, Marin Drive, Taj Hotel, Siddhivinayal Temple,etc.','fox','Hyena','monkey','Sambhar','Hare','Deer','Sanjay Gandhi'),(7,'Navegaon wildlife sanctuary ','Tiger, Panther, Jungle cat, Small India Civet,etc.','Gondia','Nagzira Wildlife Sanctuary, Itiadoh Dam, Tibetan Camp,etc,','tiger','Panther','Jungle cat','Civet','Sambars','Wild boars','Navegaon'),(8,'Pench wildlife sanctuary','Gaur (Indian Bison),Cheetal,Sambar,Nilgai,Wild Dog,etc.','Seoni ','Turiya Jeep Safari,, Sillari Canter Safari,Wolf Sanctuary Night Safari,etc','bear','Leopard','Jungle cat','Hyena','Civet','Fox','Pench'),(9,'Nagzira wildlife sanctuary','tiger, leopard, jungle cat, small Indian civet,etc.','Bhandara-Gondia','Itiadoh Dam , Tibetan Camp at Gothangaon, Pratapgad,etc.','Tiger','Leopard','Jungle cat','Civet','bear','Squirrel','Nagzira'),(10,'Bor wildlife sanctuary ','Bengal tiger, Indian leopard, Indian bison, blue bull, chital, sambar deer, peacock, barking deer,etc.','Wardha','Vishwa Shanti Stupa, Sevagram Asharam, Kishor Nivas,etc.','Tiger','Leopard','Bison','Samber','Bull','Peacock','Bor'),(11,'Tadoba wildlife sanctuary',' Indian leopards, sloth bears, gaur, nilgai, dhole, striped hyena, small Indian civet, jungle cats, sambar, etc.','Chandrapur',' Tadoba Lake, Shiv Mandir, Sankatmochan Hanuman Mandir and Urjanagar Lake,etc','bear','Leopard','Nillgai','Samber','Civet','Jungle cat','Tadoba'),(12,'karhandla wildlife sanctuary','Bengal tiger, Indian leopard, Indian bison, blue bull, chital, sambar deer, barking deer, mouse deer, monkey, wild boar,etc.','Nagpur','Tibetian Camp Gothangaon','Tiger','Leopard','Bison','Samber','Chital','Deer','karhandla');
/*!40000 ALTER TABLE `sanct` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `slot`
--

DROP TABLE IF EXISTS `slot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `slot` (
  `slot_id` int NOT NULL AUTO_INCREMENT,
  `safari_date` date DEFAULT NULL,
  `safari_slot` varchar(45) DEFAULT NULL,
  `visitors_count` int DEFAULT NULL,
  PRIMARY KEY (`slot_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1052 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `slot`
--

LOCK TABLES `slot` WRITE;
/*!40000 ALTER TABLE `slot` DISABLE KEYS */;
INSERT INTO `slot` VALUES (1001,'2021-11-25',NULL,1),(1002,'2021-11-25',NULL,1),(1003,'2021-11-25',NULL,1),(1004,'2021-11-24',NULL,2),(1005,'2021-11-25','afternoon',1),(1006,'2021-11-25','morning',2),(1007,'2021-11-25','morning',6),(1008,'2021-11-25','morning',6),(1010,'2021-11-25','morning',0),(1011,'2021-11-25','morning',0),(1012,'2021-11-26','morning',0),(1013,'2021-11-26','morning',0),(1014,'2021-11-25','morning',0),(1015,'2021-11-25','morning',0),(1016,'2021-11-26','morning',0),(1017,'2021-11-26','morning',0),(1018,'2021-11-27','morning',0),(1019,'2021-11-27','morning',0),(1020,'2021-11-27','morning',0),(1021,'2021-11-27','morning',0),(1022,'2021-11-27','morning',0),(1023,'2021-11-27','morning',0),(1024,'2021-11-25','morning',1),(1026,'2021-11-25','afternoon',2),(1027,'2021-11-25','afternoon',2),(1028,'2021-11-25','afternoon',2),(1029,'2021-11-25','afternoon',2),(1030,'2021-11-26','afternoon',1),(1031,'2021-11-26','afternoon',1),(1032,'2021-11-27','afternoon',1),(1033,'2021-11-27','afternoon',1),(1034,'2021-11-27','afternoon',1),(1035,'2021-11-27','afternoon',1),(1036,'2021-11-27','afternoon',1),(1037,'2021-11-27','afternoon',1),(1038,'2021-11-27','afternoon',2),(1039,'2021-11-27','afternoon',2),(1040,'2021-11-27','afternoon',1),(1041,'2021-11-27','afternoon',1),(1042,'2021-11-27','afternoon',1),(1043,'2021-11-27','afternoon',1),(1044,'2021-11-27','afternoon',1),(1045,'2021-11-27','afternoon',1),(1046,'2021-11-27','afternoon',1),(1047,'2021-11-27','afternoon',1),(1048,'2021-11-30','morning',0),(1049,'2021-11-27','morning',1),(1050,'2021-11-26','morning',1),(1051,'2021-11-26','afternoon',1);
/*!40000 ALTER TABLE `slot` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-22 23:56:22
