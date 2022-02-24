DROP table if exists alimenti;

CREATE TABLE `alimenti` (
  `id` int NOT NULL AUTO_INCREMENT,
  `categoria` varchar(25) NOT NULL,
  `prodotto` varchar(100) NOT NULL,
  `proteine` decimal(6,2) DEFAULT NULL,
  `lipidi` decimal(6,2) DEFAULT NULL,
  `carboidrati` decimal(6,2) DEFAULT NULL,
  `energia` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=776 DEFAULT CHARSET=utf8mb4;