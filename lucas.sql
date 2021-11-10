-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 10-Nov-2021 às 01:56
-- Versão do servidor: 10.4.18-MariaDB
-- versão do PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `lucas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_user`
--

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL,
  `email` varchar(80) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `senha` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_user`
--

INSERT INTO `tb_user` (`id`, `email`, `nome`, `senha`) VALUES
(1, 'lucas', 'lucasrdelfino2005@gmail.com', 'lucas123'),
(2, 'rafael', 'rafaelmartins2005@gmail.com', 'rafael123'),
(3, 'vinicius', 'viniciusmatos2005@gmail.com', 'vinicius123'),
(4, 'joao', 'joaoabade2005@gmail.com', 'joao123'),
(5, 'joaop', 'joaopaixao2005@gmail.com', 'joaop123'),
(6, 'luis', 'luishenrique2005@gmail.com', 'luis123'),
(7, 'bruno', 'brunorogerio2005@gmail.com', 'bruno123'),
(8, 'lucasb', 'lucasrboni2005@gmail.com', 'lucasb123'),
(9, 'lucasa', 'lucasaraujo2005@gmail.com', 'lucasa123'),
(10, 'kevinbucker', 'kevinbucker2005@gmail.com', 'kevin123');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
