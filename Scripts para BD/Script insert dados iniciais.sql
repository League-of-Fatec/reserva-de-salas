INSERT INTO USUARIO (NOME, EMAIL , SENHA, CURSO, TIPO_USUARIO) 
VALUES ('Matheus', 'emailestudante@email.com' ,'senhaestudante', 'DSM' , 'Estudante' );

INSERT INTO USUARIO (NOME, EMAIL , SENHA, CURSO, TIPO_USUARIO) 
VALUES ('Gabriel', 'emailprofessor@email.com' ,'senhaprofessor', 'DSM' , 'Professor' );

INSERT INTO USUARIO (NOME, EMAIL , SENHA, CURSO, TIPO_USUARIO) 
VALUES ('Geraldo', 'emailadm@email.com' ,'senhaadm', null , 'Administrador' );

INSERT INTO sala_de_aula 
				(identificacao, disponivel, cadeiras, mesas, computadores, projetor, ventilador, arCondicionado) 
				 VALUES ('1A', 'Sim', '20', '20', '1', 'Sim', 'Sim', 'Não'); 