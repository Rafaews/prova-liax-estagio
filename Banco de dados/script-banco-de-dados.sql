CREATE DATABASE provaliax;
USE provaliax;

CREATE TABLE tbod_associado (
  cd_associado INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nm_associado VARCHAR(50),
  dt_nascimento DATE NULL,
  dt_cadastro DATE NULL,
  PRIMARY KEY(cd_associado)
);

CREATE TABLE tbod_associado_cargo (
  cd_associado INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  id_cargo INTEGER UNSIGNED NULL,
  PRIMARY KEY(cd_associado)
);

CREATE TABLE tbod_cargo (
  id_cargo INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nm_cargo VARCHAR(50),
  resp_cargo INTEGER UNSIGNED NULL,
  dt_cadastro DATE NULL,
  PRIMARY KEY(id_cargo)
);

CREATE TABLE tbod_permissao_cargo (
  id_permissao INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  id_cargo INTEGER UNSIGNED NULL,
  titulo_permissao VARCHAR(50),
  data_expiracao DATE NULL,
  PRIMARY KEY(id_permissao)
);


INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00112233', 'Bertolomeu', '1954-08-15', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00112244', 'Maria', '1972-08-01', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00112255', 'Juliana', '1960-05-12', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00112266', 'Ricardo', '1966-07-13', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00112277', 'João', '1977-11-22', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00112288', 'Inacio', '1962-11-25', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00112299', 'Ortencio', '1962-06-28', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00113311', 'Bruno', '1962-03-02', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00113322', 'Flavio', '1992-08-14', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00113333', 'Luke', '1997-02-27', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00113344', 'Leia', '1909-09-09', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00113355', 'Palpatine', '1962-02-07', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00113366', 'Francisco', '1970-04-18', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00113377', 'Linus', '1955-07-02', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO VALUES ('00113388', 'Stallman', '1938-01-01', '2019-11-20');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00112233', '1');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00112244', '1');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00112255', '2');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00112266', '3');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00112277', '4');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00112288', '5');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00112299', '6');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00113311', '5');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00113322', '6');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00113333', '7');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00113344', '8');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00113355', '9');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00113366', '1');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00113377', '2');
INSERT INTO provaliax.TBOD_ASSOCIADO_CARGO VALUES ('00113388', '1');
INSERT INTO provaliax.tbod_cargo(`nm_cargo`, `resp_cargo`, `dt_cadastro`) VALUES ('Auxiliar de cadastro', '1', '2019-11-20');
INSERT INTO provaliax.tbod_cargo(`nm_cargo`, `resp_cargo`, `dt_cadastro`) VALUES ('Auxiliar de faturamento', '1', '2019-11-20');
INSERT INTO provaliax.tbod_cargo(`nm_cargo`, `resp_cargo`, `dt_cadastro`) VALUES ('Auxiliar de processamento', '1', '2019-11-20');
INSERT INTO provaliax.tbod_cargo(`nm_cargo`, `resp_cargo`, `dt_cadastro`) VALUES ('Analista desenvolvedor de software', '1', '2019-11-20');
INSERT INTO provaliax.tbod_cargo(`nm_cargo`, `resp_cargo`, `dt_cadastro`) VALUES ('Estagiario', '1', '2019-11-20');
INSERT INTO provaliax.tbod_cargo(`nm_cargo`, `resp_cargo`, `dt_cadastro`) VALUES ('Gerente de RH', '1', '2019-11-20');
INSERT INTO provaliax.tbod_cargo(`nm_cargo`, `resp_cargo`, `dt_cadastro`) VALUES ('Gerente de cadastro', '1', '2019-11-20');
INSERT INTO provaliax.tbod_cargo(`nm_cargo`, `resp_cargo`, `dt_cadastro`) VALUES ('Analista de faturamento', '1', '2019-11-20');
INSERT INTO provaliax.tbod_cargo(`nm_cargo`, `resp_cargo`, `dt_cadastro`) VALUES ('DBA', '1', '2019-11-20');
INSERT INTO provaliax.tbod_cargo(`nm_cargo`, `resp_cargo`, `dt_cadastro`) VALUES ('Auxiliar de limpeza', '1', '2019-11-20');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('1','Acesso ao modulo de cadastro', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('2','Acesso ao modulo de cadastro', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('3','Acesso ao modulo de cadastro', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('4','Acesso ao modulo de cadastro', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('5','Acesso ao modulo de cadastro', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('6','Acesso ao modulo de cadastro', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('7','Acesso ao modulo de cadastro', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('8','Acesso ao modulo de cadastro', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('9','Acesso ao modulo de cadastro', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('1','Acesso ao modulo de faturamento', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('2','Acesso ao modulo de faturamento', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('3','Acesso ao modulo de faturamento', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('4','Acesso ao modulo de faturamento', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('5','Acesso ao modulo de faturamento', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('6','Acesso ao modulo de faturamento', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('7','Acesso ao modulo de faturamento', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('8','Acesso ao modulo de faturamento', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('9','Acesso ao modulo de faturamento', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('1','Acesso ao painel do BI', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('2','Acesso ao painel do BI', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('3','Acesso ao painel do BI', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('4','Acesso ao painel do BI', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('5','Acesso ao painel do BI', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('6','Acesso ao painel do BI', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('7','Acesso ao painel do BI', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('8','Acesso ao painel do BI', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('9','Acesso ao painel do BI', '2020-01-01');
INSERT INTO provaliax.TBOD_PERMISSAO_CARGO (`id_cargo`, `titulo_permissao`, `data_expiracao`) VALUES ('9','Acesso a base de dados', '2020-01-01');

