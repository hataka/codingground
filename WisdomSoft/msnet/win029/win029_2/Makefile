### Makefile.gcc
SRCS = main.cpp
OBJS = $(subst .cc,.o,$(SRCS))
PROG = main
# RES  = $(PROG).coff
RES  =
EXE  = $(PROG)_gcc.exe
CC = gcc
CFLAGS = 
LD = gcc
LDFLAGS = -mwindows -mno-cygwin
# win app:
#	-mwindows
# win app with console:
#	-mwindows -Wl,--subsystem,console
# win app (which can be executed without cygwin1.dll):
#	-mwindows -mno-cygwin
# win app with console (which can be executed without cygwin1.dll):
#	-mwindows -mno-cygwin -Wl,--subsystem,console
RC = windres

.SUFFIXES : .o .c
.SUFFIXES : .coff .rc

ALL: 
	ant

clean:
	rm -rf bin obj *.user *.suo

clear:
	rm -rf bin obj *.user *.suo *.exe *.coff *.o *.bak *.BAK *.plg *.opt *.ncb Debug 

.c.o:
	$(CC) $(CFLAGS) -c $<

.rc.coff:
	$(RC) -i $< -o $@

$(EXE): $(OBJS) $(RES)
	$(LD) $(LDFLAGS) -o $(EXE) $(OBJS) $(RES)

