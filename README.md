<h1 align="center">Oracle Next Education Challenge - Forum </h1>

<br>

<div align="center">

![render cloud](https://i.imgur.com/ONuAAaH.png) ![java](https://github.com/loolcas/OracleNE-Forum/assets/118030896/56b6809f-726b-438a-8306-f0c2aa137452) ![spring](https://github.com/loolcas/OracleNE-Forum/assets/118030896/48f12733-0ba4-45eb-9b16-01479ddb99b5) ![jwt](https://github.com/loolcas/OracleNE-Forum/assets/118030896/f82adbfa-1052-4eef-9d44-85053969a39b) ![json](https://github.com/loolcas/OracleNE-Forum/assets/118030896/cd1c0b53-1a1b-4708-9254-0621040e1c10) ![postgresql](https://github.com/loolcas/OracleNE-Forum/assets/118030896/bbf8c3a2-f922-4235-874f-ad0e9a4f5e1b)



###### *Render Cloud, Java, Spring Boot, JSON Web Token, Http Request, PostgreSQL Server*

</div>

<br>

### ▶ <a href="https://oraclene-forum-4g8q.onrender.com/swagger-ui/index.html">***App disponível aqui!***</a>

<br>

## **Como realizar as requisições ⁉**
- Acesse o botão ***Try Out*** dentro do campo ***autenticacao-controller*** e passe esta chave:
```java
{
  "email":"admin@one.com",
  "senha":"123456"
}
```

<br>

<div align="center">
  
![efetuarLogin](https://i.imgur.com/8Kqm3sW.png)

</div>

> Copie o valor do Token BCrypt retornado

- Agora, na parte de cima da página, acesse o botão ***Authorize*** cole o valor copiado para liberar todas as requisições!

<br>

<div align="center">

![](https://i.imgur.com/oFJOwA2.png)

</div>

> Requisições liberadas

<br>

### ***ENUMs***

###### Cursos disponíveis para cadastro
```java
public enum Curso {
    Java_OO,
    Java_Excecoes,
    Java_e_Java_Lang,
    Java_consumindo_api,
    Java_trabalhando_com_lambda,
    Java_Collections,
    Java_Spring_Boot;
}
```
###### Status disponíveis para atualização
```java
public enum Status {
    NAO_RESPONDIDO,
    NAO_SOLUCIONADO,
    SOLUCIONADO,
    FECHADO;
}
```

<br>

<div align="center">

![swagger](https://i.imgur.com/gBGculH.png)
  
</div>

<br>

> Cloud utilizada para o deploy:
```java
https://render.com
```
