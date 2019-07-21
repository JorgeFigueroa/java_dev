/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50638
 Source Host           : localhost
 Source Database       : java_almacen

 Target Server Type    : MySQL
 Target Server Version : 50638
 File Encoding         : utf-8

 Date: 05/26/2019 18:19:09 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `categoria`
-- ----------------------------
DROP TABLE IF EXISTS `categoria`;
CREATE TABLE `categoria` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `categoria`
-- ----------------------------
BEGIN;
INSERT INTO `categoria` VALUES ('1', 'lacteos', 'leche yougurt'), ('2', 'frutas', 'papaya melon'), ('3', 'abarrotes', 'cccccc'), ('4', 'verduras', 'cccccc'), ('5', 'comidas', 'wwwww'), ('6', 'comidas', 'wwwww'), ('7', 'abc', 'aaaaa'), ('8', 'chela', 'la chela es rica'), ('9', 'detergente', 'ariel'), ('10', 'ggg', 'ggg');
COMMIT;

-- ----------------------------
--  Table structure for `producto`
-- ----------------------------
DROP TABLE IF EXISTS `producto`;
CREATE TABLE `producto` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(25) NOT NULL,
  `precio` double NOT NULL,
  `stock` int(11) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `producto`
-- ----------------------------
BEGIN;
INSERT INTO `producto` VALUES ('1', 'leche', '2', '20'), ('2', 'leche', '2', '20'), ('3', 'arroz', '3', '50'), ('4', 'quezo', '8', '20'), ('5', 'maiz', '3', '40');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
