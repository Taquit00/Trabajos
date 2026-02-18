@echo off
set /p mensaje=Escribe el mensaje del commit: 

cd C:\Users\UIS\Documents\NetBeansProjects\Trabajos

git add .
git commit -m "%mensaje%"
git push

pause
