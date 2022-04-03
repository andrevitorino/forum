INSERT INTO usuario(nome, email, senha) VALUES ('Aluno', 'aluno@email.com', '$2a$10$OWDMq8nS5HLGQLZBnOodq.ItzfhiKytWpwMKk4.vxTXfC7rahfEdm');
INSERT INTO usuario(nome, email, senha) VALUES ('Moderador', 'moderador@email.com', '$2a$10$OWDMq8nS5HLGQLZBnOodq.ItzfhiKytWpwMKk4.vxTXfC7rahfEdm');

INSERT INTO perfil(id, nome) VALUES (1, 'ROLE_ALUNO');
INSERT INTO perfil(id, nome) VALUES (2, 'ROLE_MODERADOR');

INSERT INTO usuario_perfis(usuario_id, perfis_id) VALUES (1, 1);
INSERT INTO usuario_perfis(usuario_id, perfis_id) VALUES (2, 2);

INSERT INTO curso(nome, categoria) VALUES ('Spring Boot', 'Programação');
INSERT INTO curso(nome, categoria) VALUES ('HTML5', 'Front-end');

INSERT INTO topico(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES ('Dúvida 001', 'Erro ao criar projeto 001', '2022-03-16 17:24:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO topico(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES ('Dúvida 002', 'Erro ao criar projeto 002', '2022-03-16 17:25:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO topico(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES ('Dúvida 003', 'Erro ao criar projeto 003', '2022-03-16 17:26:00', 'NAO_RESPONDIDO', 1, 2);