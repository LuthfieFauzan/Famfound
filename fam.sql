-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 09, 2024 at 04:08 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fam`
--

-- --------------------------------------------------------

--
-- Table structure for table `branch`
--

CREATE TABLE `branch` (
  `No` int(11) DEFAULT NULL,
  `ID_Branch` char(8) NOT NULL,
  `Brc_Name` varchar(30) NOT NULL,
  `Brc_Addrs` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `branch`
--

INSERT INTO `branch` (`No`, `ID_Branch`, `Brc_Name`, `Brc_Addrs`) VALUES
(2, 'asd', 'asd', 'asd'),
(1, 'br000001', 'ALF Foundation Indonesia', 'Jl.Aja jadian kaga');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `No` int(11) DEFAULT NULL,
  `ID_Dept` char(8) NOT NULL,
  `Dep_Name` varchar(30) NOT NULL,
  `Dep_JobDesk` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`No`, `ID_Dept`, `Dep_Name`, `Dep_JobDesk`) VALUES
(1, 'Dept0001', 'Keuangan', 'mengurus pengeluaran dan perpajakan yang ada');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `No` int(11) DEFAULT NULL,
  `ID_Employee` char(8) NOT NULL,
  `Emp_Name` varchar(30) NOT NULL,
  `Emp_Address` varchar(30) NOT NULL,
  `Emp_DOB` date NOT NULL,
  `Emp_Gender` varchar(5) NOT NULL,
  `Emp_pnum` char(12) NOT NULL,
  `Emp_MS` varchar(20) NOT NULL,
  `MS_Date` date NOT NULL,
  `Emp_Relig` varchar(10) NOT NULL,
  `ID_Branch` char(8) NOT NULL,
  `ID_Dept` char(8) NOT NULL,
  `ID_Salary` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `No` int(11) DEFAULT NULL,
  `ID_Salary` char(2) NOT NULL,
  `Salary_Month` varchar(13) NOT NULL,
  `Salary_Year` varchar(13) NOT NULL,
  `incentive` varchar(12) NOT NULL,
  `transport` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`No`, `ID_Salary`, `Salary_Month`, `Salary_Year`, `incentive`, `transport`) VALUES
(0, 'Rp', 'RP100.000.000', 'Rp500.000', 'Rp250.000', 'Dept0001');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `branch`
--
ALTER TABLE `branch`
  ADD PRIMARY KEY (`ID_Branch`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`ID_Dept`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`ID_Employee`),
  ADD KEY `ID_Branch` (`ID_Branch`),
  ADD KEY `ID_Dept` (`ID_Dept`),
  ADD KEY `ID_Salary` (`ID_Salary`);

--
-- Indexes for table `salary`
--
ALTER TABLE `salary`
  ADD PRIMARY KEY (`ID_Salary`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`ID_Branch`) REFERENCES `branch` (`ID_Branch`),
  ADD CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`ID_Dept`) REFERENCES `department` (`ID_Dept`),
  ADD CONSTRAINT `employee_ibfk_3` FOREIGN KEY (`ID_Salary`) REFERENCES `salary` (`ID_Salary`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
