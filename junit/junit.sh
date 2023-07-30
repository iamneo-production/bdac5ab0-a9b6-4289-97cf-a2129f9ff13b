#!/bin/bash
if [ -d "/home/coder/project/workspace/springapp/" ]
then
    echo "project folder present"
    # checking for src folder
    if [ -d "/home/coder/project/workspace/springapp/src/" ]
    then
        cp -r /home/coder/project/workspace/junit/test /home/coder/project/workspace/springapp/src/;
		cd /home/coder/project/workspace/springapp/;
		mvn clean test;
    else
        echo "testGetVehicleAll FAILED";
        echo "testGetVehicleById FAILED";
        echo "testGetBookingAll FAILED";
        echo "testGetBookingById FAILED";
        echo "test_case1 FAILED";
        echo "test_case2 FAILED";
        echo "test_case3 FAILED";
        echo "test_case4 FAILED";
    fi
else
	echo "testGetVehicleAll FAILED";
        echo "testGetVehicleById FAILED";
        echo "testGetBookingAll FAILED";
        echo "testGetBookingById FAILED";
        echo "test_case1 FAILED";
        echo "test_case2 FAILED";
        echo "test_case3 FAILED";
        echo "test_case4 FAILED";
fi
