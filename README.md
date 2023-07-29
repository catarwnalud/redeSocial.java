#
# Trabalho Prático - LPOO
  
                                                      redeSocial.java

 _Por: {catarina.ludmila, maria_anjos}_


## Descrição

Este trabalho é a nossa “rede social de publicação em texto”.  A implementação do tema foi feita na linguagem de programação Java. 
Para isso, foram criadas seis classes, sendo elas: post, postagem, comentário, usuário, seguidor, e Main. Além disso, foram utilizados
também: construtores, métodos, setters e getters. O programa irá realizar a leitura de dados por meio de entrada no teclado e, conforme as 
informações fornecidas e opções selecionadas pelo usuário, irá executar os métodos necessários para satisfazer o que foi solicitado.

#

## Casos de teste

- **Caso de cadastro**:

  Ao selecionar a opção 1 da página inicial, o usuário poderá cadastrar um e-mail, senha e @.
  Caso o e-mail ou @ já estejam sendo utilizados por algum usuário já registrado, o programa irá
  exibir “Este email já está sendo utilizado! Tente outro” ou “Este user já está sendo utilizado!
  Tente outro”. Quando o cadastro for possível, a mensagem será “Cadastrado com sucesso!”.

- **Caso de login**:
  
  Ao selecionar a opção 2 da página inicial, o usuário deve digitar o e-mail e senha cadastrados.
  Caso digite a senha incorreta, o programa irá exibir “Falha no login” e irá retornar para a página
  inicial até digitar corretamente. Quando o login for informado corretamente, será exibido o @ da
  conta e a mensagem “Logado com sucesso!”.

- **Caso de usuário logado**:

  Já logado, o programa irá exibir o menu principal da conta, com as opções: (1) postagens, (2) seguidores,
  (3) configurações da conta e (4) sair da conta.
  
    **(1) Postagens**
  
    Caso o usuário selecione “postagens”, ele terá outras quatro opções:
  
      (1) O que você está pensando? - em que será possível criar um post, após informar o número do post e o texto dele, e o programa imprime a mensagem “Postagem adicionada!”;
  
      (2) Excluir postagem - o usuário informa o número da postagem a ser excluída, e o programa imprime “Postagem removida!”;
      
      (3) Minha timeline - caso selecionada, essa opção irá exibir duas novas opções, sendo elas:
  
          (1) Ver as postagens - irá mostrar todas as postagens de todos os usuários;
    
          (2) Comentários - caso selecionada, irá mostrar, novamente, duas novas opções:

              (1) Fazer comentário - o usuário informa o @ do autor do post original, o número do post, o número do comentário e por último, o texto do comentário. Por fim, o programa imprime “Comentário adicionado!”;

              (2) Deletar comentário - o usuário informa o @ do autor do post original, o número do post e o número do comentário. Por fim, o programa imprime “Comentário removido!”;
    
      (4) Minhas postagens - mostra todas as postagens do usuário.

  **(2) Seguidores**

    Caso o usuário selecione “seguidores”, ele terá outras três opções:
  
      (1) Adicionar seguidor - o usuário informa o @ da outra conta que será adicionada, e o programa imprime “Seguidor adicionado!”;

      (3) Remover seguidor - o usuário informa o @ da conta que será removida de sua lista de seguidores, e o programa imprime “Seguidor removido!”;

      (4) Meus seguidores - o programa irá imprimir todos os @ das contas presentes na lista de seguidores do usuário.

   **(3) Configurações da conta**
 
    Caso o usuário selecione “configurações da conta”, ele terá outras três opções:

      (1) Alterar meu e-mail - o usuário informa o novo e-mail que será utilizado na conta e o programa imprime “Email alterado!”;

      (2) Alterar meu @ - o usuário informa o novo @ que será utilizado na conta e o programa imprime “User alterado!”;

      (3) Alterar minha senha - o usuário informa a nova senha que será utilizada na conta e o programa imprime “Senha alterada!”.

  **(4) Sair da conta**

    Por fim, quando o usuário selecionar essa opção, o programa irá encerrar aquela sessão e irá retornar para a primeira página, com as opções de cadastro ou login. 

#
