create table if not exists usuario(id uuid primary key not null, nombre varchar, contrasena varchar not null, correo varchar not null, telefono varchar, genero char, nacimiento date, puntos integer);
create table if not exists empleado(asociacion varchar not null, primary key(id)) inherits(usuario);
create table if not exists asociacion(nit varchar primary key not null, nombre varchar  ,  telefono varchar ,  direccion varchar ,  imagen varchar );
create table if not exists publicacion( id integer primary key not null,  fecha date, estado char,  objeto integer, usuario uuid);
create table if not exists fiesta( participantes integer,  hora_inicio date,  hora_final date,  puntos integer,  actividad integer) inherits(publicacion);
create table if not exists objeto( id integer primary key not null,  nombre varchar  ,  imagen varchar ,  descripcion varchar );
create table if not exists tag( id integer primary key not null,  objeto integer,  valor integer );
create table if not exists oferta( id integer primary key not null, empleado uuid,  publicacion integer ,  puntos integer,  fecha date, estado char);

