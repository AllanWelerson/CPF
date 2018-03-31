# CPF

**Verificador de autenticidade de números de cpf** 

**Instalação e uso**
* Faça o download do arquivo: <a href="https://www.4shared.com/file/E_fHewZLei/CPF.html" target=_blank>CPF.jar</a>
* Adicione o .jar na biblioteca
* Faça o importe com :
> import cpf.Verifica;


---

**Classe Verifica**
* Função boolean verificaCPF()
* EX: 
> if(Verifica.verificaCPF("123.123.123-12")){
>    System.out.println("CPF ok");
>}else{
>    System.out.println("CPF incorreto");
>}