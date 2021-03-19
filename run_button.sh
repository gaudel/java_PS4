sources=`find src -name "*.java"`
set -o xtrace
javac -classpath /run_dir/junit-4.12.jar:target/dependency/* -d bin $sources || exit
java -classpath bin:/run_dir/junit-4.12.jar:target/dependency/* stack.Main
