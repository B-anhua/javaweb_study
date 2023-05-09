/*
 Navicat Premium Data Transfer

 Source Server         : Mysql
 Source Server Type    : MySQL
 Source Server Version : 80030
 Source Host           : localhost:3306
 Source Schema         : fanhuage

 Target Server Type    : MySQL
 Target Server Version : 80030
 File Encoding         : 65001

 Date: 09/05/2023 13:52:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for flower
-- ----------------------------
DROP TABLE IF EXISTS `flower`;
CREATE TABLE `flower`  (
  `fid` int NOT NULL,
  `fname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `fnum` int NULL DEFAULT NULL,
  `fprice` decimal(10, 2) NULL DEFAULT NULL,
  `fstatus` int NULL DEFAULT 1,
  PRIMARY KEY (`fid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of flower
-- ----------------------------
INSERT INTO `flower` VALUES (1, '46朵白玫瑰1', 3, 59.00, 1);
INSERT INTO `flower` VALUES (2, '999朵红玫瑰', 4, 999.00, 1);
INSERT INTO `flower` VALUES (3, '10支白玫瑰', 3, 35.00, 1);
INSERT INTO `flower` VALUES (4, '19朵红玫瑰', 3, 29.00, 0);
INSERT INTO `flower` VALUES (5, '99朵蓝色妖姬', 19, 45.00, 1);
INSERT INTO `flower` VALUES (6, '98朵蓝色妖姬', 34, 19.00, 1);
INSERT INTO `flower` VALUES (7, '狐尾百合', 3, 78.00, 0);
INSERT INTO `flower` VALUES (8, '狐尾百合', 1, 59.00, 1);
INSERT INTO `flower` VALUES (9, '风杏子', 3, 12.00, 1);
INSERT INTO `flower` VALUES (10, '紫色风信子', 5, 23.00, 1);
INSERT INTO `flower` VALUES (11, '龙舌兰', 4, 15.00, 1);
INSERT INTO `flower` VALUES (12, '紫罗兰', 2, 49.00, 0);
INSERT INTO `flower` VALUES (15, '白玫瑰', 2, 3.00, 1);
INSERT INTO `flower` VALUES (16, '9朵白玫瑰', 14, 2.00, 1);
INSERT INTO `flower` VALUES (18, '59朵白玫瑰', 45, 3.00, 1);

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `created_at` datetime NULL DEFAULT NULL,
  `status` int(2) UNSIGNED ZEROFILL NULL DEFAULT 01,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1', '张三', '111144123', '13133131311', '131313@qq.com', '2023-05-07 00:49:48', 01);
INSERT INTO `member` VALUES ('1654573039863533569', '李四', '131314', '14513451234', '1313@qq.com', '2023-05-07 00:49:48', 01);
INSERT INTO `member` VALUES ('1654575338442719234', '王五', '43334534', '13412341234', '12313@qq.com', '2023-05-08 11:42:21', 01);
INSERT INTO `member` VALUES ('1654575771672399874', '高启强', '433131313', '14513451344', '32323232@qq.com', '2023-05-08 11:41:47', 00);
INSERT INTO `member` VALUES ('1655456780371509250', '高启兰', '24214113211', '13678786868', '23423@qq.com', '2023-05-08 12:49:52', 01);
INSERT INTO `member` VALUES ('1655660752075288578', '3242', '24242', '19334343434', '224@qq.com', '2023-05-08 19:47:39', 01);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `order_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `customer_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `order_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `order_address` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `order_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `order_status` int(2) UNSIGNED ZEROFILL NULL DEFAULT 00,
  `create_time` datetime NULL DEFAULT NULL,
  `order_num` int NULL DEFAULT NULL,
  `order_amount` double(100, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1655615995601043458', '高启兰', '白玫瑰', '重庆移通学院', '13134533456', 01, '2023-05-07 00:49:48', 66, 6666);
INSERT INTO `orders` VALUES ('20230508174649718369', '李四', '白玫瑰', '北京市海淀区', '15414141313', 01, '2023-05-07 17:46:49', 233, 67);
INSERT INTO `orders` VALUES ('20230508194531010103', '高启强', '红玫瑰', '北京市海淀区', '13131313133', 01, '2023-05-06 11:45:32', 999, 1314);
INSERT INTO `orders` VALUES ('20230508205947660567', '高启强', '红玫瑰', '北京市海淀区', '13134567654', 00, '2023-05-07 20:59:47', 999, 1314);
INSERT INTO `orders` VALUES ('20230508222409256791', '高启强', '蓝色妖姬', '北京市海淀区', '15676537897', 00, '2023-05-08 06:24:10', 999, 1314);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` int NOT NULL,
  `uname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `upassword` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 'admin');

SET FOREIGN_KEY_CHECKS = 1;
