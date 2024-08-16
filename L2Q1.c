#include <stdio.h>

void imprimirLista(int* lista, int m, int pos){
  printf("\n");
  for(int i = 0; i < pos; i++){
    printf("%i ", lista[i]);
  }
  for(int i = pos; i < m; i++){
    printf("NIL ");
  }
printf("\n");
}

int buscaLista(int* lista, int pos, int e){
  int i = 0;
for(; i < pos && lista[i] <= e; i++){
  if(lista[i] == e){
    printf("Elemento na posição %i ", i + 1);
    return i;
  }
}
  if(lista[i] != e){
printf("Elemento não encontrado");
      i = pos;
  }
return i;
}

void adicionarLista(int* lista, int m, int* pos, int e){
  if(*pos < m){
int i = 0;
    while(i < *pos && lista[i] <= e){
      i++;
    }
    for(int j = *pos; j > i; j--){
      lista[j] = lista[j - 1];
    }
    lista[i] = e;
    *pos = *pos + 1;
    printf("Elemento adicionado na posição %i\n", i + 1);
  }
else{
  printf("Lista cheia\n");
}
}

void removerLista(int* lista, int* pos, int e){
  e = buscaLista(lista, *pos, e);
  if (e < *pos){
for(;e < *pos; e++){
  lista[e] = lista[e + 1];
}
*pos = *pos - 1;
    printf("excluído");
}
}

//Main

int main(void){
  int m = 0;
  do{
  printf("Qual o tamanho da lista? ");
  scanf("%i", &m);
  getchar();
    if(m < 1){
      printf("Tamanho inválido\n");
    }
  }while(m < 1);
int lista[m];
  int pos = 0;
  int on = 1;
int e;
  while(on){
    printf("\n1 - Imprimir lista\n2 - Buscar elemento\n3 - adicionar elemento\n4 - Remover elemento\nOutro - Sair\n");
  scanf("%i", &e);
getchar();
  switch(e){
    case 1:
    imprimirLista(lista, m, pos);
    break;
    case 2:
    printf("Qual o elemento? ");
    scanf("%i", &e);
      getchar();
      buscaLista(lista, pos, e);
    break;
    case 3:
    printf("Qual o elemento? ");
    scanf("%i", &e);
    getchar();
    adicionarLista(lista, m, &pos, e);
    break;
    case 4:
    printf("Qual o elemento? ");
    scanf("%i", &e);
getchar();
    removerLista(lista, &pos, e);
    break;
    default:
    printf("encerrando...");
    on = 0;
break;
  }
  }

  return 0;
}
