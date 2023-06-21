CREATE TABLE `salateste`.`sala_de_aula` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `identificacao` VARCHAR(30) NOT NULL,
  `disponivel` VARCHAR(10) NOT NULL,
  `cadeiras` INT UNSIGNED NOT NULL,
  `mesas` INT UNSIGNED NOT NULL,
  `ventilador` VARCHAR(10) NOT NULL,
  `arCondicionado` VARCHAR(10) NOT NULL,
  `computadores` VARCHAR(10) NOT NULL,
  projetor VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `salateste`.`usuario` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `senha` VARCHAR(100) NOT NULL,
  tipo_usuario VARCHAR(15) NOT NULL,
  curso VARCHAR (40),
  PRIMARY KEY (`id`));
  
  CREATE TABLE `salateste`.`reserva` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  salaNome VARCHAR(45) NOT NULL,
  idSala INT UNSIGNED NOT NULL, 
  `data` VARCHAR(10) NOT NULL,
  `horarioInicio` VARCHAR(10) NOT NULL,
  `horarioFim` VARCHAR(10) NOT NULL,
  `turma` VARCHAR(45) NOT NULL,
  FOREIGN KEY (idSala) REFERENCES sala_de_aula(id), 
  PRIMARY KEY (`id`));