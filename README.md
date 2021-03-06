## AppsDockerLab

Criação de duas aplicações java e configurando a criação de suas respectivas imagens através do Dockerfile.

###Descrição dos Dockerfiles:

1. Criação de uma imagem intermediaria com maven para compilação da aplicação.
2. Criação de uma imagem baseada na distribuição alpine com openjdk instalado.
3. Copia a aplicação compilada da primeira imagem para a imagem alpine.
4. expõe a porta de acesso a aplicação.
5. Cria variaveis de ambiente utilizadas no container.
6. Executa a aplicação.

Para subir as duas imagens ao mesmo tempo foi escrito um docker-componse.yml fazendo o bind das portas expostas nos dockerfiles para portas no host.

Para testar é possível executar uma requisição GET a raiz(/) das aplicações, lembrando de acessar as portas configuradas no docker-composer file.
