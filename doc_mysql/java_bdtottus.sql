/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50638
 Source Host           : localhost
 Source Database       : java_bdtottus

 Target Server Type    : MySQL
 Target Server Version : 50638
 File Encoding         : utf-8

 Date: 05/26/2019 18:19:19 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `personal`
-- ----------------------------
DROP TABLE IF EXISTS `personal`;
CREATE TABLE `personal` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(25) NOT NULL,
  `sueldo` int(11) NOT NULL,
  `edad` int(11) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `personal`
-- ----------------------------
BEGIN;
INSERT INTO `personal` VALUES ('1', 'jorge', '1000', '35'), ('3', 'pedro', '3000', '25'), ('4', 'jorge', '1400', '32'), ('7', 'maria3', '1000', '28'), ('6', 'lucia caleni', '1800', '26'), ('8', 'pedro2', '2000', '28'), ('9', 'lucas', '2000', '32');
COMMIT;

-- ----------------------------
--  Table structure for `usuario`
-- ----------------------------
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(25) NOT NULL,
  `tipouser` varchar(15) NOT NULL,
  `clave` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `usuario`
-- ----------------------------
BEGIN;
INSERT INTO `usuario` VALUES ('1', 'juan', 'user', 'abc'), ('2', 'pedro', 'user', 'abc'), ('3', 'jorge', 'admin', '123'), ('4', 'maria', 'user', 'abc');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
