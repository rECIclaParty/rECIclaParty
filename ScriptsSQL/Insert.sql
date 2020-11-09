insert into usuario (id,nombre,contrasena,correo,telefono,genero,nacimiento,puntos) values ('6bbf0744-74b4-46b9-bb05-53905d4538e7','admin','admin','admin@admin.com','555-555-555','1','2011-11-10',0); 

insert into asociacion(nit,nombre,telefono,direccion,imagen) values('asociacion de admins','nombre1','555-555-555','calle 1 # 1 - 1','https://google.com/');

insert into empleado (id,nombre,contrasena,correo,telefono,genero,nacimiento,puntos, asociacion) values ('6bbf0744-74b4-46b9-bb05-53905d4538e9','admin2','admin2','admin2@admin.com','555-555-555','0','2011-11-10',0,'asociacion de admins');

insert into objeto(id, nombre, imagen, descripcion) values (1,'objeto1','imagen1','descripcion1');

insert into fiesta(id, fecha, estado, objeto,usuario, participantes, hora_inicio, hora_final, puntos, actividad) values (2,'2020-11-1','A',1,'6bbf0744-74b4-46b9-bb05-53905d4538e7', 1, '2020-11-10','2020-11-10',0,1);

insert into publicacion(id, fecha, estado, objeto,usuario) values (1,'2020-11-1','A',1,'6bbf0744-74b4-46b9-bb05-53905d4538e7');