drop table if exists usuario,empleado,asociacion,publicacion,fiesta,objeto,tag,publicacion_tags,oferta,hibernate_sequences cascade;

create table if not exists usuario(id uuid primary key not null, nombre varchar, contrasena varchar not null, correo varchar not null, telefono varchar, genero char, nacimiento date, puntos integer);
create table if not exists empleado(asociacion uuid not null, primary key(id)) inherits(usuario);
create table if not exists asociacion(id uuid primary key not null, nit varchar not null, nombre varchar  ,  telefono varchar ,  direccion varchar ,  imagen varchar );
create table if not exists publicacion( id uuid primary key not null,  fecha date, estado char,  objeto uuid, usuario uuid);
create table if not exists fiesta( participantes integer,  hora_inicio date,  hora_final date,  puntos integer,  actividad integer) inherits(publicacion);
create table if not exists objeto( id uuid primary key not null,  nombre varchar  ,  imagen varchar ,  descripcion varchar );
create table if not exists tag( id uuid primary key not null, descripcion varchar );
create table if not exists oferta( id uuid primary key not null, empleado uuid,  publicacion uuid not null,  puntos integer,  fecha date, estado char);
create table if not exists publicacion_tags(id uuid primary key not null, id_publicacion uuid, id_tag uuid);

alter table publicacion add constraint FK_Publicacion_Objeto foreign key (objeto) references Objeto(id);
alter table publicacion add constraint FK_Publicacion_Usuario foreign key (usuario) references Usuario(id);
alter table oferta add constraint FK_Oferta_Publicacion foreign key (publicacion) references Publicacion(id);
alter table oferta add constraint FK_Oferta_Empleado foreign key (empleado) references empleado(id);
alter table empleado add constraint FK_Empleado_Asociacion foreign key (asociacion) references Asociacion(id);


insert into asociacion(id, nit,nombre,telefono,direccion,imagen) values('6bbf0744-7434-46b9-bb95-53905df538e7','asociacion de admins','nombre1','555-555-555','calle 1 # 1 - 1','https://google.com/');

insert into usuario (id,nombre,contrasena,correo,telefono,genero,nacimiento,puntos) values ('6bbf0744-74b4-46b9-bb05-53905d4538e7','admin','admin','admin@admin.com','555-555-555','1','2011-11-10',0); 

insert into empleado (id,nombre,contrasena,correo,telefono,genero,nacimiento,puntos, asociacion) values ('6bbf0744-74b4-46b9-bb05-53905d4538e9','admin2','admin2','admin2@admin.com','555-555-555','0','2011-11-10',0,'6bbf0744-7434-46b9-bb95-53905df538e7');

insert into objeto(id, nombre, imagen, descripcion) values ('15bf0744-7434-46b9-bb95-53905df538e7','objeto1','imagen1','descripcion1');

insert into fiesta(id, fecha, estado, objeto,usuario, participantes, hora_inicio, hora_final, puntos, actividad) values ('15bf0744-7434-46b9-bb95-53905df538e9','2020-11-1','1','15bf0744-7434-46b9-bb95-53905df538e7','6bbf0744-74b4-46b9-bb05-53905d4538e7', 1, '2020-11-10','2020-11-10',0,1);

insert into publicacion(id, fecha, estado, objeto,usuario) values ('18bf0744-7434-46b9-bb95-53905df538e7','2020-11-1','0','15bf0744-7434-46b9-bb95-53905df538e7','6bbf0744-74b4-46b9-bb05-53905d4538e7');

insert into tag(id, descripcion) values ('18bf0744-7434-46b9-bb95-53905d4538e7','comida');

insert into publicacion_tags(id,id_publicacion, id_tag) values ('f7bf0744-1484-f6b9-bb95-53905df538e7','18bf0744-7434-46b9-bb95-53905df538e7','18bf0744-7434-46b9-bb95-53905d4538e7');

insert into oferta(id,empleado,publicacion,puntos,fecha,estado) values ('f7bf8744-1484-f6b9-bb95-53905df538e7','6bbf0744-74b4-46b9-bb05-53905d4538e9','18bf0744-7434-46b9-bb95-53905df538e7',0,'2020-11-10','1');


select distinct * from usuario;