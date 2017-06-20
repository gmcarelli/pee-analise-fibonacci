#!/bin/bash
#
# It is a script to run experiments in order to analysis Fibonnaci sequel in both iterative
# and recursive algorithms into a Unix-like operating system. How to use:
#
# analise-fibonacci.sh <algorithm type> <sequel size> <number-of-tests>
# <algorithm type> is the type of the  chosen algorithm, which may be defined as: iterative or recursive
# <sequel size> it is the size of the Fibonacci's sequel to be calculated
# <number-of-test> is the number of test to be executed sequentially 
#
# Getting parameters
#
type=$1
sequelSize=$2
numberOfTests=$3
time="/usr/bin/time"

case "$type" in
iterative)
#   typeadmin="/etc/init.d/postgresql"
   ;;
recursive)
#   typeadmin="/etc/init.d/mongodb"
   ;;
*)
   echo "Usage analise-fibonacci.sh <algorithm type> <sequel size> <number-of-tests>"
   exit 1
esac
#
# Creating file name
#
file="type-performance.csv"
#
# Executing tests 
#
i=1
for i in `seq 1 $numberOfTests`; do
	#
	#
	#
	echo "Executing test $i of $numberOfTests"
   	# 
   	# Clearing memory and swap before execute tests
   	# Script indicated at http://www.tecmint.com/clear-ram-memory-cache-buffer-and-swap-space-on-linux/
   	#
	# echo 3 > /proc/sys/vm/drop_caches && swapoff -a && swapon -a
   	#
   	# Running application 
   	#
	$time -o time.txt -f %U,%S java -jar pee-analise-fibonacci.jar $type sequelSize=$2
	#
	#
	#	 
	t=`cat time.txt`
	#
	#
	#
	echo "$type,$sequelSize,$numberOfTests,$t" >> $file
done