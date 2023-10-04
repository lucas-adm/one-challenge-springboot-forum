<h1 align="center">Oracle Next Educatio Challenge - Forum </h1>

<br>

<div align="center">

![java](https://github.com/loolcas/OracleNE-Forum/assets/118030896/65a3142d-42d1-4e19-b844-683b90fc2d6f) ![spring](https://github.com/loolcas/OracleNE-Forum/assets/118030896/7bd00acb-a595-447b-8d13-f784f0a18c3e) ![jsonrequest](https://github.com/loolcas/OracleNE-Forum/assets/118030896/323a2715-fd0c-4a39-a2e0-aeeb8515109b) ![mysql](https://github.com/loolcas/OracleNE-Forum/assets/118030896/f30cb0ba-71af-402d-a388-f5459f8e75e8)

</div>

### 🔐 *Requisitos*
- JDK 17+
- MySQL

## Passo a passo:

### 👨🏻‍💻 *Preparos*
- Windows + Pause/Break -> Configurações avançadas do sistema -> Variáveis de ambiente -> Path -> Editar
- Criar um caminho para o JDK e para o MySQL e passar os respectivos endereço dos arquivos.

### ⚙ *Configurações*
1. Baixar o projeto: <a href="https://github.com/loolcas/OracleNE-Forum/archive/refs/tags/v1.0.0.zip"> *Link aqui* </a>
> Extrair no Desktop.
2. Acessar o Prompt de Comando e inserir as linhas de comando abaixo, uma por vez.
> Para acessar o Promp de Comando basta pressionar Windows+R, digitar cmd e pressionar Enter
```java
mysql -u 'username do banco de dados' -p
```
```java
'senha do usuario do banco de dados'
```
```java
create database forum;
```
```java
exit
```
```java
cd Desktop
```
```java
cd OracleNE-Forum
```
> Caso o username e senha do seu banco de dados sejam 'root' execute a primeira linha de comando, do contrário execute a segunda:
```java
java -jar target/forum-0.0.1-SNAPSHOT.jar
```
```java
java -Dspring.profile.active=prod -DDATASOURCE_USERNAME='username do banco de dados' -DDATASOURCE_PASSWORD='senha do usuario do banco de dados' -jar target/forum-0.0.1-SNAPSHOT.jar
```

### Executando o projeto
> Após o servidor iniciar, minimize-o e acesse este endereço pelo navegador:
```java
http://localhost:8080/swagger-ui.html
```

<div align="center">

![swagger](https://i.imgur.com/gBGculH.png)
  
</div>

### Para fechar o servidor bastar seguir este passo:
> Volte ao CMD e pressione duas vezes Ctrl+C e insira:
```java
exit
```
