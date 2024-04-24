CREATE DATABASE IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
	`id` int NOT NULL AUTO_INCREMENT,
    `first_name` varchar(45) NOT NULL,
    `last_name` varchar(45) DEFAULT NULL,
    `email` varchar(45) NOT NULL,
    PRIMARY KEY(`ID`)
) ENGINE = InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1; 

INSERT INTO `employee` VALUES
	(1, 'Vikas', 'Gogia', 'vgogi074@uottawa.ca'),
    (2, 'Piyush', 'Jain', 'pjain@iitr.in');