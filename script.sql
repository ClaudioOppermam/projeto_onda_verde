
CREATE TABLE tb_onda_verde(
  cod_usuario SERIAL PRIMARY KEY,
  login VARCHAR(200) NOT NULL,
  senha VARCHAR(200) NOT NULL
);
SELECT * FROM tb_onda_verde;

INSERT INTO tb_onda_verde
(login, senha) VALUES
('admin', 'admin');