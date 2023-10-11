CREATE TABLE topicos (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    mensagem TEXT NOT NULL,
    data_criacao TIMESTAMPTZ NOT NULL,
    status VARCHAR(25) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    curso VARCHAR(100) NOT NULL
);