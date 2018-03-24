# CPF

Verificador de autenticidade de números de cpf
Trabalha com o uso de sinais "/" , "-" & "."

Método static boolean **verificaCPF(String num)**
Retorna positivo caso o cpf seja verdadeiro

**Exemplos**
verificaCPF("123.123.123-12");
verificaCPF("123.123.123/12");
verificaCPF("123-123-123.12");