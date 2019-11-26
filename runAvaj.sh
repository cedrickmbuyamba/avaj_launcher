#!/bin/sh
javac -d . start/avaj/**/*.java
java -cp . start.avaj.simulator.Simulator $@
