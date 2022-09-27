/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : project_lifecycle

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 21/09/2022 09:44:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;


-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `contract_abbreviation` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '合同简称',
  `creator_id` varchar(4000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人编号 当前用户ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `contract_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '合同名称',
  `contract_signing_personnel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '合同签订人',
  `project_leader` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '项目负责人',
  `contract_start_time` datetime DEFAULT NULL COMMENT '合同开始时间',
  `contract_end_time` datetime DEFAULT NULL COMMENT '合同结束时间',
  `contract_amount` decimal(10, 2) DEFAULT NULL COMMENT '合同额',
  `research_office` int(10) DEFAULT NULL COMMENT '研究室:0安全所、1沉环所、2治理所、3工程所、4综合所、5x',
  `project_status` bit(1) DEFAULT b'0' COMMENT '项目状态 0在研1结题',
  `contract_archiving` bit(1) DEFAULT b'0' COMMENT '合同归档 0未归档1已归档2无单独合同',
  `project_level` int(10) DEFAULT 0 COMMENT '项目等级 0正常、1进度延期、2超低利润、4延期回款、8安全风险、16进度延期-自动',
  `first_party` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '甲方简称',
  `project_year` int(11) DEFAULT 2022 COMMENT '年度',
  `bid_security` decimal(10, 2) DEFAULT 0.00 COMMENT '投标保证金',
  `estimated_profit_margin` float DEFAULT 0 COMMENT '预计利润率',
  `deleted` bit(1) DEFAULT b'0' COMMENT '是否删除',
  `contribution_of_participants` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '参与人员贡献度',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  `bid_security_return` bit(1) DEFAULT b'0' COMMENT '投标保证金是否退回(0未退1已退)',
  `bid_fee` float(10, 2) DEFAULT 0.00 COMMENT '中标服务费',
  `bid_fee_invoicing` bit(1) DEFAULT b'0' COMMENT '中标服务费是否开发票',
  `receivable` float(10, 2) DEFAULT NULL COMMENT '应收款=累计开票-全部回款（在收支表插入开票或回款时修改）',
  `engineering` bit(1) DEFAULT b'0' COMMENT '跨年度工程类合同:0否1是',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 363 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '项目总表 项目总表' ROW_FORMAT = Compact;



-- ----------------------------
-- Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `project_id` int(11) DEFAULT NULL COMMENT '项目编号',
  `creator_id` int(11) DEFAULT NULL COMMENT '创建人编号 当前用户ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `agreed_report_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '约定报告名称',
  `agreed_submission_time` datetime DEFAULT NULL COMMENT '约定提交时间',
  `report_writer` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '报告主笔人',
  `examiner` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '审查人',
  `approver` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '审定人',
  `reviewer` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '审核人',
  `audit_time` datetime DEFAULT NULL COMMENT '审核时间',
  `report_archiving` bit(1) DEFAULT b'0' COMMENT '报告归档 0未归档1已归档',
  `deleted` bit(1) DEFAULT b'0' COMMENT '是否删除',
  `project_year` int(10) DEFAULT NULL COMMENT '年度',
  `serial_number` int(10) DEFAULT NULL COMMENT '序号',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 632 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '报告编写' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for revenue_expenditure
-- ----------------------------
DROP TABLE IF EXISTS `revenue_expenditure`;
CREATE TABLE `revenue_expenditure`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `project_id` int(11) DEFAULT NULL COMMENT '项目编号',
  `creator_id` varchar(4000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人编号 当前用户ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `project_year` int(11) DEFAULT NULL COMMENT '年度',
  `generation_date` datetime DEFAULT NULL COMMENT '产生日期',
  `amount` float(10, 2) DEFAULT NULL COMMENT '金额',
  `column_describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
  `column_type` int(11) DEFAULT NULL COMMENT '栏目类型 1年度开票2年度回款3差旅、招待4劳务派遣工资5劳务及专家费
  6外委材料已开票7外委设备已开票8外委服务已开票9其它支出10预付11分摊12未结算成本13已付款14固定资产15安环综合支出',
  `deleted` bit(1) DEFAULT b'0' COMMENT '是否删除',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1045 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '项目收支' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `deleted` bit(1) NOT NULL COMMENT '是否删除',
  `system_id` int(11) NOT NULL COMMENT '所属系统',
  `permission` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限/接口',
  `parent_id` int(11) NOT NULL COMMENT '父ID',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '权限描述',
  `sequence` smallint(6) NOT NULL COMMENT '排序号',
  `path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '路径',
  `component` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '组件',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '类型',
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '图标',
  `updated` datetime DEFAULT NULL COMMENT '修改时间',
  `level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '层级',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `id` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `deleted` bit(1) DEFAULT NULL COMMENT '是否删除',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `description` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
  `system_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '系统ID',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `system_type` int(11) DEFAULT NULL COMMENT '菜单类型',
  `admin` bit(1) DEFAULT NULL COMMENT '是否是管理角色',
  `create_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人',
  `user_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sys_role_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_resource`;
CREATE TABLE `sys_role_resource`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `deleted` bit(1) DEFAULT b'0' COMMENT '是否删除',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `resource_id` int(11) NOT NULL COMMENT '资源id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色-权限表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `deleted` bit(1) DEFAULT NULL COMMENT '是否删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '名称',
  `create_user_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人ID',
  `account` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '账号',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `admin` bit(1) DEFAULT NULL COMMENT '是否是管理员',
  `telephone` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电话',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  `update_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '修改人ID',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `role` int(11) DEFAULT NULL COMMENT '1 管理员 2 安全所 3 沉环所 4 治理所 5 工程所 6 综合所 7 项目人员',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_sys_user_1`(`create_user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '账户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `deleted` bit(1) DEFAULT b'0' COMMENT '是否删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '名称',
  `user_id` int(11) DEFAULT NULL COMMENT '账号ID',
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '账户-角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for work_situation
-- ----------------------------
DROP TABLE IF EXISTS `work_situation`;
CREATE TABLE `work_situation`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` int(11) DEFAULT NULL COMMENT '用户编号',
  `name_of_project_department` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '项目部名称',
  `health_status` int(11) DEFAULT 0 COMMENT '健康状态（0好、 1中、2差）',
  `mood` int(11) DEFAULT 0 COMMENT '心情（0好、1中、2差）',
  `to_say` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '我想说的话（自编、可不填）',
  `create_time` datetime DEFAULT NULL COMMENT '提交时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `deleted` bit(1) DEFAULT b'0' COMMENT '是否删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 69 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
