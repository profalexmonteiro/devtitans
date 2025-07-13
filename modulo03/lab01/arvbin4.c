#include <stdio.h>
#include <stdlib.h>

struct arv {
  int info;
  struct arv* esq;
  struct arv* dir;
};

typedef struct arv Arv;

Arv* inicializa(void)
{
  return NULL;
}

Arv* cria(int c, Arv* sae, Arv* sad)
{
  Arv* p=(Arv*)malloc(sizeof(Arv));
  p->info = c;
  p->esq = sae;
  p->dir = sad;
  return p;
}

int vazia(Arv* a)
{
  return a==NULL;
}

Arv* libera (Arv* a){
  if (!vazia(a)){
    libera(a->esq); /* libera sae */
    libera(a->dir); /* libera sad */
    free(a); /* libera raiz */
  }
  return NULL;
}

void imprime_pre (Arv* a)
{
  if (a != NULL) {
    printf("%d ", a->info);       // visita a raiz
    imprime_pre(a->esq);          // percorre a subárvore esquerda
    imprime_pre(a->dir);          // percorre a subárvore direita
  }
}

void imprime_in (Arv* a)
{
  if (a != NULL) {
    imprime_in(a->esq);           // percorre a subárvore esquerda
    printf("%d ", a->info);       // visita a raiz
    imprime_in(a->dir);           // percorre a subárvore direita
  }
}

void imprime_pos (Arv* a)
{
  if (a != NULL) {
    imprime_pos(a->esq);          // percorre a subárvore esquerda
    imprime_pos(a->dir);          // percorre a subárvore direita
    printf("%d ", a->info);       // visita a raiz
  }
}

Arv* busca(Arv* a, int valor) {
  if (a == NULL) return NULL;
  if (a->info == valor) return a;

  Arv* aux = busca(a->esq, valor);
  if (aux != NULL) return aux;

  return busca(a->dir, valor);
}

Arv* busca_pai(Arv* a, int valor) {
  if (a == NULL || (a->esq == NULL && a->dir == NULL))
    return NULL;

  if ((a->esq != NULL && a->esq->info == valor) ||
      (a->dir != NULL && a->dir->info == valor))
    return a;

  Arv* p = busca_pai(a->esq, valor);
  if (p != NULL) return p;

  return busca_pai(a->dir, valor);
}

int main()
{
  Arv* a;

  // Nós folhas
  Arv* n12 = cria(12, NULL, NULL);
  Arv* n67 = cria(67, NULL, NULL);
  Arv* n40 = cria(40, NULL, NULL);

  // Subárvores
  Arv* n34 = cria(34, NULL, n67);
  Arv* n5 = cria(5, n12, n34);
  Arv* n80 = cria(80, NULL, n40);

  // Raiz
  a = cria(45, n5, n80);

  // ---------- NOVO: criar subárvore a enxertar ----------
  Arv* n66 = cria(66, NULL, NULL);
  Arv* n31 = cria(31, NULL, NULL);
  Arv* nova_subarvore = cria(3, n66, n31);

  // ---------- Buscar o nó com valor 80 ----------
  Arv* no80 = busca(a, 80);
  if (no80 != NULL) {
    no80->esq = nova_subarvore;  // Enxerta à esquerda
  } else {
    printf("Nó 80 não encontrado!\n");
  }
  
  // ---------- Impressão ----------
  printf("Pré-fixado: ");
  imprime_pre(a);
  printf("\n");

  printf("In-fixado: ");
  imprime_in(a);
  printf("\n");

  printf("Pós-fixado: ");
  imprime_pos(a);
  printf("\n");

    // ---------- Poda com busca e libera ----------
  Arv* alvo = busca(a, 5);           // encontra o nó 5
  Arv* pai = busca_pai(a, 5);        // encontra o pai do nó 5

  if (alvo != NULL && pai != NULL) {
    if (pai->esq == alvo)
      pai->esq = NULL;               // desconecta do lado esquerdo
    else if (pai->dir == alvo)
      pai->dir = NULL;               // desconecta do lado direito

    libera(alvo);                    // libera subárvore com raiz 5
  }

    
  // ---------- Impressão ----------
  printf("Pré-fixado: ");
  imprime_pre(a);
  printf("\n");

  printf("In-fixado: ");
  imprime_in(a);
  printf("\n");

  printf("Pós-fixado: ");
  imprime_pos(a);
  printf("\n");

  // ---------- Libera memória ----------
  a = libera(a);
  return 0;
}
