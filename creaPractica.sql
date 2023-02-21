/*Las líneas 2 y 3 están en comentarios, para usarse así la primera vez... luego de eso se quitan los comentarios para que todo funcione bien, en las siguientes ejecuciones */
drop schema practica ;
drop user usuario_practica;

/*Se crea la base de datos */
CREATE SCHEMA practica ;
/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario_practica'@'%' identified by 'la_Clave.';
/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;

/*Se crea la tabla de clientes llamada cliente... igual que la clase Cliente */
CREATE TABLE practica.estado (
  id_estado INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(20) NOT NULL,
  capital VARCHAR(30) NOT NULL,
  poblacion INT NULL,
  costas BIT(2) NULL,
  PRIMARY KEY (`id_estado`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

/*Se insertan 3 registros en la tabla cliente como ejemplo */
INSERT INTO practica.estado (id_estado, nombre, capital, poblacion, costas) VALUES 
(1,'Costa Rica', 'San Jose',     5154000,      2),
(2,'Bolivia', 'La Paz',     	12080000,      0),
(3,'China', 'Pekin',     1412000000,      1),
(4,'Estados Unidos', 'Washingtong D.C.',     331900000,      2);