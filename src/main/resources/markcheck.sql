-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1:3306
-- Время создания: Апр 22 2019 г., 13:13
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
-- Структура таблицы `groups`
--

DROP TABLE IF EXISTS `groups`;
CREATE TABLE IF NOT EXISTS `groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `groups_name` varchar(5) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `teacher_id` (`teacher_id`),
  KEY `id` (`id`),
  KEY `student_id` (`student_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `groups`
--

INSERT INTO `groups` (`id`, `groups_name`, `teacher_id`, `student_id`) VALUES
(1, 'eedsf', 2, 0),
(2, 'dsfsd', 1, 0);

-- --------------------------------------------------------

--
-- Структура таблицы `marks`
--

DROP TABLE IF EXISTS `marks`;
CREATE TABLE IF NOT EXISTS `marks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `subject_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `mark` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Studentid` (`student_id`,`subject_id`),
  KEY `id` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `marks`
--

INSERT INTO `marks` (`id`, `student_id`, `subject_id`, `date`, `mark`) VALUES
(1, 1, 1, '2019-04-01', 5),
(2, 1, 2, '2019-04-03', 4),
(3, 2, 2, '2019-04-04', 3),
(4, 2, 1, '2019-04-01', 3);

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
  `group_id` int(5) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Studentid` (`id`),
  KEY `Groupid` (`group_id`),
  KEY `Studentid_2` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Дамп данных таблицы `student`
--

INSERT INTO `student` (`id`, `login`, `password`, `name`, `last_name`, `patronymic`, `group_id`) VALUES
(2, 's1502', '12345', 'Maria', 'Bugay', 'Anatolievna', 1),
(1, 's1501', '54321', 'Tofik', 'Aliarv', 'Shamilovich', 2),
(4, 'qwewe', 'qweqwe', 'wqeqwe', 'qweqwe', 'qweqwe', 1),
(5, 'weqw', 'eqwwqe', 'wqeqw', 'wqeqw', 'wqeq', 2),
(6, 'wqeqwe', 'wqeqwe', 'qweqwe', 'weqe', 'qweqwe', 1),
(7, 'wqeqwe', 'qweqwe', 'qwe', 'wqeqe', 'wqeq', 2);

-- --------------------------------------------------------

--
-- Структура таблицы `subject`
--

DROP TABLE IF EXISTS `subject`;
CREATE TABLE IF NOT EXISTS `subject` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `subject_name` text COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Subjectid` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Дамп данных таблицы `subject`
--

INSERT INTO `subject` (`id`, `subject_name`) VALUES
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
