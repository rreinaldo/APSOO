-- Gera��o de Modelo f�sico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE marcacao (
id_marcacao numeric4) PRIMARY KEY,
id_dia_semana N�mero(4),
horario Datetime(),
id_turno N�mero(4),
tp_marcacao numeric(1)/*falha: chave estrangeira*/
)

CREATE TABLE dia_semana (
id_dia_semana N�mero(4) PRIMARY KEY,
id_turno N�mero(4),
nm_dia varchar(50),
tp_dia N�mero(1),
jornada N�mero(4)
)

CREATE TABLE func_turno (
cpf N�mero(11),
id_turno N�mero(4),
dt_inicial datetime,
dt_fim datetime
)

CREATE TABLE turno (
id_turno N�mero(4) PRIMARY KEY,
descricao varchar(200)
)

CREATE TABLE parcela (
id_parcela N�mero(4) PRIMARY KEY,
id_ferias N�mero(4),
id_fereia N�mero(4),
dt_inicial datetime,
dt_final datetime
)

CREATE TABLE ferias (
id_ferias N�mero(4) PRIMARY KEY,
cpf_func N�mero(11),
dias_gozados N�mero(2),
dias_vendidos N�mero(2)
)

CREATE TABLE licenca (
id_licenca N�mero(4) PRIMARY KEY,
cpf_func N�mero(11),
dt_inicial datetime,
dt_final datetime,
tp_licanca N�mero(1)
)

CREATE TABLE departamento (
id_depto N�mero(4) PRIMARY KEY,
descricao varchar(200)
)

CREATE TABLE funcionario (
cpf N�mero(11) PRIMARY KEY,
id_dept N�mero(4),
cpf_chefe N�mero(11),
nm_func varchar(50),
pis N�mero(11),
saldo_horas N�mero(10),
matr_func N�mero(6),
FOREIGN KEY(id_dept) REFERENCES departamento (id_depto)/*falha: chave estrangeira*/
)

CREATE TABLE evento (
id_evento N�mero(4) PRIMARY KEY,
cpf_chefe N�mero(11),
id_reg N�mero(4),
cpf_func N�mero(4),
descricao varchar(200),
tipo varchar(10),
justificativa varchar(200),
FOREIGN KEY(cpf_chefe) REFERENCES funcionario (cpf),
FOREIGN KEY(cpf_func) REFERENCES funcionario (cpf)
)

CREATE TABLE item_registro (
id_item N�mero(4) PRIMARY KEY,
id_reg N�mero(4),
horario datetime,
tipo_marcacao N�mero(4),
tipo_registro N�mero(4)
)

CREATE TABLE registro (
id_registro N�mero(4) PRIMARY KEY,
cpf_reg N�mero(11),
data datetime,
jornada N�mero(4),
FOREIGN KEY(cpf_reg) REFERENCES funcionario (cpf)
)

ALTER TABLE marcacao ADD FOREIGN KEY(id_dia_semana) REFERENCES dia_semana (id_dia_semana)
ALTER TABLE dia_semana ADD FOREIGN KEY(id_turno) REFERENCES turno (id_turno)
ALTER TABLE func_turno ADD FOREIGN KEY(cpf) REFERENCES funcionario (cpf)
ALTER TABLE func_turno ADD FOREIGN KEY(id_turno) REFERENCES turno (id_turno)
ALTER TABLE parcela ADD FOREIGN KEY(id_ferias) REFERENCES ferias (id_ferias)
ALTER TABLE parcela ADD FOREIGN KEY(id_fereia) REFERENCES ferias (id_ferias)
ALTER TABLE ferias ADD FOREIGN KEY(cpf_func) REFERENCES funcionario (cpf)
ALTER TABLE licenca ADD FOREIGN KEY(cpf_func) REFERENCES funcionario (cpf)
ALTER TABLE evento ADD FOREIGN KEY(id_reg) REFERENCES registro (id_registro)
ALTER TABLE item_registro ADD FOREIGN KEY(id_reg) REFERENCES registro (id_registro)
