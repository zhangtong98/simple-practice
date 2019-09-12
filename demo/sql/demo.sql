/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 11/09/2019 03:47:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept_info
-- ----------------------------
DROP TABLE IF EXISTS `dept_info`;
CREATE TABLE `dept_info`  (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `dept_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称',
  PRIMARY KEY (`dept_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dept_info
-- ----------------------------
INSERT INTO `dept_info` VALUES (1, '市场部');
INSERT INTO `dept_info` VALUES (2, '商务部');
INSERT INTO `dept_info` VALUES (3, '行政部');
INSERT INTO `dept_info` VALUES (4, '开发部');

-- ----------------------------
-- Table structure for deptpost_info
-- ----------------------------
DROP TABLE IF EXISTS `deptpost_info`;
CREATE TABLE `deptpost_info`  (
  `deptpost_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `deptpost_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '岗位名称',
  `dept_id` int(11) NOT NULL COMMENT '部门id',
  PRIMARY KEY (`deptpost_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of deptpost_info
-- ----------------------------
INSERT INTO `deptpost_info` VALUES (1, '市场总监', 1);
INSERT INTO `deptpost_info` VALUES (2, '销售代表', 1);
INSERT INTO `deptpost_info` VALUES (3, '客户经理', 2);
INSERT INTO `deptpost_info` VALUES (4, '售前工程师', 2);
INSERT INTO `deptpost_info` VALUES (5, '人事专员', 3);
INSERT INTO `deptpost_info` VALUES (6, '内勤', 3);
INSERT INTO `deptpost_info` VALUES (7, '项目经理', 4);
INSERT INTO `deptpost_info` VALUES (8, '软件工程师', 4);

-- ----------------------------
-- Table structure for emp_info
-- ----------------------------
DROP TABLE IF EXISTS `emp_info`;
CREATE TABLE `emp_info`  (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `emp_no` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工编号',
  `emp_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工姓名',
  `emp_sex` tinyint(1) NULL DEFAULT NULL COMMENT '员工性别：1-男  0-女',
  `emp_date` date NULL DEFAULT NULL COMMENT '出生年月',
  `emp_address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭地址',
  `emp_dept_id` int(11) NOT NULL COMMENT '所属部门id',
  `emp_deptpost_id` int(11) NULL DEFAULT NULL COMMENT '岗位id',
  PRIMARY KEY (`emp_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of emp_info
-- ----------------------------
INSERT INTO `emp_info` VALUES (1, '111', 'zhangtong', 1, '2019-09-11', 'dlkjflakdjfl;kjlskfjalkjfsalj', 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
