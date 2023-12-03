CREATE DATABASE A3_PSC;

use A3_PSC;

CREATE TABLE Tbl_Fun_GOV (
  id_Fun_GOV INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  orgao VARCHAR(20) NULL,
  cargo VARCHAR(40) NULL,
  dt_nascimento DATE NULL,
  email VARCHAR(100) NOT NULL,
  senha VARCHAR(25) NOT NULL,
  PRIMARY KEY(id_Fun_GOV)
);

CREATE TABLE Tbl_Cidadao (
  id_Cidadao INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  dt_nascimento DATE NULL,
  email VARCHAR(100) NOT NULL,
  senha VARCHAR(25) NOT NULL,
  PRIMARY KEY(id_Cidadao)
);

CREATE TABLE Tbl_Denuncia (
  id_Denuncia INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Tbl_Cidadao_id_Cidadao INTEGER UNSIGNED NOT NULL,
  descrição VARCHAR(2000) NOT NULL,
  localizacao VARCHAR(250) NOT NULL,
  imagem_anexada LONGBLOB NULL,
  PRIMARY KEY(id_Denuncia, Tbl_Cidadao_id_Cidadao),
  INDEX Tbl_Denuncia_FKIndex1(Tbl_Cidadao_id_Cidadao),
  FOREIGN KEY(Tbl_Cidadao_id_Cidadao)
    REFERENCES Tbl_Cidadao(id_Cidadao)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE Tbl_Fun_GOV_has_Tbl_Denuncia (
  Tbl_Fun_GOV_id_Fun_GOV INTEGER UNSIGNED NOT NULL,
  Tbl_Denuncia_id_Denuncia INTEGER UNSIGNED NOT NULL,
  Tbl_Denuncia_Tbl_Cidadao_id_Cidadao INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(Tbl_Fun_GOV_id_Fun_GOV, Tbl_Denuncia_id_Denuncia, Tbl_Denuncia_Tbl_Cidadao_id_Cidadao),
  INDEX Tbl_Fun_GOV_has_Tbl_Denuncia_FKIndex1(Tbl_Fun_GOV_id_Fun_GOV),
  INDEX Tbl_Fun_GOV_has_Tbl_Denuncia_FKIndex2(Tbl_Denuncia_id_Denuncia, Tbl_Denuncia_Tbl_Cidadao_id_Cidadao),
  FOREIGN KEY(Tbl_Fun_GOV_id_Fun_GOV)
    REFERENCES Tbl_Fun_GOV(id_Fun_GOV)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Tbl_Denuncia_id_Denuncia, Tbl_Denuncia_Tbl_Cidadao_id_Cidadao)
    REFERENCES Tbl_Denuncia(id_Denuncia, Tbl_Cidadao_id_Cidadao)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);
