

#BASEDIR := . #パッケージのベースとなるディレクトリ
#SOURCE := $(wildcard *.java)
#CLASS := $(SOURCE:.java=.class)

%.class: %.java
	javac -cp "$(CLASSDIR)" -encoding utf-8 $<
#	javac -cp "$(BASEDIR):$(CLASSDIR)" -d $(CLASSDIR) $<

all: 
	"C:/Windows/Microsoft.NET/Framework/v3.5/Csc.exe" /noconfig /nowarn:1701,1702 /errorreport:prompt /warn:4 /define:TRACE /reference:"C:/Program Files (x86)/Reference Assemblies/Microsoft/Framework/v3.5/System.Core.dll" /reference:"C:/Program Files (x86)/Reference Assemblies/Microsoft/Framework/v3.5/System.Data.DataSetExtensions.dll" /reference:C:/Windows/Microsoft.NET/Framework/v2.0.50727/System.Data.dll /reference:C:/Windows/Microsoft.NET/Framework/v2.0.50727/System.Deployment.dll /reference:C:/Windows/Microsoft.NET/Framework/v2.0.50727/System.dll /reference:C:/Windows/Microsoft.NET/Framework/v2.0.50727/System.Drawing.dll /reference:C:/Windows/Microsoft.NET/Framework/v2.0.50727/System.Windows.Forms.dll /reference:C:/Windows/Microsoft.NET/Framework/v2.0.50727/System.Xml.dll /reference:"C:/Program Files (x86)/Reference Assemblies/Microsoft/Framework/v3.5/System.Xml.Linq.dll" /debug:pdbonly /out:join01.exe /target:exe join01.cs

mono:
	mcs *.cs -out:join01.exe 

clean:
	rm -f *.exe

