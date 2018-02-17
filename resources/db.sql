-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema buspark
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema buspark
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `buspark` DEFAULT CHARACTER SET utf8 ;
USE `buspark` ;

-- -----------------------------------------------------
-- Table `buspark`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `buspark`.`city` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `distance` DOUBLE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `buspark`.`bus`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `buspark`.`bus` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `model` VARCHAR(45) NOT NULL,
  `capacity` INT(11) NOT NULL,
  `driver_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `buspark`.`tickets`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `buspark`.`tickets` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `price` INT(11) NOT NULL,
  `dep_time` DATETIME NOT NULL,
  `arr_time` DATETIME NOT NULL,
  `distance` DOUBLE NOT NULL,
  `count` INT(11) NOT NULL,
  `gov_number` VARCHAR(45) NOT NULL,
  `dep_city_id` INT(11) NOT NULL,
  `arr_city_id` INT(11) NOT NULL,
  `bus_id` INT(11) NOT NULL,
  `driver_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `dep_sity_idx` (`dep_city_id` ASC),
  INDEX `arr_sity_idx` (`arr_city_id` ASC),
  INDEX `bus_idx` (`bus_id` ASC),
  INDEX `fk_tickets_account1_idx` (`driver_id` ASC),
  CONSTRAINT `arr_sity`
    FOREIGN KEY (`arr_city_id`)
    REFERENCES `buspark`.`city` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `bus`
    FOREIGN KEY (`bus_id`)
    REFERENCES `buspark`.`bus` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `dep_sity`
    FOREIGN KEY (`dep_city_id`)
    REFERENCES `buspark`.`city` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tickets_account1`
    FOREIGN KEY (`driver_id`)
    REFERENCES `buspark`.`account` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `buspark`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `buspark`.`role` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `buspark`.`account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `buspark`.`account` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `ticket_id` INT(11) NULL DEFAULT NULL,
  `role_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `ticket_idx` (`ticket_id` ASC),
  INDEX `fk_account_role1_idx` (`role_id` ASC),
  CONSTRAINT `ticket`
    FOREIGN KEY (`ticket_id`)
    REFERENCES `buspark`.`tickets` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_account_role1`
    FOREIGN KEY (`role_id`)
    REFERENCES `buspark`.`role` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
