<h3 align="center">Oracle Next Education Challenge - Forum </h3>

<br>

<div align="center">

<img width="75px" height="75px" src="https://github.com/lucas-adm/one-challenge-springboot-forum/assets/118030896/963da4e2-d3ff-4de2-902c-14308618c84e">
<img width="75px" height="75px" src="https://github.com/lucas-adm/one-challenge-springboot-forum/assets/118030896/92fc976d-58fa-40b1-bf2e-6769f63831ad">
<img width="75px" height="75px" src="https://github.com/lucas-adm/one-challenge-springboot-hotel/assets/118030896/ba256dce-7970-404f-8ebc-93e482480e77">
<img width="75px" height="75px" src="https://github.com/lucas-adm/one-challenge-springboot-forum/assets/118030896/314fdf40-8e8d-466c-ad78-2dfd9820e08d">
<img width="75px" height="75px" src="https://github.com/lucas-adm/one-challenge-springboot-hotel/assets/118030896/498fd551-bb05-4d22-8560-a14b3f1d076c">

###### *PostgreSQL, Java, Spring Boot, JWT, Docker*

#

</div>

### Como realizar as requisições ⁉

#### ▶ Faça suas requisições *<a href="https://forum-cg7l.onrender.com/swagger-ui.html">aqui</a>* 

<details>
<summary>/login</summary>
  
```java
"email":"admin@one.com",
"senha":"123456"
```

<div align="center">
  
![efetuarLogin](https://i.imgur.com/8Kqm3sW.png)

</div>

> Copie o valor do Token BCrypt retornado

</details>

<details>
<summary>/cadastrar e /atualizar</summary>

#### ***ENUMs***

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
</details>

###### Banco de Dados e Server Deploy por <a href="https://render.com">*Render*</a>

<div align="center">

![swagger](https://i.imgur.com/gBGculH.png)
  
</div>
