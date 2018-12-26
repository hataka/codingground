cd /d %~dp0

REM Ver 4.6
cmd.exe /k F:\VCSharp\Flashdevelop5.1.1-LL\FlashDevelop\Bin\Debug\Tools\flexsdk\bin\mxmlc.exe %%TARGET%%.mxml -default-size 800 600

@echo off
REM Ver 4.11
REM cmd.exe /k F:\Flash\ApacheFlex\apache-flex-sdk-4.11.0-bin\bin\mxmlc.bat SimpleAlert.mxml -default-size 800 600
REM cmd.exe /k F:\Flash\flex4\flex_sdk_4.1.0.16076\bin\mxmlc.exe SimpleAlert.mxml -default-size 800 600
REM Ver 3.4
REM cmd.exe /k F:\Flash\flex3.4\flex_sdk_3.4.0.9271_mpl\bin\mxmlc.exe SimpleAlert.mxml -default-size 800 600
REM Ver 3.0
REM cmd.exe /k F:\Flash\flex3\flex3sdk\bin\mxmlc.exe SimpleAlert.mxml -default-size 800 600
