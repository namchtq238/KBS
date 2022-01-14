-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sacthaikhuonmat
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `cam`
--

DROP TABLE IF EXISTS `cam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cam` (
                       `id` int NOT NULL AUTO_INCREMENT,
                       `mota` varchar(255) DEFAULT NULL,
                       `trong_so` int DEFAULT NULL,
                       PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cam`
--

LOCK TABLES `cam` WRITE;
/*!40000 ALTER TABLE `cam` DISABLE KEYS */;
INSERT INTO `cam` VALUES (1,'Bình Thường',3),(2,'Nâng Lên',3);
/*!40000 ALTER TABLE `cam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `long_may`
--

DROP TABLE IF EXISTS `long_may`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `long_may` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `mota` varchar(255) DEFAULT NULL,
                            `trong_so` int DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `long_may`
--

LOCK TABLES `long_may` WRITE;
/*!40000 ALTER TABLE `long_may` DISABLE KEYS */;
INSERT INTO `long_may` VALUES (1,'Bình Thường',6),(2,'Nâng Lên',6),(3,'Hạ Xuống',6);
/*!40000 ALTER TABLE `long_may` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ma`
--

DROP TABLE IF EXISTS `ma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ma` (
                      `id` int NOT NULL AUTO_INCREMENT,
                      `mota` varchar(255) DEFAULT NULL,
                      `trong_so` int DEFAULT NULL,
                      PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ma`
--

LOCK TABLES `ma` WRITE;
/*!40000 ALTER TABLE `ma` DISABLE KEYS */;
INSERT INTO `ma` VALUES (1,'Bình Thường',5),(2,'Đầy và Nâng Lên',5),(3,'Phẳng và Dãn',5);
/*!40000 ALTER TABLE `ma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mat`
--

DROP TABLE IF EXISTS `mat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mat` (
                       `id` int NOT NULL AUTO_INCREMENT,
                       `mota` varchar(255) DEFAULT NULL,
                       `trong_so` int DEFAULT NULL,
                       PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mat`
--

LOCK TABLES `mat` WRITE;
/*!40000 ALTER TABLE `mat` DISABLE KEYS */;
INSERT INTO `mat` VALUES (1,'Bình Thường',3),(2,'Mở Rộng',3),(3,'Híp Mắt',3),(4,'Nhắm',3);
/*!40000 ALTER TABLE `mat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `moi`
--

DROP TABLE IF EXISTS `moi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `moi` (
                       `id` int NOT NULL AUTO_INCREMENT,
                       `mota` varchar(255) DEFAULT NULL,
                       `trong_so` int DEFAULT NULL,
                       PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `moi`
--

LOCK TABLES `moi` WRITE;
/*!40000 ALTER TABLE `moi` DISABLE KEYS */;
INSERT INTO `moi` VALUES (1,'Bình Thường',6),(2,'Mím Chặt',6),(3,'Mở Ra',6),(4,'Bĩu Môi',6);
/*!40000 ALTER TABLE `moi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mui`
--

DROP TABLE IF EXISTS `mui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mui` (
                       `id` int NOT NULL AUTO_INCREMENT,
                       `mota` varchar(255) DEFAULT NULL,
                       `trong_so` int DEFAULT NULL,
                       PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mui`
--

LOCK TABLES `mui` WRITE;
/*!40000 ALTER TABLE `mui` DISABLE KEYS */;
INSERT INTO `mui` VALUES (1,'Bình Thường',3),(2,'Nở Ra',3);
/*!40000 ALTER TABLE `mui` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rang`
--

DROP TABLE IF EXISTS `rang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rang` (
                        `id` int NOT NULL AUTO_INCREMENT,
                        `mota` varchar(255) DEFAULT NULL,
                        `trong_so` int DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rang`
--

LOCK TABLES `rang` WRITE;
/*!40000 ALTER TABLE `rang` DISABLE KEYS */;
INSERT INTO `rang` VALUES (1,'Không Hở',3),(2,'Hở Hàm Trên',3),(3,'Hở Hàm Dưới',3),(4,'Hở Cả Hai Hàm',3);
/*!40000 ALTER TABLE `rang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sacthai`
--

DROP TABLE IF EXISTS `sacthai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sacthai` (
                           `idsacthai` int NOT NULL AUTO_INCREMENT,
                           `mota` varchar(255) DEFAULT NULL,
                           `idcam` int DEFAULT NULL,
                           `idlongmay` int DEFAULT NULL,
                           `idma` int DEFAULT NULL,
                           `idmat` int DEFAULT NULL,
                           `idmoi` int DEFAULT NULL,
                           `idmui` int DEFAULT NULL,
                           `idrang` int DEFAULT NULL,
                           `idtran` int DEFAULT NULL,
                           PRIMARY KEY (`idsacthai`),
                           KEY `FK8qhr6nlkc0ki37it8y1sahvt5` (`idcam`),
                           KEY `FK8pxr0d3h1ka9p6p1utvpl5nxg` (`idlongmay`),
                           KEY `FKn67o7rktdjdirv2j0lo594bet` (`idma`),
                           KEY `FKdusqqsieit21jbif8al8h7l92` (`idmat`),
                           KEY `FKfksap44o178yj1kksciawyo71` (`idmoi`),
                           KEY `FKquq2gmc12w9lww2mqfla888og` (`idmui`),
                           KEY `FKft0afjks0chr3sw9x5k0lv9ii` (`idrang`),
                           KEY `FK8kitqstsngx9w13ayu4fliquk` (`idtran`),
                           CONSTRAINT `FK8kitqstsngx9w13ayu4fliquk` FOREIGN KEY (`idtran`) REFERENCES `tran` (`id`),
                           CONSTRAINT `FK8pxr0d3h1ka9p6p1utvpl5nxg` FOREIGN KEY (`idlongmay`) REFERENCES `long_may` (`id`),
                           CONSTRAINT `FK8qhr6nlkc0ki37it8y1sahvt5` FOREIGN KEY (`idcam`) REFERENCES `cam` (`id`),
                           CONSTRAINT `FKdusqqsieit21jbif8al8h7l92` FOREIGN KEY (`idmat`) REFERENCES `mat` (`id`),
                           CONSTRAINT `FKfksap44o178yj1kksciawyo71` FOREIGN KEY (`idmoi`) REFERENCES `moi` (`id`),
                           CONSTRAINT `FKft0afjks0chr3sw9x5k0lv9ii` FOREIGN KEY (`idrang`) REFERENCES `rang` (`id`),
                           CONSTRAINT `FKn67o7rktdjdirv2j0lo594bet` FOREIGN KEY (`idma`) REFERENCES `ma` (`id`),
                           CONSTRAINT `FKquq2gmc12w9lww2mqfla888og` FOREIGN KEY (`idmui`) REFERENCES `mui` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sacthai`
--

LOCK TABLES `sacthai` WRITE;
/*!40000 ALTER TABLE `sacthai` DISABLE KEYS */;
INSERT INTO `sacthai` VALUES (1,'Bình Thường',1,1,1,1,1,1,1,1),(2,'Hạnh Phúc',2,1,1,3,4,1,2,1),(3,'Buồn Bã',2,1,3,3,3,1,1,2),(4,'Sợ Hãi',1,2,3,2,3,1,3,2),(5,'Tức Giận',2,3,2,3,1,2,1,3),(6,'Ngạc Nhiên',2,2,3,2,3,1,1,2),(7,'Kinh Tởm',2,3,2,1,3,1,1,1),(8,'Ngạc Nhiên 1 Cách Vui Vẻ',2,2,2,2,3,2,1,2),(9,'Kinh Tởm 1 Cách Vui Vẻ',1,1,2,3,4,1,2,1),(10,'Sợ Hãi 1 Cách Buồn Bã',2,3,1,2,4,2,4,2),(11,'Tức Giận 1 Cách Buồn Bã',2,3,1,1,3,1,1,3),(12,'Ngạc Nhiên 1 Cách Buồn Bã',1,1,1,2,4,1,1,2),(13,'Kinh Tởm 1 Cách Buồn Bã',2,3,2,1,4,1,4,2),(14,'Tức Giận 1 Cách Sợ Hãi',2,3,2,2,4,1,3,3),(15,'Ngạc Nhiên 1 Cách Sợ Hãi',2,2,3,2,3,1,3,2),(16,'Kinh Tởm 1 Cách Sợ Hãi',2,2,2,2,4,2,4,3),(17,'Ngạc Nhiên 1 Cách Giận Dữ',2,3,3,2,4,1,2,3),(18,'Ngạc Nhiên 1 Cách Giận Dữ',2,3,3,3,3,1,1,3),(19,'Ngạc Nhiên 1 Cách Kinh Tởm',1,2,1,2,2,1,1,2),(20,'Kinh Hoàng',2,3,1,2,2,1,1,3),(21,'Căm Ghét',1,3,3,1,1,1,1,3),(22,'Kinh Sợ',2,2,1,2,4,2,3,2),(23,'Hạnh Phúc',1,1,2,1,2,2,1,1),(24,'Buồn Bã',2,1,1,1,3,1,1,1),(25,'Hạnh Phúc',2,2,2,2,4,2,3,2),(26,'Kinh Tởm',2,3,1,1,1,2,1,3),(27,'Ngạc Nhiên',1,2,1,2,1,1,1,2),(28,'Tức Giận 1 Cách Buồn Bã',1,3,1,3,1,1,1,3),(30,'Tức Giận',2,3,1,1,4,1,4,1),(31,'Kinh Tởm',2,1,3,1,4,1,4,1),(32,'Hạnh Phúc',1,1,2,3,2,2,1,1),(33,'Tức Giận',2,3,1,3,4,1,3,1),(34,'Buồn Bã',2,3,1,3,2,1,1,1),(35,'Ngạc Nhiên 1 Cách Buồn Bã',1,2,1,1,1,1,1,2),(36,'Kinh Tởm 1 Cách Vui Vẻ',2,3,2,1,2,1,1,3),(37,'Ngạc Nhiên',2,1,3,1,3,1,1,1),(38,'Ngạc Nhiên 1 Cách Vui Vẻ',2,1,1,3,4,1,2,1),(39,'Kinh Tởm 1 Cách Buồn Bã',2,3,1,3,1,1,1,3),(40,'Ngạc Nhiên 1 Cách Giận Dữ',2,3,1,3,4,1,3,1),(41,'Tức Giận 1 Cách Buồn Bã',2,1,3,3,4,1,4,3),(42,'Kinh Tởm 1 Cách Giận Dữ',2,1,3,1,1,2,1,1),(43,'Ngạc Nhiên 1 Cách Kinh Tởm',2,2,1,2,4,1,1,1),(44,'Kinh Tởm 1 Cách Buồn Bã',2,1,3,1,2,2,1,1),(45,'Tức Giận 1 Cách Sợ Hãi',1,1,2,3,4,1,4,1),(46,'Tức Giận',1,3,2,2,4,2,4,3),(47,'Tức Giận 1 Cách Buồn Bã',2,3,1,4,4,2,4,3),(48,'Sợ Hãi 1 Cách Buồn Bã',1,3,1,3,3,1,1,2),(49,'Sợ Hãi 1 Cách Buồn Bã',2,1,1,2,3,1,1,3),(50,'Ngạc Nhiên 1 Cách Giận Dữ',2,3,2,1,4,1,1,1);
/*!40000 ALTER TABLE `sacthai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tran`
--

DROP TABLE IF EXISTS `tran`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tran` (
                        `id` int NOT NULL AUTO_INCREMENT,
                        `mota` varchar(255) DEFAULT NULL,
                        `trong_so` int DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tran`
--

LOCK TABLES `tran` WRITE;
/*!40000 ALTER TABLE `tran` DISABLE KEYS */;
INSERT INTO `tran` VALUES (1,'Bình Thường',6),(2,'Đẩy lên và Nhăn',6),(3,'Hạ Xuống Nhăn Vào Trong',6);
/*!40000 ALTER TABLE `tran` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuong_dong_cam`
--

DROP TABLE IF EXISTS `tuong_dong_cam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tuong_dong_cam` (
                                  `id_tuong_dong` int NOT NULL,
                                  `thuoc_tinh_vao` int NOT NULL,
                                  `thuoc_tinh_co_san` int NOT NULL,
                                  `gia_tri` float NOT NULL,
                                  PRIMARY KEY (`id_tuong_dong`),
                                  KEY `FKck5vuesvbc05pijcp9t54cnm8` (`thuoc_tinh_co_san`),
                                  CONSTRAINT `FKck5vuesvbc05pijcp9t54cnm8` FOREIGN KEY (`thuoc_tinh_co_san`) REFERENCES `cam` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuong_dong_cam`
--

LOCK TABLES `tuong_dong_cam` WRITE;
/*!40000 ALTER TABLE `tuong_dong_cam` DISABLE KEYS */;
INSERT INTO `tuong_dong_cam` VALUES (1,1,1,1),(2,1,2,0),(3,2,1,0),(4,2,2,1);
/*!40000 ALTER TABLE `tuong_dong_cam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuong_dong_longmay`
--

DROP TABLE IF EXISTS `tuong_dong_longmay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tuong_dong_longmay` (
                                      `id_tuong_dong` int NOT NULL,
                                      `gia_tri` float NOT NULL,
                                      `thuoc_tinh_vao` int NOT NULL,
                                      `thuoc_tinh_co_san` int NOT NULL,
                                      PRIMARY KEY (`id_tuong_dong`),
                                      KEY `FK4ejua2q5jt4h63ldtk7jevpg7` (`thuoc_tinh_co_san`),
                                      CONSTRAINT `FK4ejua2q5jt4h63ldtk7jevpg7` FOREIGN KEY (`thuoc_tinh_co_san`) REFERENCES `long_may` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuong_dong_longmay`
--

LOCK TABLES `tuong_dong_longmay` WRITE;
/*!40000 ALTER TABLE `tuong_dong_longmay` DISABLE KEYS */;
INSERT INTO `tuong_dong_longmay` VALUES (1,1,1,1),(2,0.7,1,2),(3,0.7,1,3),(4,0.7,2,1),(5,1,2,2),(6,0.3,2,3),(7,0.7,3,1),(8,0.3,3,2),(9,1,3,3);
/*!40000 ALTER TABLE `tuong_dong_longmay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuong_dong_ma`
--

DROP TABLE IF EXISTS `tuong_dong_ma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tuong_dong_ma` (
                                 `id_tuong_dong` int NOT NULL,
                                 `gia_tri` float NOT NULL,
                                 `thuoc_tinh_vao` int NOT NULL,
                                 `thuoc_tinh_co_san` int NOT NULL,
                                 PRIMARY KEY (`id_tuong_dong`),
                                 KEY `FK912r8jtkfeam6fiqtyyt8ks4i` (`thuoc_tinh_co_san`),
                                 CONSTRAINT `FK912r8jtkfeam6fiqtyyt8ks4i` FOREIGN KEY (`thuoc_tinh_co_san`) REFERENCES `ma` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuong_dong_ma`
--

LOCK TABLES `tuong_dong_ma` WRITE;
/*!40000 ALTER TABLE `tuong_dong_ma` DISABLE KEYS */;
INSERT INTO `tuong_dong_ma` VALUES (1,1,1,1),(2,0.7,1,2),(3,0.3,1,3),(4,0.7,2,1),(5,1,2,2),(6,0,2,3),(7,0.3,3,1),(8,0,3,2),(9,1,3,3);
/*!40000 ALTER TABLE `tuong_dong_ma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuong_dong_mat`
--

DROP TABLE IF EXISTS `tuong_dong_mat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tuong_dong_mat` (
                                  `id_tuong_dong` int NOT NULL,
                                  `gia_tri` float NOT NULL,
                                  `thuoc_tinh_vao` int NOT NULL,
                                  `thuoc_tinh_co_san` int NOT NULL,
                                  PRIMARY KEY (`id_tuong_dong`),
                                  KEY `FK2wa9cnquao0y1knn04b0916xw` (`thuoc_tinh_co_san`),
                                  CONSTRAINT `FK2wa9cnquao0y1knn04b0916xw` FOREIGN KEY (`thuoc_tinh_co_san`) REFERENCES `mat` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuong_dong_mat`
--

LOCK TABLES `tuong_dong_mat` WRITE;
/*!40000 ALTER TABLE `tuong_dong_mat` DISABLE KEYS */;
INSERT INTO `tuong_dong_mat` VALUES (1,1,1,1),(2,0.5,1,2),(3,0.5,1,3),(4,0,1,4),(5,0.5,2,1),(6,1,2,2),(7,0.2,2,3),(8,0,2,4),(9,0.5,3,1),(10,0.2,3,2),(11,1,3,3),(12,0.5,3,4),(13,0,4,1),(14,0,4,2),(15,0.5,4,3),(16,1,4,4);
/*!40000 ALTER TABLE `tuong_dong_mat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuong_dong_moi`
--

DROP TABLE IF EXISTS `tuong_dong_moi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tuong_dong_moi` (
                                  `id_tuong_dong` int NOT NULL,
                                  `gia_tri` float NOT NULL,
                                  `thuoc_tinh_vao` int NOT NULL,
                                  `thuoc_tinh_co_san` int NOT NULL,
                                  PRIMARY KEY (`id_tuong_dong`),
                                  KEY `FKcs5lbpoh2uywv3fcw2l3v18u0` (`thuoc_tinh_co_san`),
                                  CONSTRAINT `FKcs5lbpoh2uywv3fcw2l3v18u0` FOREIGN KEY (`thuoc_tinh_co_san`) REFERENCES `moi` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuong_dong_moi`
--

LOCK TABLES `tuong_dong_moi` WRITE;
/*!40000 ALTER TABLE `tuong_dong_moi` DISABLE KEYS */;
INSERT INTO `tuong_dong_moi` VALUES (1,1,1,1),(2,0.5,1,2),(3,0,1,3),(4,0.3,1,4),(5,0.5,2,1),(6,1,2,2),(7,0,2,3),(8,0.7,2,4),(9,0,3,1),(10,0,3,2),(11,1,3,3),(12,0,3,4),(13,0.3,4,1),(14,0.7,4,2),(15,0,4,3),(16,1,4,4);
/*!40000 ALTER TABLE `tuong_dong_moi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuong_dong_mui`
--

DROP TABLE IF EXISTS `tuong_dong_mui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tuong_dong_mui` (
                                  `id_tuong_dong` int NOT NULL,
                                  `gia_tri` float NOT NULL,
                                  `thuoc_tinh_vao` int NOT NULL,
                                  `thuoc_tinh_co_san` int NOT NULL,
                                  PRIMARY KEY (`id_tuong_dong`),
                                  KEY `FKrcjiuebjp7g7hwp59yqd2pg0` (`thuoc_tinh_co_san`),
                                  CONSTRAINT `FKrcjiuebjp7g7hwp59yqd2pg0` FOREIGN KEY (`thuoc_tinh_co_san`) REFERENCES `mui` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuong_dong_mui`
--

LOCK TABLES `tuong_dong_mui` WRITE;
/*!40000 ALTER TABLE `tuong_dong_mui` DISABLE KEYS */;
INSERT INTO `tuong_dong_mui` VALUES (1,1,1,1),(2,0,1,2),(3,0,2,1),(4,1,2,2);
/*!40000 ALTER TABLE `tuong_dong_mui` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuong_dong_rang`
--

DROP TABLE IF EXISTS `tuong_dong_rang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tuong_dong_rang` (
                                   `id_tuong_dong` int NOT NULL,
                                   `gia_tri` float NOT NULL,
                                   `thuoc_tinh_vao` int NOT NULL,
                                   `thuoc_tinh_co_san` int NOT NULL,
                                   PRIMARY KEY (`id_tuong_dong`),
                                   KEY `FKo6brr6gtdwx5c6dv14txnpx0o` (`thuoc_tinh_co_san`),
                                   CONSTRAINT `FKo6brr6gtdwx5c6dv14txnpx0o` FOREIGN KEY (`thuoc_tinh_co_san`) REFERENCES `rang` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuong_dong_rang`
--

LOCK TABLES `tuong_dong_rang` WRITE;
/*!40000 ALTER TABLE `tuong_dong_rang` DISABLE KEYS */;
INSERT INTO `tuong_dong_rang` VALUES (1,1,1,1),(2,0,1,2),(3,0,1,3),(4,0,1,4),(5,0,2,1),(6,1,2,2),(7,0,2,3),(8,0.5,2,4),(9,0,3,1),(10,0,3,2),(11,1,3,3),(12,0.5,3,4),(13,0,4,1),(14,0.5,4,2),(15,0.5,4,3),(16,1,4,4);
/*!40000 ALTER TABLE `tuong_dong_rang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuong_dong_tran`
--

DROP TABLE IF EXISTS `tuong_dong_tran`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tuong_dong_tran` (
                                   `id_tuong_dong` int NOT NULL,
                                   `gia_tri` float NOT NULL,
                                   `thuoc_tinh_vao` int NOT NULL,
                                   `thuoc_tinh_co_san` int NOT NULL,
                                   PRIMARY KEY (`id_tuong_dong`),
                                   KEY `fk_tran_idx` (`thuoc_tinh_co_san`),
                                   CONSTRAINT `FKa6ohb9m6llpcdwo0xm8xru339` FOREIGN KEY (`thuoc_tinh_co_san`) REFERENCES `tran` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuong_dong_tran`
--

LOCK TABLES `tuong_dong_tran` WRITE;
/*!40000 ALTER TABLE `tuong_dong_tran` DISABLE KEYS */;
INSERT INTO `tuong_dong_tran` VALUES (1,1,1,1),(2,0.7,1,2),(3,0.7,1,3),(4,0.7,2,1),(5,1,2,2),(6,0.3,2,3),(7,0.7,3,1),(8,0.3,3,2),(9,1,3,3);
/*!40000 ALTER TABLE `tuong_dong_tran` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-14  1:01:58
