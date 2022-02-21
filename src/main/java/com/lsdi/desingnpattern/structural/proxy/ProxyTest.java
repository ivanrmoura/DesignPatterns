package com.lsdi.desingnpattern.structural.proxy;

/*

Vamos falar sobre quando usar o padrão Proxy:

*Quando queremos uma versão simplificada de um objeto complexo ou pesado. Nesse caso, podemos representá-lo
    com um objeto esqueleto que carrega o objeto original sob demanda, também chamado de inicialização lenta.
    Isso é conhecido como Proxy Virtual
*Quando o objeto original está presente em um espaço de endereço diferente, e queremos representá-lo localmente .
    Podemos criar um proxy que faz to do o material clichê necessário, como criar e manter a conexão, codificação,
    decodificação, etc., enquanto o cliente acessa como estava presente em seu espaço de endereço local.
    Isso é chamado de Proxy Remoto
*Quando queremos adicionar uma camada de segurança ao objeto subjacente original para
    fornecer acesso controlado com base nos direitos de acesso do cliente . Isso é chamado de proxy de proteção

 */


public class ProxyTest {

    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();


        ExpensiveObject object2 = new ExpensiveObjectProxy();
        object2.process();
        object2.process();
    }
}
