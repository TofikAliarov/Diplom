-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1:3306
-- Время создания: Май 14 2019 г., 20:55
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
-- Структура таблицы `marks`
--

DROP TABLE IF EXISTS `marks`;
CREATE TABLE IF NOT EXISTS `marks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `subject_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `mark` int(11) NOT NULL,
  `theme` varchar(25) DEFAULT NULL,
  `role` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Studentid` (`student_id`,`subject_id`),
  KEY `id` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `marks`
--

INSERT INTO `marks` (`id`, `student_id`, `subject_id`, `date`, `mark`, `theme`, `role`) VALUES
(1, 13, 2, '2019-04-01', 5, 'asd', 1),
(2, 13, 2, '2019-04-03', 4, 'asd', 1),
(3, 13, 2, '2019-04-04', 3, 'ewq', 2),
(4, 13, 2, '2019-04-01', 3, 'qwe', 3),
(5, 13, 2, '2019-05-08', 4, NULL, 1),
(6, 13, 2, '2019-05-15', 4, NULL, 1),
(7, 13, 2, '2019-05-21', 4, NULL, 2),
(8, 13, 2, '2019-05-09', 5, NULL, 2),
(9, 13, 2, '2019-05-11', 3, NULL, 2),
(10, 13, 2, '2019-05-09', 3, NULL, 2);

-- --------------------------------------------------------

--
-- Структура таблицы `marks_role`
--

DROP TABLE IF EXISTS `marks_role`;
CREATE TABLE IF NOT EXISTS `marks_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `marks_role`
--

INSERT INTO `marks_role` (`id`, `role`) VALUES
(1, 'common'),
(2, 'test'),
(3, 'semestr');

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
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Дамп данных таблицы `student`
--

INSERT INTO `student` (`id`, `login`, `password`, `name`, `last_name`, `patronymic`, `group_id`) VALUES
(2, 's1502', '12345', 'Maria', 'Bugay', 'Anatolievna', 1),
(1, 's1501', '54321', 'Tofik', 'Aliarv', 'Shamilovich', 1),
(9, 's1504', '12345', 'Petro', 'Petrov', 'Petrivovich', 1),
(8, 's1503', '12345', 'Ivan', 'Ivanov', 'Ivanovich', 1),
(10, 's1601', '12345', 'Alexey', 'Alexeev', 'Alexeevich', 2),
(11, 's1602', '12345', 'Nikita', 'Nikitenko', 'Nikitovich', 2),
(12, 's1603', '12345', 'Maria', 'Kryak', 'Ivanovna', 2),
(13, 's1604', '12345', 'Olga', 'Pegro', 'Pavlovna', 2),
(14, 's1701', '12345', 'Maxim', 'Noven', 'Pavlovich', 3),
(15, 's1702', '12345', 'Stanislav', 'Evreyko', 'Dmitrievich', 3),
(16, 's1703', '12345', 'Irina', 'Petrash', 'Olegovna', 3),
(17, 's1704', '12345', 'Natalia', 'Tyshko', 'Ivanovna', 3),
(18, 's1801', '12345', 'Mihail', 'Kylow', 'Mihailovich', 4),
(19, 's1802', '12345', 'Ivan', 'Lobov', 'Petrovich', 4),
(20, 's1803', '12345', 'Marina', 'Ulichova', 'Pavlovna', 4),
(21, 's1804', '12345', 'Nikolay', 'Sidorov', 'Ivanovich', 4);

-- --------------------------------------------------------

--
-- Структура таблицы `student_groups`
--

DROP TABLE IF EXISTS `student_groups`;
CREATE TABLE IF NOT EXISTS `student_groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `groups_name` varchar(11) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `subject_group_id` varchar(255) DEFAULT NULL,
  `subject_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `groups_name` (`groups_name`),
  KEY `teacher_id` (`teacher_id`),
  KEY `id` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `student_groups`
--

INSERT INTO `student_groups` (`id`, `groups_name`, `teacher_id`, `subject_group_id`, `subject_id`) VALUES
(1, 'tm-85b', 7, NULL, NULL),
(2, 'tm-86b', 6, NULL, NULL),
(3, 'tm-87b', 8, NULL, NULL),
(4, 'tm-88b', 1, NULL, NULL);

-- --------------------------------------------------------

--
-- Структура таблицы `subject`
--

DROP TABLE IF EXISTS `subject`;
CREATE TABLE IF NOT EXISTS `subject` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `subject_name` text COLLATE utf8_bin NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `group_id` int(11) DEFAULT NULL,
  `group_name` varchar(11) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Subjectid` (`id`),
  KEY `teacher_id` (`teacher_id`),
  KEY `student_id` (`group_id`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Дамп данных таблицы `subject`
--

INSERT INTO `subject` (`id`, `subject_name`, `teacher_id`, `group_id`, `group_name`) VALUES
(1, 'Высшая математика', 2, 4, 'tm-88b'),
(2, 'Сопромат', 7, 2, 'tm-88b'),
(5, 'Искусственный интеллект', 2, 1, 'tm-85b'),
(6, 'Информационные системы', 7, 1, 'tm-85b'),
(7, 'Управление ИТ-проектом', 2, 1, 'tm-85b'),
(8, 'чето то там что естьв  рассписании но я не понимаю', 2, 1, 'tm-85b'),
(9, 'Сетевые технологии', 3, 2, 'tm-86b'),
(10, 'Автоматические расчеты деталей магин', 7, 2, 'tm-86b'),
(11, 'Системный анализ', 2, 2, 'tm-86b'),
(12, 'Мат. статистика', 2, 2, 'tm-86b'),
(13, 'Веб технологии', 1, 2, 'tm-86b'),
(14, 'Исследование ОС', 2, 3, 'tm-87b'),
(15, 'Вариационка', 2, 3, 'tm-87b'),
(16, 'Кросс-плат программирование', 3, 3, 'tm-87b'),
(17, 'Теория вероятности', 2, 3, 'tm-87b'),
(18, 'Основы проектирования машин', 7, 3, 'tm-87b');

-- --------------------------------------------------------

--
-- Структура таблицы `subject_group`
--

DROP TABLE IF EXISTS `subject_group`;
CREATE TABLE IF NOT EXISTS `subject_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_id` int(11) NOT NULL,
  `subject_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `group_id` (`group_id`,`subject_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `subject_group`
--

INSERT INTO `subject_group` (`id`, `group_id`, `subject_id`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 1, 2);

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
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Дамп данных таблицы `teacher`
--

INSERT INTO `teacher` (`id`, `login`, `password`, `name`, `last_name`, `patronymic`) VALUES
(2, 'Konov', '12345', 'Olga', 'Konovalenko', 'Evgenevna'),
(1, 'Bondar', '12345', 'Marina', 'Bondarenko', 'Alexandrovna'),
(3, 'serik', '12345', 'Vladimir', 'Serikov', 'Ivanovich'),
(4, 'tkach', '12345', 'Nikolay', 'Tkachuk', 'Anatolievich'),
(5, 'vasil', '12345', 'Anton', 'Vasilyev', 'Yuryevich'),
(6, 'Bondarenko', '12345', 'Alexey', 'Bondarenko', 'Viktorovich'),
(7, 'ustin', '12345', 'Alexander', 'Ustinenko', 'Vitalevich'),
(8, 'grab', '12345', 'Andrey', 'Grabovsky', 'Vladimirovich');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
