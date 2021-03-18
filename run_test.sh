sources=`find src -name "*.java"`
set -o xtrace
javac -classpath .:/run_dir/junit-4.12.jar:target/dependency/* -d bin $sources || exit
echo
echo "==========================================================="
echo "==========================================================="
echo "    Test ArrayStack"
echo "==========================================================="
echo "==========================================================="
echo
java -cp bin:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:target/dependency/* org.junit.runner.JUnitCore stack.ArrayStackTest


echo
echo "==========================================================="
echo "==========================================================="
echo "    Test LinkedListStack"
echo "==========================================================="
echo "==========================================================="
echo
java -cp bin:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:target/dependency/* org.junit.runner.JUnitCore stack.LinkedListStackTest
