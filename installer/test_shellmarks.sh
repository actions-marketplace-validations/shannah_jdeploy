#!/bin/bash
set -e
mvn package
cd tests/shellmarks
$JAVA_HOME/bin/java -jar ../../target/jdeploy-installer-1.0-SNAPSHOT.jar
