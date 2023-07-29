use aula;


create  table categoria
(
    id int primary key  auto_increment,
    nome varchar(50) not null
);

insert into categoria values (1,"limpeza");
insert into categoria values (2,"Cereais");


create table produto
(
      id int primary key auto_increment,
      nome varchar(50) not null,
      id_categoria int
);

insert into  produto values (1,"arroz",2);
insert into  produto values (2,"sabão",1);


select  p.nome as nomeProduto,c.nome nomeCategoria from produto p
left join categoria c
on p.id_categoria = c.id;


--left join (tras tudo que nao tem categoria
-- inner join ( tras os relacionados aos que tem categoria)
-- right join ( tras os que tem categoria)
