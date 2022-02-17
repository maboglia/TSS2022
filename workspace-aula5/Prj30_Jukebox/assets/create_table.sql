CREATE TABLE `canzoni` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titolo` varchar(60) DEFAULT NULL,
  `cantante` varchar(60) DEFAULT NULL,
  `genere` varchar(60) DEFAULT NULL,
  `anno` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
