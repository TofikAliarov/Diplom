-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1:3306
-- Время создания: Апр 13 2019 г., 13:42
-- Версия сервера: 5.7.24
-- Версия PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `markcheck`
--

-- --------------------------------------------------------

--
-- Структура таблицы `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `login` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `admin`
--

INSERT INTO `admin` (`id`, `login`, `password`) VALUES
(1, 'admin1', '12345'),
(2, 'admin2', '12345');

-- --------------------------------------------------------

--
-- Структура таблицы `gets`
--

DROP TABLE IF EXISTS `gets`;
CREATE TABLE IF NOT EXISTS `gets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `studen_tid` int(11) NOT NULL,
  `subject_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `mark` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Studentid` (`studen_tid`,`subject_id`),
  KEY `id` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `gets`
--

INSERT INTO `gets` (`id`, `studen_tid`, `subject_id`, `date`, `mark`) VALUES
(1, 1, 1, '2019-04-01', 5),
(2, 1, 2, '2019-04-03', 4),
(3, 2, 2, '2019-04-04', 3),
(4, 2, 1, '2019-04-01', 3);

-- --------------------------------------------------------

--
-- Структура таблицы `group`
--

DROP TABLE IF EXISTS `group`;
CREATE TABLE IF NOT EXISTS `group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(5) COLLATE utf8_bin NOT NULL,
  `teacher_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Teacherid` (`teacher_id`),
  KEY `Groupname` (`group_name`),
  KEY `group_name` (`group_name`),
  KEY `id` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Дамп данных таблицы `group`
--

INSERT INTO `group` (`id`, `group_name`, `teacher_id`) VALUES
(2, 'Tm85b', 1);

-- --------------------------------------------------------

--
-- Структура таблицы `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(16) COLLATE utf8_bin NOT NULL,
  `password` varchar(16) COLLATE utf8_bin NOT NULL,
  `name` varchar(20) COLLATE utf8_bin NOT NULL,
  `last_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `patronymic` varchar(20) COLLATE utf8_bin NOT NULL,
  `group_name` varchar(5) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Studentid` (`id`),
  KEY `Groupid` (`group_name`),
  KEY `Studentid_2` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Дамп данных таблицы `student`
--

INSERT INTO `student` (`id`, `login`, `password`, `name`, `last_name`, `patronymic`, `group_name`) VALUES
(2, 's1502', '12345', 'Maria', 'Bugay', 'Anatolievna', ''),
(1, 's1501', '54321', 'Tofik', 'Aliarv', 'Shamilovich', 'Tm85b');

-- --------------------------------------------------------

--
-- Структура таблицы `subject`
--

DROP TABLE IF EXISTS `subject`;
CREATE TABLE IF NOT EXISTS `subject` (
  `Subjectid` int(6) NOT NULL AUTO_INCREMENT,
  `subjectName` text COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`Subjectid`),
  KEY `Subjectid` (`Subjectid`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Дамп данных таблицы `subject`
--

INSERT INTO `subject` (`Subjectid`, `subjectName`) VALUES
(1, 'Высшая математика'),
(2, 'Сопромат');

-- --------------------------------------------------------

--
-- Структура таблицы `teacher`
--

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE IF NOT EXISTS `teacher` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `login` varchar(16) COLLATE utf8_bin NOT NULL,
  `password` varchar(16) COLLATE utf8_bin NOT NULL,
  `name` varchar(20) COLLATE utf8_bin NOT NULL,
  `last_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `patronymic` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Teacherid` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Дамп данных таблицы `teacher`
--

INSERT INTO `teacher` (`id`, `login`, `password`, `name`, `last_name`, `patronymic`) VALUES
(2, 'Konov', '12345', 'Olga', 'Konovalenko', 'Evgenevna'),
(1, 'Bondar', '12345', 'Marina', 'Bondarenko', 'Alexandrovna');

-- --------------------------------------------------------

--
-- Структура таблицы `teaches`
--

DROP TABLE IF EXISTS `teaches`;
CREATE TABLE IF NOT EXISTS `teaches` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_id` int(11) NOT NULL,
  `group_name` varchar(5) NOT NULL,
  `subject_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Teacherid` (`teacher_id`,`group_name`,`subject_id`),
  KEY `id` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `teaches`
--

INSERT INTO `teaches` (`id`, `teacher_id`, `group_name`, `subject_id`) VALUES
(1, 1, 'Tm85b', 1),
(2, 2, 'Tm85b', 2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
