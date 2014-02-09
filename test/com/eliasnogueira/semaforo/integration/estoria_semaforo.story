
Narrative:
In order to aprender sobre as leis de transito
As a aluno do ensino fundamental
I want to aprender as diferentes cores da sinalizacao semaforica
					 
Scenario:  Transicao de cores de verde para amarelo
Given que eu estou na pagina de visualizacao
When a cor do semaforo e verde
Then a proxima cor do semaforo e amarelo

Scenario:  Transicao de cores de amarelo para vermelho
Given que eu estou na pagina de visualizacao
When a cor do semaforo e amarelo
Then a proxima cor do semaforo e vermelho

Scenario:  Transicao de cores de vermelho para verde
Given que eu estou na pagina de visualizacao
When a cor do semaforo e vermelho
Then a proxima cor do semaforo e verde