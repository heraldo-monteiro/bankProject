-- MySQL Script generated by MySQL Workbench
-- Tue Jan  2 19:17:00 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema SistemaBancario
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SistemaBancario
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SistemaBancario` DEFAULT CHARACTER SET utf8 ;
USE `SistemaBancario` ;

-- -----------------------------------------------------
-- Table `SistemaBancario`.`Fisica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaBancario`.`Fisica` (
  `cpf` VARCHAR(11) NOT NULL,
  `nome` VARCHAR(60) NOT NULL,
  `idade` INT(3) NOT NULL,
  `dataNasc` VARCHAR(10) NOT NULL,
  `sexo` VARCHAR(10) NOT NULL,
  `paisOrigem` VARCHAR(30) NOT NULL,
  `estadoCivil` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`cpf`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SistemaBancario`.`Juridica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaBancario`.`Juridica` (
  `cnpj` VARCHAR(14) NOT NULL,
  `nome` VARCHAR(60) NOT NULL,
  `razaoSocial` VARCHAR(60) NOT NULL,
  `idade` INT(3) NOT NULL,
  `dataAquisicao` VARCHAR(10) NOT NULL,
  `paisOrigem` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`cnpj`),
  UNIQUE INDEX `cnpj_UNIQUE` (`cnpj` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SistemaBancario`.`Conta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaBancario`.`Conta` (
  `codAgencia` INT(4) ZEROFILL NOT NULL,
  `operacao` INT(3) ZEROFILL NOT NULL,
  `numeroConta` VARCHAR(14) NOT NULL,
  `saldo` DOUBLE NOT NULL,
  `senha` VARCHAR(20) NOT NULL,
  `Fisica_cpf` VARCHAR(11) NULL,
  `Juridica_cnpj` VARCHAR(14) NULL,
  UNIQUE INDEX `conta_UNIQUE` (`numeroConta` ASC) ,
  PRIMARY KEY (`numeroConta`),
  INDEX `fk_ContaPF_Fisica1_idx` (`Fisica_cpf` ASC) ,
  INDEX `fk_Conta_Juridica1_idx` (`Juridica_cnpj` ASC) ,
  CONSTRAINT `fk_ContaPF_Fisica1`
    FOREIGN KEY (`Fisica_cpf`)
    REFERENCES `SistemaBancario`.`Fisica` (`cpf`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Conta_Juridica1`
    FOREIGN KEY (`Juridica_cnpj`)
    REFERENCES `SistemaBancario`.`Juridica` (`cnpj`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SistemaBancario`.`Deposito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaBancario`.`Deposito` (
  `code` VARCHAR(20) NOT NULL,
  `data` VARCHAR(10) NOT NULL,
  `valor` DOUBLE NOT NULL,
  `Conta_numeroConta` VARCHAR(14) NOT NULL,
  PRIMARY KEY (`code`),
  UNIQUE INDEX `cod_UNIQUE` (`code` ASC) ,
  INDEX `fk_Deposito_Conta1_idx` (`Conta_numeroConta` ASC) ,
  CONSTRAINT `fk_Deposito_Conta1`
    FOREIGN KEY (`Conta_numeroConta`)
    REFERENCES `SistemaBancario`.`Conta` (`numeroConta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SistemaBancario`.`Endereco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaBancario`.`Endereco` (
  `code` INT NOT NULL AUTO_INCREMENT,
  `cep` VARCHAR(8) NOT NULL,
  `endereco` VARCHAR(60) NOT NULL,
  `numero` INT(4) NOT NULL,
  `bairro` VARCHAR(30) NOT NULL,
  `cidade` VARCHAR(45) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  `Fisica_cpf` VARCHAR(11) NULL,
  `Juridica_cnpj` VARCHAR(14) NULL,
  INDEX `fk_Endereco_Fisica1_idx` (`Fisica_cpf` ASC) ,
  INDEX `fk_Endereco_Juridica1_idx` (`Juridica_cnpj` ASC) ,
  UNIQUE INDEX `Fisica_cpf_UNIQUE` (`Fisica_cpf` ASC) ,
  UNIQUE INDEX `Juridica_cnpj_UNIQUE` (`Juridica_cnpj` ASC) ,
  PRIMARY KEY (`code`),
  UNIQUE INDEX `codeEndereco_UNIQUE` (`code` ASC) ,
  CONSTRAINT `fk_Endereco_Fisica1`
    FOREIGN KEY (`Fisica_cpf`)
    REFERENCES `SistemaBancario`.`Fisica` (`cpf`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Endereco_Juridica1`
    FOREIGN KEY (`Juridica_cnpj`)
    REFERENCES `SistemaBancario`.`Juridica` (`cnpj`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SistemaBancario`.`Saque`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaBancario`.`Saque` (
  `code` VARCHAR(20) NOT NULL,
  `data` VARCHAR(10) NOT NULL,
  `valor` DOUBLE NOT NULL,
  `Conta_numeroConta` VARCHAR(14) NOT NULL,
  PRIMARY KEY (`code`),
  UNIQUE INDEX `code_UNIQUE` (`code` ASC) ,
  INDEX `fk_Saque_Conta1_idx` (`Conta_numeroConta` ASC) ,
  CONSTRAINT `fk_Saque_Conta1`
    FOREIGN KEY (`Conta_numeroConta`)
    REFERENCES `SistemaBancario`.`Conta` (`numeroConta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SistemaBancario`.`Tranferencia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaBancario`.`Tranferencia` (
  `code` VARCHAR(20) NOT NULL,
  `data` VARCHAR(10) NOT NULL,
  `valor` DOUBLE NOT NULL,
  `Conta_numeroConta` VARCHAR(14) NOT NULL,
  `Fisica_cpf` VARCHAR(11) NULL,
  `Juridica_cnpj` VARCHAR(14) NULL,
  PRIMARY KEY (`code`),
  UNIQUE INDEX `code_UNIQUE` (`code` ASC) ,
  INDEX `fk_Tranferencia_Conta1_idx` (`Conta_numeroConta` ASC) ,
  INDEX `fk_Tranferencia_Fisica1_idx` (`Fisica_cpf` ASC) ,
  INDEX `fk_Tranferencia_Juridica1_idx` (`Juridica_cnpj` ASC) ,
  CONSTRAINT `fk_Tranferencia_Conta1`
    FOREIGN KEY (`Conta_numeroConta`)
    REFERENCES `SistemaBancario`.`Conta` (`numeroConta`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Tranferencia_Fisica1`
    FOREIGN KEY (`Fisica_cpf`)
    REFERENCES `SistemaBancario`.`Fisica` (`cpf`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Tranferencia_Juridica1`
    FOREIGN KEY (`Juridica_cnpj`)
    REFERENCES `SistemaBancario`.`Juridica` (`cnpj`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
