--Script para criar base de dados do MyNews

CREATE TABLE tb_users (
cd_user INTEGER PRIMARY KEY NOT NULL,
nm_user VARCHAR(50) NOT NULL,
cd_email VARCHAR(50) NOT NULL,
cd_password VARCHAR(200) NOT NULL, 
dt_nascimento INTEGER NOT NULL,
dt_creation INTEGER NOT NULL, 
id_profile INTEGER);

ALTER TABLE tb_users change cd_user cd_user INTEGER NOT NULL AUTO_INCREMENT;
ALTER TABLE tb_users ADD COLUMN ds_most_used VARCHAR(50);

CREATE TABLE tb_news (
cd_news INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT, 
nm_titulo VARCHAR(100) NOT NULL, 
ds_conteudo VARCHAR(1000), 
cd_link VARCHAR(200), 
nm_categoria VARCHAR(30) NOT NULL, 
cd_image VARCHAR(500));

ALTER TABLE tb_news ADD COLUMN dt_reference INTEGER NOT NULL;

COMMIT;

