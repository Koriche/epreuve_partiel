-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mer. 22 jan. 2020 à 13:32
-- Version du serveur :  10.4.6-MariaDB
-- Version de PHP :  7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `ensup_epreuve`
--
CREATE DATABASE IF NOT EXISTS `ensup_epreuve` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
USE `ensup_epreuve`;

-- --------------------------------------------------------

--
-- Structure de la table `cours`
--

CREATE TABLE `cours` (
  `c_theme` varchar(500) COLLATE utf8mb4_bin NOT NULL,
  `c_nombreheures` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Structure de la table `ecoles`
--

CREATE TABLE `ecoles` (
  `ec_nom` varchar(60) COLLATE utf8mb4_bin NOT NULL,
  `ec_mail` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `ec_adresse` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `ec_tel` varchar(12) COLLATE utf8mb4_bin NOT NULL,
  `ec_directeur` varchar(100) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Structure de la table `enseignants`
--

CREATE TABLE `enseignants` (
  `en_id` int(11) NOT NULL,
  `en_nom` varchar(25) COLLATE utf8mb4_bin NOT NULL,
  `en_prenom` varchar(25) COLLATE utf8mb4_bin NOT NULL,
  `en_mail` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `en_adresse` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `en_tel` varchar(13) COLLATE utf8mb4_bin NOT NULL,
  `en_matiere` varchar(40) COLLATE utf8mb4_bin NOT NULL,
  `en_pass` varchar(70) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Déchargement des données de la table `enseignants`
--

INSERT INTO `enseignants` (`en_id`, `en_nom`, `en_prenom`, `en_mail`, `en_adresse`, `en_tel`, `en_matiere`, `en_pass`) VALUES
(1, 'test', 'test', 'prof@prof.com', '123 rue nulle part, Plaisir', '0678908865', 'Mathématiques', '123123');

-- --------------------------------------------------------

--
-- Structure de la table `etudiants`
--

CREATE TABLE `etudiants` (
  `et_id` int(11) NOT NULL,
  `et_nom` varchar(25) COLLATE utf8mb4_bin NOT NULL,
  `et_prenom` varchar(25) COLLATE utf8mb4_bin NOT NULL,
  `et_mail` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `et_adresse` varchar(250) COLLATE utf8mb4_bin NOT NULL,
  `et_tel` varchar(13) COLLATE utf8mb4_bin NOT NULL,
  `et_naissance` varchar(30) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Déchargement des données de la table `etudiants`
--

INSERT INTO `etudiants` (`et_id`, `et_nom`, `et_prenom`, `et_mail`, `et_adresse`, `et_tel`, `et_naissance`) VALUES
(1, 'Mamamn', 'Jacky', 'letu@letu.com', '345 rue ailleurs a Elancourt', '0723221201', '23/03/1999');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `enseignants`
--
ALTER TABLE `enseignants`
  ADD PRIMARY KEY (`en_id`);

--
-- Index pour la table `etudiants`
--
ALTER TABLE `etudiants`
  ADD PRIMARY KEY (`et_id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `enseignants`
--
ALTER TABLE `enseignants`
  MODIFY `en_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `etudiants`
--
ALTER TABLE `etudiants`
  MODIFY `et_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
