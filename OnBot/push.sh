#!/bin/bash

# Change to the directory where the script is located
cd "$(dirname "$0")"

wipe() {
  # Command to wipe using ftc_http.exe
  # ftc_http.exe --host http://ericgarland.com:8080 -w
  ./ftc_http -w
}

push() {
  # Command to push using ftc_http.exe
  # ftc_http.exe --host http://ericgarland.com:8080 -u "../TeamCode/src/main/java/org/firstinspires/ftc/teamcode" -b
  ./ftc_http -u "../TeamCode/src/main/java/org/firstinspires/ftc/teamcode" -b
}


# Check if the first argument is '-w'
if [ "$1" == "-w" ]; then
  wipe
else
  push
fi


