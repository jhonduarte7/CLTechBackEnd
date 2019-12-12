/* Populate tabla pacientes */
INSERT INTO pacientes (documento_identidad, nombres, apellidos, sexo, fecha_nacimiento) VALUES ('1094427852', 'Jhonn Alexander', 'Duarte Rojas', 'masculino', '1980-11-22');
INSERT INTO pacientes (documento_identidad, nombres, apellidos, sexo, fecha_nacimiento) VALUES ('2457896544', 'Jose Aleberto', 'Perez Ramirez', 'masculino', '1977-08-12');
INSERT INTO pacientes (documento_identidad, nombres, apellidos, sexo, fecha_nacimiento) VALUES ('4579954566', 'Luis Fernando', 'Guarin Florian', 'masculino', '1981-09-10');
INSERT INTO pacientes (documento_identidad, nombres, apellidos, sexo, fecha_nacimiento) VALUES ('7748522598', 'Maria Josefina', 'Lambraño Rios', 'femenino', '1985-07-25');
INSERT INTO pacientes (documento_identidad, nombres, apellidos, sexo, fecha_nacimiento) VALUES ('7845123984', 'Linda Yaneth', 'Lisandro Alvarado', 'femenino', '1990-10-28');

/* Populate tabla tipo de orden */
INSERT INTO tipo_ordenes (id, nombre) VALUES (1, 'Rutina');
INSERT INTO tipo_ordenes (id, nombre) VALUES (2, 'Urgencia');

/* Populate tabla examenes */
INSERT INTO examenes (nombre) VALUES('Perfil 21');
INSERT INTO examenes (nombre) VALUES('Hematologia Completa');
INSERT INTO examenes (nombre) VALUES('Hemoglobina');
INSERT INTO examenes (nombre) VALUES('Toxicologico');

/* Creamos algunas ordenes */
INSERT INTO ordenes (tipo_id, fecha_ingreso, paciente_id) VALUES(1, NOW(), 1);
INSERT INTO ordenes (tipo_id, fecha_ingreso, paciente_id) VALUES(2, NOW(), 1);


/*Relacion en tabla intermedia en la cuarta forma norma de para examens-ordenes*/
INSERT INTO ordenes_lineas (linea_id, examen_id) VALUES(1, 1);




