# MoneyMinder
## Requisitos 

- [ ] CRUD Movimentações
- [ ] CRUD Categorias
- [ ] Dashboard
- [ ] Autenticação

## Endpoints

### Categorias

`GET` /categoria

Lista todas as categorias cadastradas no sistema.

`200` sucesso

---

`GET` /categoria/{id}

Retorna os detalhes de uma categoria com `id` informado

**Códigos de status**

`200` sucesso
`404` id não encontrado

---

`POST` /categoria

Cadastrar uma nova categoria.

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|----------
| nome|string|✅|Um nome curto para identificar a categoria
|icone|string|❌|O nome do icone conforme biblioteca material desing

**Códigos de status**

`201` criado com sucesso
`404` validação falou

`DELETE` /categoria/{id}

Apaga a categoria com o `id` informado

**Códigos de status**

`204` apagado com sucesso
`404` id não encontrado

---

`PUT` /categoria/{id}

Altera a categoria com o `id` informado

| campo | tipo | obrigatório | descrição 
|-------|------|:-------------:|----------
| nome|string|✅|Novo nome curto para identificar a categoria
|icone|string|✅|Novo nome do icone conforme biblioteca material desing

**Códigos de status**

`201` criado com sucesso
`404` validação falou

**Schema**

```js
{
    "id": 1,
    "nome": "Alimentação",
    "icone": "fast-food" 
}
```