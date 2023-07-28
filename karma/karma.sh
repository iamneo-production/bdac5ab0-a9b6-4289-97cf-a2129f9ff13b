#!/bin/bash

if [ -d "/home/coder/project/workspace/angularapp" ]
then
    echo "project folder present"
    cp /home/coder/project/workspace/karma/karma.conf.js /home/coder/project/workspace/angularapp/karma.conf.js;

    # checking for login component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/auth/login" ]
    then
        cp /home/coder/project/workspace/karma/login.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/auth/login/login.component.spec.ts;
    else
        echo "FE_login FAILED";
    fi

    # checking for signup component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/auth/signup" ]
    then
        cp /home/coder/project/workspace/karma/signup.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/auth/signup/signup.component.spec.ts;
    else
        echo "FE_signup FAILED";
    fi

    # checking for admin add details component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/admin/adddetails" ]
    then
        cp /home/coder/project/workspace/karma/adddetails.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/admin/adddetails/adddetails.component.spec.ts;
    else
        echo "FE_customerAddDetails FAILED";
    fi

    # checking for admin homepage component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/admin/adminhomepage" ]
    then
        cp /home/coder/project/workspace/karma/adminhomepage.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/admin/adminhomepage/adminhomepage.component.spec.ts;
    else
        echo "FE_adminHomepage FAILED";
    fi

    # checking for admin review component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/admin/adminreview" ]
    then
        cp /home/coder/project/workspace/karma/adminreview.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/admin/adminreview/adminreview.component.spec.ts;
    else
        echo "FE_adminReview FAILED";
    fi

    # checking for user homepage component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/user/userhomepage" ]
    then
        cp /home/coder/project/workspace/karma/userhomepage.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/user/userhomepage/userhomepage.component.spec.ts;
    else
        echo "FE_userHomepage FAILED";
    fi

    # checking for user bookings component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/user/userbookings" ]
    then
        cp /home/coder/project/workspace/karma/userbookings.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/user/userbookings/userbookings.component.spec.ts;
    else
        echo "FE_userBookings FAILED";
    fi

    # checking for user review component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/user/userreview" ]
    then
        cp /home/coder/project/workspace/karma/userreview.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/user/userreview/userreview.component.spec.ts;
    else
        echo "FE_userReview FAILED";
    fi

    cd /home/coder/project/workspace/angularapp/;
    npm test;
else   
    echo "FE_login FAILED";
    echo "FE_signup FAILED";
    echo "FE_customerAddDetails FAILED";
    echo "FE_adminHomepage FAILED";
    echo "FE_adminReview FAILED";
    echo "FE_userHomepage FAILED";
    echo "FE_userBookings FAILED";
    echo "FE_userReview FAILED";
fi