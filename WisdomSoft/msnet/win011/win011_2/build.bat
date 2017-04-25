
cd /d %~dp0

@echo off
REM ------ ビルド開始: プロジェクト: pg026, 構成: Release Any CPU ------
setlocal
set TARGET=main
set EXE=%TARGET%.exe
set CSPROJ= %TARGET%.csproj
set SLN = %TARGET%.sln

if "%~1" == "" goto build
if "%~1" == "build" (
	goto build
) else if "%~1" == "run" (
	goto run
) else if "%~1" == "clean" (
	goto clean
) else if "%~1" == "clear" (
	goto clear
) else if "%~1" == "doxygen" (
	goto doxygen
) else if "%~1" == "usage" (
	goto usage
)

:build
@echo on
REM " ===== VCSExpress build ====="
"C:\Program Files (x86)\Microsoft Visual Studio 10.0\Common7\IDE\VCSExpress.exe" %CSPROJ% /rebuild 
@REM cp bin/Debug/*.exe
@REM cp bin/Release/main.exe .
@echo off
@REM cp bin/Release/%EXE% ./
@REM cp bin/Debug/%EXE% ./
if exist bin\Release\%EXE% (
copy bin\Release\%EXE% .\
) else if exist bin/Debug/%EXE% (
copy bin\Debug\%EXE% .\

)

@REM rm -rf bin obj *.user *.suo
@REM pause
goto end

echo off
REM cls
REM @echo on
REM C:\WINDOWS\Microsoft.NET\Framework\v3.5\Csc.exe /noconfig /nowarn:1701,1702 /errorreport:prompt /warn:4 /define:TRACE /reference:C:\WINDOWS\Microsoft.NET\Framework\v2.0.50727\System.dll /reference:C:\WINDOWS\Microsoft.NET\Framework\v2.0.50727\System.Drawing.dll /reference:C:\WINDOWS\Microsoft.NET\Framework\v2.0.50727\System.Windows.Forms.dll /reference:C:\WINDOWS\Microsoft.NET\Framework\v2.0.50727\System.Data.dll /debug:pdbonly /filealign:512 /optimize+ /out:main.exe /target:winexe /win32icon:F:\icons\Win95Icon\W95Icon0349.ico main.cs
REM rm -f *.pdb
rem pause
REM @echo off
REM F:\icons\VWDExpress1.ico  F:\icons\visualstudio.ico F:\icons\gtk201.ico F:\icons\Win95Icon\W95Icon0349.ico
REM Console Application
REM C:\WINDOWS\Microsoft.NET\Framework\v3.5\Csc.exe /noconfig /nowarn:1701,1702 /errorreport:prompt /warn:4 /define:TRACE /debug:pdbonly /filealign:512 /optimize+ /out:main.exe /target:exe /win32icon:F:\icons\Win95Icon\W95Icon0365.ico main.cs

:run
if exist ./%EXE% (
    %EXE%
) else if exist bin/Release/%EXE% (
    ./bin/Debug/%EXE%
) else if exist bin/Debug/%EXE% (
    ./bin/Debug/%EXE%
)
goto end

:clean
echo on
@REM rm -rf bin obj *.user *.suo
	rd /s /q bin obj
	del /Q *.user *.suo doxy_log.txt
goto end

:clear
echo on
@REM rm -rf bin obj *.user *.suo *.exe *.class *.swf
	rd /s /q bin obj doxygen
	del /Q *.exe *.class *.swf *.user *.suo doxy_log.txt
goto end

:doxygen
	"C:/Program Files/doxygen/bin/doxygen.exe" "F:/WisdomSoft/framework/system/msnet/Doxyfile"
goto end

:usage
echo usage:
echo build 
echo build run
echo build clean
echo build clear
goto end
:end
endlocal
