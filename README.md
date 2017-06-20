# PEE - Propabilidade e Estatística

Análise de performance: tempo de execução do cálculo da sequência de Fibonacci de forma iterativa e recursiva.

Trabalho para a matéria de PEE do 3º semestre do curso de ADS do IFSP, campus Caraguatatuba

### Installation

To install on linux it is required [ant](http://ant.apache.org/), [openjdk-7-jdk](http://openjdk.java.net/), git.

```
apt-get install ant git openjdk-7-jdk
wget https://raw.githubusercontent.com/gmcarelli/pee-analise-fibonacci/master/install.sh
chmod +x ./install.sh
./install.sh 
```

### Getting Started

To run some tests execute 

```
cd /opt/ifsp/
#
# Analysing Iterative Fibonacci's alrogithm using the firsts 8 number in Fibonaccis' sequel running a batch of 30 tests.  
#
./analise-fibonacci.sh iterativel 8 30 
		
```

#### Authors
* Lyandra Saito, Ana, Gil Carelli

#### License

[MIT]

This code was not widely tested. Thus, unpredictable behaver is a possibility. Its usage is user's responsibility only. Pay attention when running this code to calculate larges Fibonacci's sequels since it can probably freeze your system.
