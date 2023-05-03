# checklist-implantacao
Projeto de um checkList de Implantação de Sistema

**Ferramentas**
* Java - versão 17
* Postman
* Banco de Dados - Postgres 15.2 com SGBD Dbeaver 
* Versionamento Git - Github - SourceTree - Repositório: git@github.com:AlynneRaquel/checklist-implantacao.git
 * IDE - STS Spring
 * GitFlow - Dev -> Master

**Estrutura de pastas**
* Workspace: implantacao
* c:\implantacao\
* C:\implantacao\PostgreSQL\15
* Senha:postgres

## Requisitos Funcionais
*versão 1.0*
* Cadastrar usuário:
    (id, nome, usuario, senha, tipo(técnico, gerente, analista, teste, outros))
* Cadastrar Cliente:
   (id, estado, cidade(nome), ativo(S/N)
* Cadastrar checkList:
  (id, descricao, status, usuário)

**Próximas Versões:**
* Autenticar usuário usando AUT;
* add ao cliente os campos : usuarioCadastro, usuarioImplantador, migração(S/N), status( em migração, em implantação, em execução);
