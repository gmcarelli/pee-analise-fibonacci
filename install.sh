#
# Getting medical-database-analysis application from GitHub
#
cd /opt
if [ ! -d "ifsp" ]; then # if folder ifsp does not exits
   mkdir ifsp	
fi
cd ifsp
git clone https://github.com/gmcarelli/pee-analise-fibonacci.git
#
# Compiling source code
#
cd pee-analise-fibonacci
ant
cd ..
