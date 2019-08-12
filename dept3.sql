/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : clouddb03

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 12/08/2019 15:09:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` bigint(16) NOT NULL AUTO_INCREMENT,
  `dname` varchar(55) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `db_source` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', 'clouddb03');
INSERT INTO `dept` VALUES (2, '人事部', 'clouddb03');
INSERT INTO `dept` VALUES (3, '财务部', 'clouddb03');
INSERT INTO `dept` VALUES (4, '市场部', 'clouddb03');
INSERT INTO `dept` VALUES (5, '运维部', 'clouddb03');

SET FOREIGN_KEY_CHECKS = 1;
