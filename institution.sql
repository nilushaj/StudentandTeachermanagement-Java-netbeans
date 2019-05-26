-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2017 at 05:49 AM
-- Server version: 5.5.34
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `institution`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE IF NOT EXISTS `attendance` (
  `Card_ID` varchar(50) COLLATE utf8_unicode_ci  NOT NULL,
  `Student_ID` varchar(10) COLLATE utf8_unicode_ci  NOT NULL,
  `Subject_ID` varchar(10) COLLATE utf8_unicode_ci  NOT NULL,
  `NumberOfDaysAttend` int(10) NOT NULL,
  `Card_IssueDate` date NOT NULL,
  `Card_ExpiaryDate` date NOT NULL,
  PRIMARY KEY (`Card_ID`),
  KEY `fk_student_id` (`Student_ID`),
  KEY `fk_subject_id` (`Subject_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `Student_ID` varchar(10) COLLATE utf8_unicode_ci  NOT NULL,
  `Student_Name` text COLLATE utf8_unicode_ci  NOT NULL,
  `Student_AdmissionDate` date NOT NULL,
  `Student_Address` text COLLATE utf8_unicode_ci  NOT NULL,
  `Student_DateOfBirth` date NOT NULL,
  `Student_Age` int(8) NOT NULL,
  `Student_ContactNo` int(12) NOT NULL,
  `Student_PhotoID` varchar(150) COLLATE utf8_unicode_ci  NOT NULL,
  PRIMARY KEY (`Student_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
CREATE TABLE IF NOT EXISTS `subject` (
  `Subject_ID` varchar(10) COLLATE utf8_unicode_ci  NOT NULL,
  `Subject_Name` varchar(15) COLLATE utf8_unicode_ci  NOT NULL,
  `Grade` int(8) NOT NULL,
  `Teacher_ID` varchar(10) COLLATE utf8_unicode_ci  NOT NULL,
  PRIMARY KEY (`Subject_ID`),
  KEY `fk_teacher_id` (`Teacher_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `teacher_details`
--

DROP TABLE IF EXISTS `teacher_details`;
CREATE TABLE IF NOT EXISTS `teacher_details` (
  `Teacher_ID` varchar(10) COLLATE utf8_unicode_ci  NOT NULL,
  `Teacher_Name` text COLLATE utf8_unicode_ci  NOT NULL,
  `Teacher_Address` text COLLATE utf8_unicode_ci  NOT NULL,
  `Teacher_ContactNo` int(12) NOT NULL,
  `Teacher_EMail` varchar(50) COLLATE utf8_unicode_ci  NOT NULL,
  `Teacher_PhotoID` varchar(150) COLLATE utf8_unicode_ci  NOT NULL,
  PRIMARY KEY (`Teacher_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `User_ID` varchar(10) COLLATE utf8_unicode_ci  NOT NULL,
  `User_Name` varchar(50) COLLATE utf8_unicode_ci  NOT NULL,
  `User_Password` varchar(20) COLLATE utf8_unicode_ci  NOT NULL,
  `User_Address` varchar(100) COLLATE utf8_unicode_ci  NOT NULL,
  `User_EMail` varchar(100) COLLATE utf8_unicode_ci  NOT NULL,
  PRIMARY KEY (`User_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`User_ID`, `User_Name`, `User_Password`, `User_Address`, `User_EMail`) VALUES
('u1', 'Nilusha', '1234', 'Ja-ela', 'nilusha@gmail.com'),
('u2', 'Manoranjana', '123', 'Badulla', 'manoranjana@gmail.com'),
('u3', 'Kasun', '1234', 'Bope', 'kasun@gmail.com'),
('u4', 'Nirmal', '1234', 'Colombo', 'nirmal@yahoo.com');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `attendance`
--
ALTER TABLE `attendance`
  ADD CONSTRAINT `fk_student_id` FOREIGN KEY (`Student_ID`) REFERENCES `student` (`Student_ID`),
  ADD CONSTRAINT `fk_subject_id` FOREIGN KEY (`Subject_ID`) REFERENCES `subject` (`Subject_ID`);

--
-- Constraints for table `subject`
--
ALTER TABLE `subject`
  ADD CONSTRAINT `fk_teacher_id` FOREIGN KEY (`Teacher_ID`) REFERENCES `teacher_details` (`Teacher_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
