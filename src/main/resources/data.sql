-- Delete existing tables
DROP TABLE IF EXISTS `addresses`;
DROP TABLE IF EXISTS `funeral`;
DROP TABLE IF EXISTS `funeral_home`;
DROP TABLE IF EXISTS `users`;


/*---------------------------------------------------------*/
CREATE TABLE `addresses` (
  `address_uuid` varchar(36) NOT NULL,
  `address` varchar(200) DEFAULT NULL,
  `city` varchar(200) DEFAULT NULL,
  `state` varchar(200) DEFAULT NULL,
  `zip_code` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`address_uuid`)
);
/*---------------------------------------------------------*/
CREATE TABLE `funeral` (
  `code` varchar(80) NOT NULL,
  `start_timestamp` timestamp NULL DEFAULT NULL,
  `vimeo_id` varchar(400) DEFAULT NULL,
  `path_to_saved_recording` varchar(400) DEFAULT NULL,
  `funeral_home_id` int DEFAULT NULL,
  PRIMARY KEY (`code`)
);
/*---------------------------------------------------------*/
CREATE TABLE `funeral_home` (
  `funeral_home_id` int NOT NULL AUTO_INCREMENT,
  `intro_video` varchar(400) DEFAULT NULL,
  `outro_video` varchar(400) DEFAULT NULL,
  `name` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`funeral_home_id`)
);
/*---------------------------------------------------------*/
CREATE TABLE `users` (
  `user_uuid` varchar(36) NOT NULL,
  `first_name` varchar(200) DEFAULT NULL,
  `last_name` varchar(200) DEFAULT NULL,
  `address_uuid` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`user_uuid`)
);
/*---------------------------------------------------------*/






/*---------------------------------------------------------*/
LOCK TABLE `addresses` WRITE;
/*!40000 ALTER TABLE `addresses` DISABLE KEYS */;
/*!40000 ALTER TABLE `addresses` ENABLE KEYS */;
UNLOCK TABLE;
/*---------------------------------------------------------*/
LOCK TABLE `funeral` WRITE;
/*!40000 ALTER TABLE `funeral` DISABLE KEYS */;
INSERT INTO `funeral` VALUES ('CODE1','2022-01-01 16:00:00','VIMEO_ID1',NULL,1),('CODE2','2022-01-02 17:00:00','VIMEO_ID2',NULL,2),('CODE3','2022-01-03 18:00:00','VIMEO_ID3',NULL,1);
/*!40000 ALTER TABLE `funeral` ENABLE KEYS */;
UNLOCK TABLE;
/*---------------------------------------------------------*/
LOCK TABLE `funeral_home` WRITE;
/*!40000 ALTER TABLE `funeral_home` DISABLE KEYS */;
INSERT INTO `funeral_home` VALUES (1,'INTRO_VIDEO1','OUTRO_VIDEO1','FUNERAL_HOME1'),(2,'INTRO_VIDEO2','OUTRO_VIDEO2','FUNERAL_HOME2'),(3,'INTRO_VIDEO3','OUTRO_VIDEO3','FUNERAL_HOME3');
/*!40000 ALTER TABLE `funeral_home` ENABLE KEYS */;
UNLOCK TABLE;
/*---------------------------------------------------------*/
LOCK TABLE `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('1','John','Doe','100'),('2','Jane','Doe','101'),('3','Bob','Smith','102');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLE;
/*---------------------------------------------------------*/