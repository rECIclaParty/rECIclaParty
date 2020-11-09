alter table publicacion add constraint FK_Publicacion_Objeto foreign key (objeto) references Objeto(id);
alter table publicacion add constraint FK_Publicacion_Usuario foreign key (usuario) references Usuario(id);
alter table oferta add constraint FK_Oferta_Publicacion foreign key (publicacion) references Publicacion(id);
alter table oferta add constraint FK_Oferta_Empleado foreign key (empleado) references empleado(id);
alter table empleado add constraint FK_Empleado_Asociacion foreign key (asociacion) references Asociacion(nit);
